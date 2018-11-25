package HW15.ChooChoo;

public enum Cities {
    KHARKIV("Kharkiv"),
    KYIV("Kyiv") {},
    LVIV("Lviv"){};

    private final String city;

    Cities(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
