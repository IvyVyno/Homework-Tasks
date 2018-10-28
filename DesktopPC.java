package HW11;


import java.util.Objects;

public class DesktopPC extends Computer {

    public int size;

    public DesktopPC(int size) {
        this.size = size;
        this.isLessThanBuilding = true;
    }

    public void entertain(boolean isMouseAvailable, boolean isKeyboardAvailable) {

    }

    public void entertain(boolean isSteeringWheelAvailable) {

    }

    @Override
    public void dataInput() {

    }

    @Override
    public void calculate() {

    }

    @Override
    public void dataOutput() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DesktopPC)) return false;
        if (!super.equals(o)) return false;
        DesktopPC desktopPC = (DesktopPC) o;
        return size == desktopPC.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
