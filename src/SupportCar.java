import java.util.List;

public class SupportCar extends TruckCar {

    private List<String> kindOfSupport;
    private Team team;

    public SupportCar() {
    }

    public SupportCar(String carNumber) {
        super(carNumber);
    }

    public SupportCar(List<String> kindOfSupport) {
        this.kindOfSupport = kindOfSupport;
    }

    public List<String> getKindOfSupport() {
        return kindOfSupport;
    }

    public void setKindOfSupport(List<String> kindOfSupport) {
        this.kindOfSupport = kindOfSupport;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
