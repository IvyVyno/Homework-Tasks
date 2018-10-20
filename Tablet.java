package HW10;

public class Tablet extends Computer {

    public boolean isBiggerThanSmartphone;

    public Tablet(int size, boolean isLessThanBuilding, boolean isBiggerThanSmartphone) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isBiggerThanSmartphone = true;
    }
}
