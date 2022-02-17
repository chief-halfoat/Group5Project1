package group5.first.assignment;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 10 000 000");
		int a = sc.nextInt();
		boolean prime = false;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = true;
				break;
			}
		}

		if (!prime) {
			System.out.println(a + " is a prime number");
		} else {
			System.out.println(a + " is NOT a prime number");
		}
	}
}
