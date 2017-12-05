import java.io.*;

public class CheckInSystem {
    private File checkInFile;

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

}
