public class TruckCar extends Car {

    private String number;

    public TruckCar() {
    }

    public TruckCar(String number) {
        this.number = number;
    }

    public void horn() {
        System.out.println("ахо-ахо");
    }
}
