import java.util.*;
import java.io.*;

public class WordFrequency {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two arguments");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];
        Map<String, Integer> wordCounts = new HashMap<>();

        try(FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()){
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCounts.entrySet());
        sortedEntries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        try (FileWriter fileWriter = new FileWriter(outputFileName);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                bufferedWriter.write(entry.getKey() + " : " + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }
    }
}
