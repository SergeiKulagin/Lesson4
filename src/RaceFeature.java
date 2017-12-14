import java.io.File;
import java.util.List;

public class RaceFeature {

    public static void main(String[] args) {
    CarCreator carCreator = new CarCreator();
    List<Car> listGuestCars = carCreator.createGuestsCar();
    List<Car> listTeamCars = carCreator.createTeamsCar();
    CheckingSystem.registerCarsOfGuests(listGuestCars);
    CheckingSystem.registerCarsOfTeam(listTeamCars);
    }
}
