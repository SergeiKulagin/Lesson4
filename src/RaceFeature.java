import java.io.File;
import java.util.List;

public class RaceFeature {
    public CarPark raceFeatureCarPark;
    public List<Team> myTeam;

    public RaceFeature() {
    }

    public CarPark getRaceFeatureCarPark() {

        return raceFeatureCarPark;
    }

    public void setRaceFeatureCarPark(CarPark raceFeatureCarPark) {

        this.raceFeatureCarPark = raceFeatureCarPark;
    }

    public void checkInCarPark(int numbersTeam) {        // регистрация на автостоянке гонок машин зрителей
        String[] listNumbers = UserHelper.randomMassiveNumbers(numbersTeam);
        for (int count = 0; count < numbersTeam; count++) {
            AutoCar car = new AutoCar(listNumbers[count]);
            raceFeatureCarPark.addCar(car);
            File newFile = UserHelper.readAFile(listNumbers);
            raceFeatureCarPark.setCarNumbersList(newFile);
        }

    }
}
