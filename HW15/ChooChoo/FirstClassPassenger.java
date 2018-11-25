package HW15.ChooChoo;

import java.util.Random;

public class FirstClassPassenger extends Train {

    private final int load;

    public FirstClassPassenger() {
        this.load = new Random().nextInt(100);
    }

    public int getLoad() {
        return load;
    }

    @Override
    public String toString() {
        return "=[passngr:1cl:" + load + "]";
    }
}
