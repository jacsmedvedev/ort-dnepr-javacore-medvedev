package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Medvedev_task_11_15_a_corrected {

	public static void main(String[] args) {

		int[] array = new int[20];
		int i;
		for (i = 0; i < array.length; ++i) {
			int x = (int) (Math.random() * 100);
			array[i] = x;
		}

		System.out.println(Arrays.toString(array));
		Scanner x = new Scanner(System.in);
		System.out.println("Введите число от 1 до 20, " + "\nсоответсвующее индексу элемента массива --- ");
		int numOfDigit = x.nextInt();
		if (1 <= numOfDigit && numOfDigit <= 20) {
			double zzz = Math.sqrt(array[numOfDigit - 1]);
			System.out.println(zzz);
		} else {
			System.out.println("Вы ввели недопустимое значение. Попробуйте снова.");

		}
		x.close();
	}

}