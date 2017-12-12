public class RacingCar extends AutoCar {

    private String racingCarTeamsName;

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

    public void toBeep() {
        System.out.println("beeep");
    }
}