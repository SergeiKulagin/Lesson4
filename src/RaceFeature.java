import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RaceFeature {

    public static void main(String[] args) {
    CarPark carPark = new CarPark();
    List<BoxesZone> teamBoxes = new ArrayList<>();
    CarCreator carCreator = new CarCreator();
   // List<Car> listGuestCars = carCreator.createGuestCars();
   //     System.out.println(listGuestCars.size());
   // List<Car> listTeamCars = carCreator.createTeamCars();
  //  carPark = CheckingSystem.registerCarsOfGuests(listGuestCars);
  //  teamBoxes = CheckingSystem.registerCarsOfTeam(listTeamCars);
    carCreator.createSupportTypeForTeams(10);
    RacingCar r = new RacingCar();
    r.setCasualCharacteristicRacingCar();
    Team t = new Team(3, 8);
    String s = RaceFeatureUtils.calculateRankCar(r, t);
        System.out.println(s);


}
}
