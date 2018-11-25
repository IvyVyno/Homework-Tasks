package HW15.ChooChoo;

import java.util.Scanner;

public class Train {

    public int carriageAmount;
    public Train[] train;
    public String startPosition;
    public String endPosition;

    public Train() {
    }

    public Train(int carriageAmount) {
        this.carriageAmount = carriageAmount;
        this.train = new Train[this.carriageAmount + 1];
        this.train[0] = new Locomotive();
    }

    public String chooseEndPosition() {
        System.out.println("Available cities: ");
        for(Cities city : Cities.values()) {
            System.out.print(!(city.getCity().equals(startPosition)) ? city.getCity() + " " : " ");
        }
        System.out.println("Choose destination point: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals(Cities.KYIV.getCity()) && !s.equals(startPosition)) {
            this.endPosition = Cities.KYIV.getCity();
            return this.endPosition;
        } else if(s.equals(Cities.KHARKIV.getCity())&& !s.equals(startPosition)) {
            this.endPosition = Cities.KHARKIV.getCity();
            return this.endPosition;
        } else if (s.equals(Cities.LVIV.getCity()) && !s.equals(startPosition)) {
            this.endPosition = Cities.LVIV.getCity();
            return this.endPosition;
        }
        return null;
    }

    public String chooseStartPosition() {
        System.out.println("Available cities: ");
        for(Cities city : Cities.values()) {
            System.out.print(city.getCity()+" ");
        }
        System.out.println("Choose the start position: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals(Cities.KYIV.getCity())) {
            this.startPosition = Cities.KYIV.getCity();
            return this.startPosition;
        } else if(s.equals(Cities.KHARKIV.getCity())) {
            this.startPosition = Cities.KHARKIV.getCity();
            return this.startPosition;
        } else if (s.equals(Cities.LVIV.getCity())) {
            this.startPosition = Cities.LVIV.getCity();
            return this.startPosition;
        }
        return null;
    }

    public void trainFill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < train.length; i++) {
            System.out.println("Enter next carriage (psngr1cl, psngr2cl, cargo): ");
            String s = scanner.nextLine();
            if (s.equals("psngr1cl")) {
                train[i] = new FirstClassPassenger();
            } else if (s.equals("psngr2cl")) {
                train[i] = new SecondClassPassenger();
            } else if (s.equals("cargo")) {
                train[i] = new Cargo();
            }
        }
    }


    @Override
    public String toString() {
        String result = "";
        for(Train carriage : train) {
            result += carriage.toString();
        }
        return "Train goes from " + startPosition + " to " + endPosition +"\n" +"Train scheme: \n" +result;
    }
}
