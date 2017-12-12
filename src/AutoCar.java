public class AutoCar extends Car {

    private String autoCarNumber;

    public AutoCar() {
    }

    public AutoCar(String carNumber) {
        this.autoCarNumber = carNumber;
    }

    public void toBeep() {
        System.out.println("bee-beep");
    }
}
