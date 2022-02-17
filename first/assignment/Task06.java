package group5.first.assignment;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner ins = new Scanner(System.in);
		int remainder;
		boolean isPrime = true;
		System.out.println("Please enter a number");
		int numberToCheck = ins.nextInt();
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			if (remainder == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(numberToCheck + " is a Prime number");
		else
			System.out.println(numberToCheck + " is not a Prime number");
	}
}
