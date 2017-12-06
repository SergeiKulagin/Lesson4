
public class Team {
    private String [] numberTeamCars;
    private String title;
    private RacingCar racingCar;
    private SupportCar supportCar1;
    private SupportCar supportCar2;

    public Team() {
    }

    public String[] getNumberTeamCars() {
        return numberTeamCars;
    }

    public Team(String title) {
        this.title = title;
    }

    public void setNumberTeamCars(String[] numberTeamCars) {  // здесь € по списку номеров машин команд их объ€вл€ю
        this.numberTeamCars = numberTeamCars;
        String string = numberTeamCars [0];
        this.racingCar = new RacingCar(string);
        String string1 = numberTeamCars [1];
        this.supportCar1 = new SupportCar(string1);
        String string2 = numberTeamCars [2];
        this.supportCar2 = new SupportCar(string2);
    }

    public RacingCar getRacingCar() {
        return racingCar;
    }

    public SupportCar getSupportCar1() {
        return supportCar1;
    }

    public SupportCar getSupportCar2() {
        return supportCar2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
