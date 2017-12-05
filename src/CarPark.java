import java.io.File;
import java.util.ArrayList;

public class CarPark {
    private int sizeLimit;            // размер сто€нки
    private ArrayList<Car> carPark;  // машины на сто€нке
    private File carNumbersList;    // текстовый файл с номерами машин на сто€нке

    public ArrayList<Car> getCarPark() {
        return carPark;
    }

    public File getCarNumbersList() {
        return carNumbersList;
    }

    public void setCarNumbersList(File carNumbersList) {
        this.carNumbersList = carNumbersList;
    }

    public void setCarPark(ArrayList<Car> carPark) {
        this.carPark = carPark;
    }

    public int getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public void addCar(Car car) {                                 // добавл€ю машину
        int carParkSize = carPark.size();
        if (sizeLimit > carParkSize) {
            carPark.add(car);
        } else {
            System.out.println("—вободных мест нет");
        }
    }

    public void removeCar(int numberPlace, String typeCar) {     // удал€ю машину
        int carParkSize = carPark.size();
        if (numberPlace < carParkSize) {
            Car car = carPark.get(numberPlace);
            if (typeCar.equals("truck")) {
                if (car instanceof TruckCar) {
                    carPark.remove(numberPlace);
                } else {
                    System.out.println("√рузовых машин нет в этом боксе");
                }
            } else {
                if (typeCar.equals("auto")) {
                    if (car instanceof AutoCar) {
                        carPark.remove(numberPlace);
                    } else {
                        System.out.println("Ћегковых машин нет в этом боксе");
                    }
                }
            }
        } else {
            System.out.println("Ќа сто€нке нет машин, которые можно удалить");
        }
    }

    public String [] checkInCar (int numberCar){     // создаю массив случайных неповтор€ющихс€ автономеров
      String [] numberCarNumbers = new String [numberCar];
      int count = 0;
      numberCarNumbers [0] = UserHelper.generateNumber();
      while (count < numberCar){
          count = count + 1;
          int locCount = count;
          numberCarNumbers [count] = UserHelper.generateNumber();
          for (int k = 0; k < numberCarNumbers.length; k++){
              if (numberCarNumbers[locCount].equals(numberCarNumbers[k])){
                  count = count - 1;
              }
          }
      }
      return numberCarNumbers;
    }
}
