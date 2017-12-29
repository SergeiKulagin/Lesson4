public enum SupportType {
    TYRE_CHANGING ("RunFlat","puncture-free"),
    FUEL_RECHARGING ("methanol","Ì20"),
    ENGINE_TUNING ("VC-tuning","N20"),
    DRIVER_RELAXING ("ReX-dIr","massage");

    private String name;
    private String value;

    SupportType(String name, String value) {
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
