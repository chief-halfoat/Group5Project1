package group5.first.assignment;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Create an array of int values using a scanner and
		// calculate the sum of all stored elements in that array.

		Scanner ins = new Scanner(System.in);

		System.out.println("How many integers would you like to store?");
		int l = ins.nextInt();
		int[] array = new int[l];
		for (int i = 0; i < array.length; i++) {
			array[i] = ins.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
		}
		System.out.println(sum);
	}
}