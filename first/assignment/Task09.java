package group5.first.assignment;

public class Task09 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int[] array = { 01, 12, 23, 34, -3, 45, 56, 200, 67, 78, 89, 90 };

		int biggest = 0, second = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > biggest) {
				second = biggest;
				biggest = array[i];
			} else if (array[i] > second && array[i] < biggest) {
				second = array[i];
			}
		}
		System.out.println(second + " is the second biggest number in the array");
	}

}
