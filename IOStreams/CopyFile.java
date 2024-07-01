import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

        File inFile = new File(inputFile);
        File outFile = new File(outputFile);
        FileReader in = new FileReader(inFile);
        FileWriter out = new FileWriter(outFile);

        int c;
        while((c = in.read()) != -1){
            out.write(c);
        }

        in.close();
        out.close();

        sc.close();
    }
}
