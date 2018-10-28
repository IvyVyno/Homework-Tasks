package HW11;

import java.util.Objects;

public class Tablet extends Computer {

    public boolean isBiggerThanSmartphone;

    public Tablet(int size) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isBiggerThanSmartphone = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablet)) return false;
        if (!super.equals(o)) return false;
        Tablet tablet = (Tablet) o;
        return isBiggerThanSmartphone == tablet.isBiggerThanSmartphone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isBiggerThanSmartphone);
    }
}
