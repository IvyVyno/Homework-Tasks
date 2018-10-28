package HW11;

import java.util.Objects;

public class NetBook extends NoteBook {

    public boolean isLessThanNoteBook;

    public NetBook(int size) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isPortable = true;
        this.isLessThanNoteBook = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NetBook)) return false;
        if (!super.equals(o)) return false;
        NetBook netBook = (NetBook) o;
        return isLessThanNoteBook == netBook.isLessThanNoteBook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isLessThanNoteBook);
    }
}
