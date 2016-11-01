package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Medvedev_task_11_15_b {

	public static void main(String[] args) {

		int[] array = new int[20];
		int i;
		for (i = 0; i < array.length; ++i) {
			int x = (int) (Math.random() * 100);
			array[i] = x;
		}

		System.out.println(Arrays.toString(array));
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the array first element number --- ");
		int numOfGigit1 = x.nextInt();
		System.out.println(array[numOfGigit1-1]);
		System.out.println("Enter the array second element number --- ");
		int numOfGigit2 = x.nextInt();
		System.out.println(array[numOfGigit2-1]);
		double srednee_arifmet = (array[numOfGigit1-1] + array[numOfGigit2-1]) / 2;
		System.out.println("Result = " + srednee_arifmet);

	}
}