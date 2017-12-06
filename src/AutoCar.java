public class AutoCar extends Car {

    private String number;

    public AutoCar() {
    }

    public AutoCar(String number) {
        this.number = number;
    }

    public void horn() {
        System.out.println("бип-бип");
    }
}
