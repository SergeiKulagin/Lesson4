public class AutoCar extends Car {

    private String autoCarNumber;

    public AutoCar() {
    }

    public AutoCar(String carNumber) {
        this.autoCarNumber = carNumber;
    }

    public String getAutoCarNumber() {
        return autoCarNumber;
    }

    public void setAutoCarNumber(String autoCarNumber) {
        this.autoCarNumber = autoCarNumber;
    }

    public void toBeep() {
        System.out.println("bee-beep");
    }
}
