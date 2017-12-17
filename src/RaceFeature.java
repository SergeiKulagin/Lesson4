import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RaceFeature {

    public static void main(String[] args) {
    CarPark carPark = new CarPark();
    List<BoxesZone> teamBoxes = new ArrayList<>();
    CarCreator carCreator = new CarCreator();
    List<Car> listGuestCars = carCreator.createGuestCars();
    List<Car> listTeamCars = carCreator.createTeamCars();
    carPark = CheckingSystem.registerCarsOfGuests(listGuestCars);
    teamBoxes = CheckingSystem.registerCarsOfTeam(listTeamCars);
    }
}
