import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class UserHelper {

    static public String getUserInput (String prompt){    // получаю пользовательский ввод количества машин
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    static public String generateNumber() {              // генерирую случайный номер машины
        Random random = new Random();
        int max = 999;
        int min = 0;
        char[] alphabet = "ј¬≈ ћЌќ–—“”’".toCharArray();
        int alphabetLength = alphabet.length;
        char a1 = alphabet[random.nextInt(alphabetLength)];
        Integer b = random.nextInt(max - min) + min;
        char a2 = alphabet[random.nextInt(alphabetLength)];
        char a3 = alphabet[random.nextInt(alphabetLength)];
        return a1 + b.toString() + a2 + a3;
    }

    static public String [] randomMassiveNumbers (int numberCar){     // создаю массив случайных неповтор€ющихс€ автономеров
        String [] numberCarNumbers = new String [numberCar];
        int count = 0;
        numberCarNumbers [0] = UserHelper.generateNumber();
        while (count < numberCar){
            count = count + 1;
            int locCount = count;
            numberCarNumbers [count] = UserHelper.generateNumber();
            for (int k = 0; k < numberCarNumbers.length; k++){
                if (numberCarNumbers[locCount].equals(numberCarNumbers[k])){
                    count = count - 1;
                }
            }
        }
        return numberCarNumbers;
    }

    static public File readAFile(String[] listCarNumbers) {
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
            Logger.getLogger(UserHelper.class.getName()).log(Level.SEVERE, null, e);
        }
        return newFile;
    }
}
