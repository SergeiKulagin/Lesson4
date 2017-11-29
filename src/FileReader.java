import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

    public void readAFile(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        File newFile = new File("C:\\Users\\User\\Desktop\\myFile.txt");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        FileWriter writer;
        try {
            writer = new FileWriter(newFile);
            if (inputLine != null) {
                writer.write(inputLine);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //public static void main(String[] args) {       // ÄËß ÏÐÎÂÅÐÊÈ
    //    FileReader fileReader = new FileReader();
    //    fileReader.readAFile("Ââåäèòå òåêñò");
    //}

}



