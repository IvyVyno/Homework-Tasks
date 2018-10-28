package HW11;

import java.util.Objects;

public class Computer {

    public int size;
    public boolean isLessThanBuilding;

    public Computer() {

    }

    public Computer(int size) {
        this.size = size;
        this.isLessThanBuilding = false;
    }

    public void dataInput() {

    }

    public void calculate() {

    }

    public void dataOutput() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return size == computer.size &&
                isLessThanBuilding == computer.isLessThanBuilding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, isLessThanBuilding);
    }
}
