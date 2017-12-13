import java.util.ArrayList;
import java.util.List;

public class CarCreator {

    public CarCreator() {
    }

    public List<Car> createGuestsCar() {
        List<Car> guestCars = new ArrayList<>();
        String userInput = RaceFeatureUtils.getUserInput("Enter the number of Guests of Race");
        if (userInput != null) {
            int count = Integer.parseInt(userInput);
            List<String> numbers = RaceFeatureUtils.createListOfUniqueCarNumbers(count);
            for (int i = 0; i < count; i++) {
                Car car = new AutoCar(numbers.get(i));
                guestCars.add(car);
            }
        }
        return guestCars;
    }

    public List<Car> createTeamsCar() {
        List<Car> teamCars = new ArrayList<>();
        List<String> infoList = RaceFeatureUtils.readInfoFile();

        return teamCars;
    }
}
