package HW13;

import java.util.ArrayList;

public class RefactoredSomeNotWorkingCode {

    public static void refactoredThrowClassCastException() {
        Object digit = Integer.valueOf(8);
        String str = digit.toString();
    }

    public static void refactoredThrowNullPointerException() {
        ArrayList list = null;
        if(list == null) {
            list = new ArrayList();
        }
        list.add("smth");
    }

    public static void refactoredThrowNumberFormatException() {
        String str = "162";
        Integer.parseInt(str);
    }

    public static void refactoredThrowArrayIndexOutOfBoundsException() {
        int[] array = {1,2,3,4,5};
        System.out.println(array[5 - 1]);
    }

}
