public class Box extends CarPark {

    private String teamUseName;


    public Box() {
        super.setSizeLimit(3);
    }

    public String getTeamUseName() {
        return teamUseName;
    }

    public void setTeamUseName(String teamUseName) {
        this.teamUseName = teamUseName;
    }

    public void registrationTeamCars (String teamName){             // метод для регистрации машин команд по боксам
    }
}
