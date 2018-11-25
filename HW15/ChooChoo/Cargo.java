package HW15.ChooChoo;

import java.util.Random;

public class Cargo extends Train {

    private final int load;

    public Cargo() {
        this.load = new Random().nextInt(100);
    }

    public int getLoad() {
        return load;
    }

    @Override
    public String toString() {
        return "=[Cargo:" + getLoad() + "%]";
    }
}
