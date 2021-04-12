import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Family_Tree {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\java\\test.txt");
            int i;
            String ip = "";
            String port = "";
            while ((i = reader.read()) != -1)

                System.out.print((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
