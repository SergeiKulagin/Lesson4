import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RaceFeatureUtils {

    public static String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            is.close();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public static String createUniqueNumber() {
        Random random = new Random();
        int max = 999;
        int min = 0;
        char[] abc = "������������".toCharArray();
        int abcLength = abc.length;
        char a1 = abc[random.nextInt(abcLength)];
        Integer b = random.nextInt(max - min) + min;
        char a2 = abc[random.nextInt(abcLength)];
        char a3 = abc[random.nextInt(abcLength)];
        return a1 + b.toString() + a2 + a3;
    }

    public static List<String> createListOfUniqueCarNumbers(int quantityOfNumbers) {
        List<String> numbers = new ArrayList<>(quantityOfNumbers);
        int i = 0;
        while (i < quantityOfNumbers) {
            String number = RaceFeatureUtils.createUniqueNumber();
            if (isaBoolean(numbers, number)) {
                numbers.add(number);
                i = i + 1;
            }
        }
        return numbers;
    }

    private static boolean isaBoolean(List<String> numbers, String number) {
        return !numbers.contains(number);
    }

    public static List<String> readInfoFile() {
        ArrayList <String> infoAboutTeams = new ArrayList<>();
        String folderPath = "C://Users//User//Desktop";
        Path path = Paths.get(folderPath, "infoTeams.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String [] infoTeams = line.split(",");
                infoAboutTeams = new ArrayList<String>(Arrays.asList(infoTeams));
                System.out.println(infoAboutTeams.get(2));
                System.out.println(infoAboutTeams.get(3));
            }
        } catch (IOException e) {
        }
        return infoAboutTeams;
    }

    public static File writeFileWithNumbersOfCars(List<String> listCarNumbers) {
        File newFile = new File("C:\\Users\\User\\Desktop\\myFile.txt");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        FileWriter writer;
        try {
            writer = new FileWriter(newFile);
            for (String line : listCarNumbers) {
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            Logger.getLogger(RaceFeatureUtils.class.getName()).log(Level.SEVERE, null, e);
        }
        return newFile;
    }
}
