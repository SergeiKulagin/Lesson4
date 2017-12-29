public class Team {
    private String teamTitle;
    private int staffSize;
    private int levelOfProfessionalism;
    private RacingCar firstTeamRacingCar;
    private RacingCar secondTeamRacingCar;
    private SupportCar teamSupportCar;
    private SupportType supportType;
    private String legalAddress;

    public Team() {
    }

    public Team(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public Team(int staffSize, int levelOfProfessionalism) {
        this.staffSize = staffSize;
        this.levelOfProfessionalism = levelOfProfessionalism;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public void setSupportType(SupportType supportType) {
        this.supportType = supportType;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public int getStaffSize() {
        return staffSize;
    }

    public void setStaffSize(int staffSize) {
        this.staffSize = staffSize;
    }

    public int getLevelOfProfessionalism() {
        return levelOfProfessionalism;
    }

    public void setLevelOfProfessionalism(int levelOfProfessionalism) {
        this.levelOfProfessionalism = levelOfProfessionalism;
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
