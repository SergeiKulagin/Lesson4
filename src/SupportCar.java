public class SupportCar extends TruckCar {

    private String kindOfSupport;

    public SupportCar() {
    }

    public SupportCar(String kindOfSupport) {
        this.kindOfSupport = kindOfSupport;
    }

    public String getKindOfSupport() {
        return kindOfSupport;
    }

    public void setKindOfSupport(String kindOfSupport) {
        this.kindOfSupport = kindOfSupport;
    }
}
