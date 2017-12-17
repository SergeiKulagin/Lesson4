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
        List<String> cars = RaceFeatureUtils.divideTeamCarsNumbers();
        while (cars != null) {
            int i = 0;
            RacingCar racingCar = new RacingCar(cars.get(i));
            teamCars.add(racingCar);
            int j = 1;
            RacingCar racingCar1 = new RacingCar(cars.get(j));
            teamCars.add(racingCar1);
            int k = 2;
            SupportCar supportCar = new SupportCar(cars.get(k));
            teamCars.add(supportCar);
            cars.remove(k);
            cars.remove(j);
            cars.remove(i);
        }
        return teamCars;
    }
}
