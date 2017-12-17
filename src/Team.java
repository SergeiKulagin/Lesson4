
public class Team {
    private String teamTitle;
    private RacingCar firstTeamRacingCar;
    private RacingCar secondTeamRacingCar;
    private SupportCar teamSupportCar;

    public Team() {
    }

    public Team(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public RacingCar getFirstTeamRacingCar() {
        return firstTeamRacingCar;
    }

    public void setFirstTeamRacingCar(RacingCar firstTeamRacingCar) {
        this.firstTeamRacingCar = firstTeamRacingCar;
    }

    public RacingCar getSecondTeamRacingCar() {
        return secondTeamRacingCar;
    }

    public void setSecondTeamRacingCar(RacingCar secondTeamRacingCar) {
        this.secondTeamRacingCar = secondTeamRacingCar;
    }

    public SupportCar getTeamSupportCar() {
        return teamSupportCar;
    }

    public void setTeamSupportCar(SupportCar teamSupportCar) {
        this.teamSupportCar = teamSupportCar;
    }
}
