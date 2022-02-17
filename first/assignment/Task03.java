package group5.first.assignment;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array for integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] array = { { 1, 2, 3, 14 }, { 4, 5, 6 }, { 7, 8, 9, 24, 36 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 == 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}
