package HW10;

public class NoteBook extends Computer {

    public boolean isPortable;

    public NoteBook () {

    }

    public NoteBook (int size, boolean isLessThanBuilding, boolean isPortable) {
        this.size = size;
        this.isLessThanBuilding = true;
        this.isPortable = true;
    }


}
