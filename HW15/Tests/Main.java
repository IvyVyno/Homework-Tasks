package HW15.Tests;

import HW15.ChooChoo.Train;


public class Main {
    public static void main(String[] args) {
        Train train = new Train(5);
        train.chooseStartPosition();
        train.chooseEndPosition();
        train.trainFill();
        System.out.println(train.toString());
        }
    }
