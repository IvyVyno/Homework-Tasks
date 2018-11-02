package HW13;

import java.util.ArrayList;
import java.util.Scanner;

public class SomeNotWorkindCode {

    public static void throwClassCastException() {
        Object digit = Integer.valueOf(8);
        String str = (String)digit;
    }

    public static void throwNullPointerException() {
        ArrayList list = null;
        list.add("smth");
    }

    public static void throwNumberFormatException() {
        String str = "Hello World!";
        Integer.parseInt(str);
    }

    public static void throwArrayIndexOutOfBoundsException() {
        int[] array = {1,2,3,4,5};
        System.out.println(array[5]);
    }

}
