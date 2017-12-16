import java.util.ArrayList;
import java.util.List;

public class CheckingSystem {

    public static List<BoxesZone> registerCarsOfTeam(List<Car> teamCars) {
        List <BoxesZone> teamBoxesZone = new ArrayList<>();
        List<String> infoList = RaceFeatureUtils.divideTeamTitle();
        for (int i = 0; i < teamCars.size(); i=+3){
            BoxesZone boxesZone = new BoxesZone();
            boxesZone.addCar(teamCars.get(i));
            boxesZone.addCar(teamCars.get(i+1));
            boxesZone.addCar(teamCars.get(i+2));
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
