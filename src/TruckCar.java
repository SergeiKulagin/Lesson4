public class TruckCar extends Car {

    private String truckCarNumber;

    public TruckCar() {
    }

    public TruckCar(String carNumber) {
        this.truckCarNumber = carNumber;
    }

    public String getTruckCarNumber() {
        return truckCarNumber;
    }

    public void setTruckCarNumber(String truckCarNumber) {
        this.truckCarNumber = truckCarNumber;
    }

    public void toBeep() {
        System.out.println("BEEP-BEEP");
    }
}
