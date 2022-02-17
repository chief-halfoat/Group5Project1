package group5.first.assignment;

public class Task04 {

	public static void main(String[] args) {
		// Create a 2D array of integers.
		// Develop a program which will calculate the
		// sum of even and odd numbers for that array.

		int[][] array = { { 1, 2, 3, 17 }, { 4, 5, 6, 24, 26 }, { 7, 8, 9 } };

		int even = 0;
		int odd = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 == 0) {
					even += array[i][j];
				} else {
					odd += array[i][j];
				}
			}
		}
		System.out.println("The sum of the even numbers is " + even + " and the sum of the odd numbers is " + odd);
	}

}
