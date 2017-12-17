import java.util.ArrayList;
import java.util.List;

public class CheckingSystem {

    public static List<BoxesZone> registerCarsOfTeam(List<Car> teamCars) {
        List <BoxesZone> teamBoxesZone = new ArrayList<>();
        List <String> teamsTitle = RaceFeatureUtils.divideTeamTitle();
        List<Team> teamList = RaceFeatureUtils.createTeams(teamsTitle);
        for (int i = 0; i < teamsTitle.size(); i++){
            BoxesZone boxesZone = new BoxesZone();
            boxesZone.setTeam(teamList.get(i));
            List <Car> listCar = teamCars.subList(0,2);
            boxesZone.addCar(listCar.get(0));
            boxesZone.addCar(listCar.get(1));
            boxesZone.addCar(listCar.get(2));
            teamBoxesZone.add(boxesZone);
            teamCars.remove(2);
            teamCars.remove(1);
            teamCars.remove(0);
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
