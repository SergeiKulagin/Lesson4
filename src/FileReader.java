import java.io.*;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {

    public FileReader() {
    }

    public void readFile(File myFile) {
        try {
            java.io.FileReader fileReader = new java.io.FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // типа проверку делаю
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        File myFile = new File("C:\\Users\\User\\Desktop\\text.txt");
        fileReader.readFile(myFile);
    }
    // еще какой-то непонятный способ - не пойму даже как его проверить
    // private static String readUsingScanner(String fileName) throws IOException {
    //    Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
    //     String data = scanner.useDelimiter(" ").next();
    //     scanner.close();
    //     return data;
    // }

}


