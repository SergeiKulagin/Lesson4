import java.util.ArrayList;
import java.util.List;

public class CarCreator {

    public CarCreator() {
    }

    public List<Car> createGuestCars() {
        List<Car> guestCars = new ArrayList<>();
        String userInput = RaceFeatureUtils.getUserInput("Enter the number of Guests of Race");
        if (userInput != null) {
            int count = Integer.parseInt(userInput);
            List<String> numbers = RaceFeatureUtils.createListOfUniqueCarNumbers(count);
            for (int i = 0; i < count; i++) {
                AutoCar car = new AutoCar(numbers.get(i));
                guestCars.add(car);
            }
        }
        return guestCars;
    }

    public List<Car> createTeamCars() {
        List<Car> teamCars = new ArrayList<>();
        List<String> teamCarsNumbers = RaceFeatureUtils.divideTeamCarsNumbers();
        while (teamCarsNumbers != null) {
            int i = 0;
            RacingCar racingCar = new RacingCar(teamCarsNumbers.get(i));
            teamCars.add(racingCar);
            int j = 1;
            RacingCar racingCar1 = new RacingCar(teamCarsNumbers.get(j));
            teamCars.add(racingCar1);
            int k = 2;
            SupportCar supportCar = new SupportCar(teamCarsNumbers.get(k));
            teamCars.add(supportCar);
            teamCarsNumbers.remove(k);
            teamCarsNumbers.remove(j);
            teamCarsNumbers.remove(i);
        }
        return teamCars;
    }

    public void createSupportTypeForTeams(int teamsCount) {
        List<SupportType> supportTypeList = new ArrayList<>();
        SupportType[] types = SupportType.values();
        String[] names = RaceFeatureUtils.readFile();
        for (int i = 0; i < teamsCount; i++) {
            String name = names[i];
            for (SupportType type : types) {
                if (type.getName().equals(name)) {
                    supportTypeList.add(type);
                }
            }
        }
    }
}
