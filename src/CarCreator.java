import java.util.ArrayList;
import java.util.List;

public class CarCreator {

    public CarCreator() {
    }

    public List<Car> createGuestsCar() {
        List<Car> listCar = new ArrayList<>();
        String userInput = RaceFeatureUtils.getUserInput("Enter the number of Guests of Race");
        if (userInput != null){
        int count = Integer.parseInt(userInput);
        List<String> numbers = RaceFeatureUtils.createListOfUniqueCarNumbers(count);
        for (int i = 0; i < count; i++) {
            Car car = new AutoCar(numbers.get(i));
            listCar.add(car);
        }
        }
        return listCar;
    }

    public void createTeamsCar() {


    }
}
