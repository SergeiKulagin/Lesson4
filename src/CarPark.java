import java.io.File;
import java.util.ArrayList;

public class CarPark {
    private int sizeLimit;            // ������ �������
    private ArrayList<Car> carPark;  // ������ �� �������
    private File carNumbersList;    // ��������� ���� � �������� ����� �� �������

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

    public void addCar(Car car) {                                 // �������� ������
        int carParkSize = carPark.size();
        if (sizeLimit > carParkSize) {
            carPark.add(car);
        } else {
            System.out.println("��������� ���� ���");
        }
    }

    public void removeCar(int numberPlace, String typeCar) {     // ������ ������
        int carParkSize = carPark.size();
        if (numberPlace < carParkSize) {
            Car car = carPark.get(numberPlace);
            if (typeCar.equals("truck")) {
                if (car instanceof TruckCar) {
                    carPark.remove(numberPlace);
                } else {
                    System.out.println("�������� ����� ��� � ���� �����");
                }
            } else {
                if (typeCar.equals("auto")) {
                    if (car instanceof AutoCar) {
                        carPark.remove(numberPlace);
                    } else {
                        System.out.println("�������� ����� ��� � ���� �����");
                    }
                }
            }
        } else {
            System.out.println("�� ������� ��� �����, ������� ����� �������");
        }
    }
}
