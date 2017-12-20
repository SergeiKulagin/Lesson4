import java.util.ArrayList;
import java.util.List;

public class CheckingSystem {

    public static List<BoxesZone> registerCarsOfTeam(List<Car> teamCars) {
        List<BoxesZone> teamBoxesZone = new ArrayList<>();
        List<Team> teamList = RaceFeatureUtils.createTeams();
        for (int i = 0; i < teamList.size(); i++) {
            BoxesZone boxesZone = new BoxesZone();
            boxesZone.setTeam(teamList.get(i));
            for (int j = (i * 3); j < ((i * 3) + 3); j++) {
                boxesZone.addCar(teamCars.get(j));
            }
            teamBoxesZone.add(boxesZone);
        }
        return teamBoxesZone;
    }

    public static CarPark registerCarsOfGuests(List<Car> guestCars) {
        CarPark guestCarPark = new CarPark();
        for (int i = 0; i < guestCars.size(); i++) {
            guestCarPark.addCar(guestCars.get(i));
        }
        return guestCarPark;
    }
}
