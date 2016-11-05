package medvedev_Homework_7_arrays_tasks;

public class Medvedev_task_11_40 {

	public static void main(String[] args) {
		int[] someshit = new int[] { 5, 72, -76, 38, -8, -99, 6, 888 };
		for (int i = 0; i < someshit.length; ++i) {
			if (someshit[i] > 0) {
				System.out.println("Положительные члены массива --- " + someshit[i]);
			}

		}
		for (int j = 0; j < someshit.length; ++j) {
			if (someshit[j] < 0) {
				System.out.println("Отрицательные члены массива --- " + someshit[j]);
			}
		}
	}

}