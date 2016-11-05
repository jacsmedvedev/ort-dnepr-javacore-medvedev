package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;

public class Medvedev_task_11_12_a {

	public static void main(String[] args) {

		int[] array = new int[20];
		int y = 0;
		for (int i = 300; y < 20; ++i) {
			if (i % 13 == 0 || i % 17 == 0) {
				array[y++] = i;
			}
			
		}
		System.out.print(Arrays.toString(array));
	}
}

