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
        List<String> teams = RaceFeatureUtils.divideTeamTitle();
        List<String> cars = RaceFeatureUtils.divideTeamCarsNumbers();
        for (int i = 0; i < teams.size(); i++){
            Team team = new Team();
            RacingCar racingCar = new RacingCar(cars.get(i));
            RacingCar racingCar1 = new RacingCar(cars.get(i+1));
            SupportCar supportCar = new SupportCar();
        }
        return teamCars;
    }
}
