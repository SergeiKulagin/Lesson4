public class RacingCar extends AutoCar {

    private String racingCarTeamsName;
    private int aerodynamics;
    private int racingCarReliability;
    private int enginePower;
    private char racingCarRank;

    public RacingCar() {
    }

    public RacingCar(String teamsName) {
        this.racingCarTeamsName = teamsName;
    }

    public String getRacingCarTeamsName() {
        return racingCarTeamsName;
    }

    public void setRacingCarTeamsName(String racingCarTeamsName) {
        this.racingCarTeamsName = racingCarTeamsName;
    }

    public int getAerodynamics() {
        return aerodynamics;
    }

    private void setAerodynamics(int aerodynamics) {
        this.aerodynamics = aerodynamics;
    }

    public int getRacingCarReliability() {
        return racingCarReliability;
    }

    private void setRacingCarReliability(int racingCarReliability) {
        this.racingCarReliability = racingCarReliability;
    }

    public int getEnginePower() {
        return enginePower;
    }

    private void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setCasualCharacteristicRacingCar() {
        int[] listCharacteristic = RaceFeatureUtils.getCasualCharacteristicRacingCar();
        setAerodynamics(listCharacteristic[0]);
        setEnginePower(listCharacteristic[1]);
        setRacingCarReliability(listCharacteristic[2]);
    }

    public void toBeep() {
        System.out.println("beeep");
    }
}