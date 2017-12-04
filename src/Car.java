import java.util.Random;

abstract class Car {
    private String model;
    private String colour;

    abstract void horn();

    public String generateNumber() {
        Random random = new Random();
        int max = 999;
        int min = 0;
        char[] alphabet = "юбейлмнпярсу".toCharArray();
        int alphabetLength = alphabet.length;
        char a1 = alphabet[random.nextInt(alphabetLength)];
        Integer b = random.nextInt(max - min) + min;
        char a2 = alphabet[random.nextInt(alphabetLength)];
        char a3 = alphabet[random.nextInt(alphabetLength)];
        String number = a1 + b.toString() + a2 + a3;
        return number;
    }
}


