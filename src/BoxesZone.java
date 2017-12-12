public class BoxesZone extends CarPark {

    private Team team;

    public BoxesZone() {
        super.setCarParkSizeLimit(3);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
