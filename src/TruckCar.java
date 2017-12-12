public class TruckCar extends Car {

    private String truckCarNumber;

    public TruckCar() {
    }

    public TruckCar(String carNumber) {
        this.truckCarNumber = carNumber;
    }

    public void toBeep() {
        System.out.println("BEEP-BEEP");
    }
}
