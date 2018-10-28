package HW11;

import java.util.Objects;

public class NoteBook extends Computer {

    public boolean isPortable;

    public NoteBook () {

    }

    public NoteBook (int size) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isPortable = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoteBook)) return false;
        if (!super.equals(o)) return false;
        NoteBook noteBook = (NoteBook) o;
        return isPortable == noteBook.isPortable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPortable);
    }
}
