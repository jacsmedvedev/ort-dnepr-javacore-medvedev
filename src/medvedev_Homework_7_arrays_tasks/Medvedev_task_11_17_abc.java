package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;

public class Medvedev_task_11_17_abc {

	public static void main(String[] args) {

		double[] array = new double[10];
		// int A = 2;
		for (int i = 0; i < array.length; ++i) {
			int x = (int) (Math.random() * 100);
			array[i] = x;
		}

		System.out.println(Arrays.toString(array));
		System.out.println("All numbers of array increased by 2.");
		// System.out.println("All numbers of array reduce by A.");
		// System.out.println("All numbers of array to divide by first element
		// of array.");
		// final double firstElement = array[0];
		for (int i = 0; i < array.length; ++i) {
			array[i] = array[i] * 2;
			// array[i] = array[i] - A;
			// array[i] = array[i]/firstElement;
		}
		System.out.print(Arrays.toString(array));
	
	}
}
