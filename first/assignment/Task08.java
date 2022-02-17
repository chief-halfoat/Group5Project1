package group5.first.assignment;

public class Task08 {
	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] array = { 01, 12, 23, 34, 3, 45, 56, 200, 67, 78, 89, 90 };

		int max = array[0], min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("The maximum number of the array is " + max);
		System.out.println("The minimum number of the array is " + min);
	}
}