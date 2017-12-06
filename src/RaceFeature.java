import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RaceFeature {
    private CarPark raceFeatureCarPark;
    private ArrayList<Team> teamsRaceFeature;
    private ArrayList<Box> boxRaceFeature;
    private File listOfTeams;

    public RaceFeature() {
    }

    public ArrayList<Box> getBoxRaceFeature() {
        return boxRaceFeature;
    }

    public void setBoxRaceFeature(ArrayList<Box> boxRaceFeature) {
        this.boxRaceFeature = boxRaceFeature;
    }

    public File getListOfTeams() {
        return listOfTeams;
    }

    public void setListOfTeams(File listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    public ArrayList<Team> getTeamsRaceFeature() {
        return teamsRaceFeature;
    }

    public void setTeamsRaceFeature(ArrayList<Team> teamsRaceFeature) {
        this.teamsRaceFeature = teamsRaceFeature;
        ArrayList <Box> listBox = new ArrayList<>();
        for (Team teams : teamsRaceFeature) {
            Box box = new Box();
            box.setTeam(teams);
            box.setTeamUseName(teams.getTitle());
            box.addCar(teams.getRacingCar());
            box.addCar(teams.getSupportCar1());
            box.addCar(teams.getSupportCar2());
            listBox.add(box);
            setBoxRaceFeature(listBox);
        }
    }

    public CarPark getRaceFeatureCarPark() {
        return raceFeatureCarPark;
    }

    public void setRaceFeatureCarPark(CarPark raceFeatureCarPark) {
        this.raceFeatureCarPark = raceFeatureCarPark;
    }

    public void checkInCarPark() {        // регистрация на автостоянке гонок машин зрителей
        String countGuests = UserHelper.getUserInput("Введите кол-во зрителей на машинах");
        int numberGuests = Integer.parseInt(countGuests);
        String[] listNumbers = UserHelper.randomMassiveNumbers(numberGuests);
        CarPark carPark = new CarPark();
        carPark.setSizeLimit(numberGuests);
        for (int count = 0; count < numberGuests; count++) {
            AutoCar car = new AutoCar(listNumbers[count]);
            carPark.addCar(car);
        }
        setRaceFeatureCarPark(carPark);
        File newFile = UserHelper.writeAFile(listNumbers);
        this.raceFeatureCarPark.setCarNumbersList(newFile);
    }

    public void checkTeams(File userFile) {
        // readFile считываю файл и разделяю его на массив строк имен + массив номеров машин
        // для каждой команды установливаем ее имя
        // ArrayList<Team> teams = new ArrayList();
        // String teamName = nameFromFile;
        //  Team team = new Team();
        // team.setTitle (teamName)
        //  team.setNumberTeamCars();
        //  teams.add(team);
        //  this.setTeamsRaceFeature(teams);
        // после из названий команд содаю массив
        // setListOfTeams(вызываю метод записать файл из этого массива)
    }
}
