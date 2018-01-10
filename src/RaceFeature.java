import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RaceFeature {

    public static void main(String[] args) {
    CarPark carPark = new CarPark();
    List<BoxesZone> teamBoxes = new ArrayList<>();
    CarCreator carCreator = new CarCreator();
    String[] d;
    try {d = RaceFeatureUtils.readFile();
      carCreator.createSupportTypeForTeams(10);
    } catch (NullPointerException e){}
    TeamInfo teamInfo = new TeamInfo();
    Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        Team team3 = new Team("team3");
        Team team4 = new Team("team4");
        Team team5 = new Team("team5");
        team1.setLegalAddress("1224,qwe");
        team2.setLegalAddress("12.23t");
        team3.setLegalAddress("qwrtet");
        team4.setLegalAddress("12345,qwerty.78");
        team5.setLegalAddress("1b");
        teamInfo.addTeamInfo(team1);
        teamInfo.addTeamInfo(team2);
        teamInfo.addTeamInfo(team3);
        teamInfo.addTeamInfo(team4);
        teamInfo.addTeamInfo(team5);
        teamInfo.removeTeamInfo(team4);
        teamInfo.updateTeamInfo(team5,"asdsdffgg.23");
        System.out.println(teamInfo.chooseLongestAddress());

  //List<Car> listGuestCars = carCreator.createGuestCars();
  //System.out.println(listGuestCars.size());
  //RacingCar r = new RacingCar();
  //r.setCasualCharacteristicRacingCar();
  //Team t = new Team(3, 2);
  //String s = RaceFeatureUtils.calculateRankCar(r, t);
  //System.out.println(s);
        //List<Car> listTeamCars = carCreator.createTeamCars();
        // carPark = CheckingSystem.registerCarsOfGuests(listGuestCars);
        // teamBoxes = CheckingSystem.registerCarsOfTeam(listTeamCars);

}
}
