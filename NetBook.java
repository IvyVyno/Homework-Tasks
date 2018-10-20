package HW10;

public class NetBook extends NoteBook {

    public boolean isLessThanNoteBook;

    public NetBook(int size, boolean isLessThanBuilding, boolean isPortable) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isPortable = true;
        this.isLessThanNoteBook = true;
    }
}
