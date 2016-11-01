package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Medvedev_task_11_15_a {

	public static void main(String[] args) {

		int[] array = new int[20];
		int i;
		for (i = 0; i < array.length; ++i) {
			int x = (int) (Math.random() * 100);
			array[i] = x;
		}

		System.out.println(Arrays.toString(array));
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the array element number --- ");
		int numOfDigit = x.nextInt();
		double zzz = Math.pow(array[numOfDigit-1],2);
		System.out.println(zzz);
	}
}