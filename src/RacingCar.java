public class RacingCar extends AutoCar {

    private String racingCarTeamsName;

    public RacingCar() {
    }

    public RacingCar(String teamsName) {
        this.racingCarTeamsName = teamsName;
    }

    public void toBeep() {
        System.out.println("beeep");
    }
}