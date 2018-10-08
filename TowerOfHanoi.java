package HW6;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		System.out.print("Enter your stack size: ");
		int n = new Scanner(System.in).nextInt();
		
		moveStack(n,"first stack", "third stack", "second stack");
	}

	private static void moveStack(int n, String fromStack, String toStack, String withStack) {
		if (n >= 1) {
			moveStack(n - 1, fromStack, withStack, toStack);
			System.out.println("Moving element from " + fromStack + " to " + toStack);
			moveStack(n - 1, withStack, toStack, fromStack);
		}
	}
}