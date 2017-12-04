import java.util.ArrayList;

public class CarPark {
    private int sizeLimit;
    ArrayList <Car> carPark;

    public int getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public void addCar(Car car) {
        int carParkSize = carPark.size();
        if (sizeLimit > carParkSize) {
            carPark.add(car);
            car.horn();
        } else {
            System.out.println("Свободных мест нет");
        }
    }

    public void removeCar(int numberPlace, String typeCar) {
        int carParkSize = carPark.size();
        if (numberPlace < carParkSize) {
            Car car = carPark.get(numberPlace);
            if (typeCar.equals("truck")) {
                if (car instanceof TruckCar) {
                    carPark.remove(numberPlace);
                    car.horn();
                    car.horn();
                } else {
                    System.out.println("Грузовых машин нет в этом боксе");
                }
            } else {
                if (typeCar.equals("auto")) {
                    if (car instanceof AutoCar) {
                        carPark.remove(numberPlace);
                        car.horn();
                        car.horn();
                    } else {
                        System.out.println("Легковых машин нет в этом боксе");
                    }
                }
            }

        } else {
            System.out.println("На стоянке нет машин, которые можно удалить");

        }
    }
}
