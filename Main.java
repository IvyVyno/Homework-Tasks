package HW13;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Все эти исключения являются непроверяемыми. Соответственно, мы можем пренебречь их обработкой.
        /*
        throwClassCastException();
        throwNullPointerException();
        throwNumberFormatException();
        throwArrayIndexOutOfBoundsException();
        */

        //Зарефакторенный нерабочий код.
        /*
        refactoredThrowClassCastException();
        refactoredThrowNullPointerException();
        refactoredThrowNumberFormatException();
        refactoredThrowArrayIndexOutOfBoundsException();
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first file name(file1.txt): ");
        String firstFile = scanner.nextLine();
        System.out.println();
        System.out.print("Enter the second file name(file2.txt): ");
        String secondFile = scanner.nextLine();
        System.out.println();
        System.out.print("Enter the third file name(file3.txt): ");
        String thirdFile = scanner.nextLine();
        //readAndWrite(firstFile, secondFile, thirdFile); //without try-with-resource construction
        readAndWriteThroughTryWithResource(firstFile, secondFile, thirdFile); // try-with-resource
    }

    private static void readAndWriteThroughTryWithResource(String firstFile, String secondFile, String thirdFile) {
        try (FileOutputStream first = new FileOutputStream(firstFile);
             BufferedReader second = new BufferedReader(new FileReader(secondFile));
             BufferedReader third = new BufferedReader(new FileReader(thirdFile))) {
            while (true) {
                String s;
                if ((s = third.readLine()) != null) {
                    first.write(s.getBytes());
                    first.write(("\r\n").getBytes());
                } else if ((s = second.readLine()) != null) {
                    first.write(s.getBytes());
                    first.write(("\r\n").getBytes());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndWrite(String firstFile, String secondFile, String thirdFile) {
        FileOutputStream first = null;
        BufferedReader second = null;
        BufferedReader third = null;
        try {
            first = new FileOutputStream(firstFile);
            second = new BufferedReader(new FileReader(secondFile));
            third = new BufferedReader(new FileReader(thirdFile));
            while (true) {
                String s;
                if ((s = third.readLine()) != null) {
                    first.write(s.getBytes());
                    first.write(("\n").getBytes());
                } else if ((s = second.readLine()) != null) {
                    first.write(s.getBytes());
                    first.write(("\n").getBytes());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (first != null) {
                try {
                    first.flush();
                    first.close();
                    second.close();
                    third.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
