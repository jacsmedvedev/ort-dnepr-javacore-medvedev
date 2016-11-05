package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;

public class Medvedev_task_11_53_a {

	public static void main(String[] args) {
		double[] someshit = new double[] { 500, 72, -760, 38, -80, -99, 6, 888 };
		for (int i = 0; i < someshit.length; ++i) {
			if (someshit[i] % 10 == 0) {
				someshit[i] = 0;
			}
			
		}
		System.out.print(Arrays.toString(someshit));
	}
}
