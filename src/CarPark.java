import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private List<Car> carPark;
    private File carParkListOfNumbers;

    public File getCarParkListOfNumbers() {
        return carParkListOfNumbers;
    }

    public void setCarParkListOfNumbers(File carParkListOfNumbers) {
        this.carParkListOfNumbers = carParkListOfNumbers;
    }

    public CarPark() {
    }

    public CarPark(int capacity) {
        this.carPark = new ArrayList<>(capacity);
    }

    public void addCar(Car car) {
        carPark.add(car);
    }

    public void removeCar(int numberPlace) {
        int carParkSize = carPark.size();
        if (numberPlace < carParkSize) {
            carPark.remove(numberPlace);
        } else {
            System.out.println("There isn't any Cars");
        }
    }
}
