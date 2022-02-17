package group5.first.assignment;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		Scanner ins = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = ins.nextInt();
		System.out.println("Enter another number");
		int b = ins.nextInt();

		int[] first = { a, b };
		int[] second = { first[1], first[0] };

		for (int num1 : first) {
			System.out.print(num1 + " ");
		}
		System.out.println();
		for (int num : second) {
			System.out.print(num + " ");
		}

	}

}
