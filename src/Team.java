
public class Team {
    private int numberOfParticipants;
    private String title;
    CarPark box;
    RacingCar racingCar;
    TruckCar truckCar1;
    TruckCar truckCar2;

    public Team() {
    }

    public Team(String title) {
        this.title = title;
    }

    public RacingCar getRacingCar() {

        return racingCar;
    }

    public void setRacingCar(RacingCar racingCar) {
        this.racingCar = racingCar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CarPark getBox() {
        return box;
    }

    public void setBox(CarPark box) {
        this.box = box;
    }
}
