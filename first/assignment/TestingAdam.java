package group5.first.assignment;

public class TestingAdam {

	public static void main(String[] args) {
		// Create a 2D array of integers.
		// Develop a program which will calculate the
		// sum of even and odd numbers for that array.

		int[][] array = { { 1, 2, 3, 17 }, { 4, 5, 6, 24, 26 }, { 7, 8, 9 } };

int sum = 0;
int averageDenom=0;
for (int i=0; i<array.length; i++) {
	for (int j=0; j<array[i].length; j++) {
		sum+=array[i][j];
		averageDenom++;
	}
}
System.out.println(sum);
System.out.println(averageDenom);
	}

}
