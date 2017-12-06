public class RacingCar extends Car {

    private String teamsBrand;

    public RacingCar() {
    }

    public RacingCar(String teamsBrand) {
        this.teamsBrand = teamsBrand;
    }

    public void horn() {
        System.out.println("бииип");
    }
}