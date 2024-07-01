import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name : ");
        String fileName = sc.nextLine();

        System.out.print("Enter the character to be counted : ");
        char ch = sc.next().charAt(0);

        File inputFile = new File(fileName);
        FileReader inputFileReader = new FileReader(inputFile);
        int count = 0;
        int c;
        while((c=inputFileReader.read()) != -1){
            if (c == ch){
                count++;
            }
        }
        inputFileReader.close();

        System.out.println("File '" + fileName + "' has " + count + " instances of '" + ch + "'");
    }
}
