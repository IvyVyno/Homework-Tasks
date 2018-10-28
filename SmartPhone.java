package HW11;

import java.util.Objects;

public class SmartPhone extends Computer {

    public boolean isAsBigAsPocket;

    public SmartPhone (int size) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isAsBigAsPocket = true;
    }

    public void gsmCall () {

    }


    public void gsmSMSMessage () {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return isAsBigAsPocket == that.isAsBigAsPocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isAsBigAsPocket);
    }

}
