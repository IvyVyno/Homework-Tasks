package HW15.ChooChoo;

import java.util.Random;

public class SecondClassPassenger extends Train {

    private final int load;

    public SecondClassPassenger() {
        this.load = new Random().nextInt(200);
    }

    public int getLoad() {
        return load;
    }

    @Override
    public String toString() {
        return "=[passngr:2cl:" + load + "]";
    }
}
