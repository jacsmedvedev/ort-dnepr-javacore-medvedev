package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;

public class Medvedev_task_11_8_a {

	public static void main(String[] args) {
		
		int x = 100;
		int[] array_x = new int[8];
		for (int i = 0; i < array_x.length; ++i) {
			x = x - 3;
			array_x[i] = x;
		}
		System.out.print(Arrays.toString(array_x));
	}

}
