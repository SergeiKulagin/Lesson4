import java.util.ArrayList;
import java.util.List;

public class CarCreator {

    public CarCreator() {
    }
    public List<Car> createGuestsCar (){
        int count = Integer.parseInt(RaceFeatureUtils.getUserInput("Enter the number of Guests of Race"));
        List<Car> listCar = new ArrayList<>(count);
        List<String> numbers = RaceFeatureUtils.createListOfUniqueCarNumbers(count);
        for (int i=0; i<count; i++){
            Car car = new AutoCar(numbers.get(i));
            listCar.add(car);
        }
        return listCar;
    }
    public void createTeamsCar (){

    }
}
