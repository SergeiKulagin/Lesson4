public class Box extends CarPark {

    private String teamUseName;
    private Team team;

    public Box() {
        super.setSizeLimit(3);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getTeamUseName() {
        return teamUseName;
    }

    public void setTeamUseName(String teamUseName) {
        this.teamUseName = teamUseName;
    }

    public void registrationTeamCars (Team team){             // метод для регистрации машин команд по боксам


    }
}
