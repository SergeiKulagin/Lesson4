import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private int carParkSizeLimit;
    private List<Car> carPark;
    private File carParkListOfNumbers;

    public File getCarParkListOfNumbers() {
        return carParkListOfNumbers;
    }

    public void setCarParkListOfNumbers(File carParkListOfNumbers) {
        this.carParkListOfNumbers = carParkListOfNumbers;
    }

    public int getCarParkSizeLimit() {
        return carParkSizeLimit;
    }

    public void setCarParkSizeLimit(int carParkSizeLimit) {
        this.carParkSizeLimit = carParkSizeLimit;
    }

    public void addCar(Car car) {
        int carParkSize = carPark.size();
        if (carParkSizeLimit > carParkSize) {
            carPark.add(car);
        } else {
            System.out.println("There isn't free places");
        }
    }

    public void removeCar(int numberPlace, String typeCar) {
        int carParkSize = carPark.size();
        if (numberPlace < carParkSize) {
            Car car = carPark.get(numberPlace);
            if (typeCar.equals("truck")) {
                if (car instanceof TruckCar) {
                    carPark.remove(numberPlace);
                } else {
                    System.out.println("There isn't a TruckCar");
                }
            } else {
                if (typeCar.equals("auto")) {
                    if (car instanceof AutoCar) {
                        carPark.remove(numberPlace);
                    } else {
                        System.out.println("There isn't an AutoCar");
                    }
                }
            }
        } else {
            System.out.println("There isn't any Cars");
        }
    }
}
