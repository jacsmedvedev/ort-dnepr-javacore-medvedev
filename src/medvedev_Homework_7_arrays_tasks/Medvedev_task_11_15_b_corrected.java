package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Medvedev_task_11_15_b_corrected {

	public static void main(String[] args) {

		double[] array = new double[20];
		int i;
		for (i = 0; i < array.length; ++i) {
			int x = (int) (Math.random() * 100);
			array[i] = x;
		}

		System.out.println(Arrays.toString(array));
		Scanner x = new Scanner(System.in);
		System.out.println("Введите первое число от 1 до 20, " + "\nсоответсвующее индексу элемента массива --- ");
		int numOfDigit1 = x.nextInt();
		if (1 <= numOfDigit1 && numOfDigit1 <= 20) {

			System.out.println(array[numOfDigit1 - 1]);
			System.out.println("Введите второе число от 1 до 20, " + "\nсоответсвующее индексу элемента массива --- ");
			int numOfDigit2 = x.nextInt();
			if (1 <= numOfDigit2 && numOfDigit2 <= 20) {
				System.out.println(array[numOfDigit2 - 1]);
				double srednee_arifmet = (array[numOfDigit1 - 1] + array[numOfDigit2 - 1]) / 2;
				System.out.println("Result = " + srednee_arifmet);
			}
			x.close();
		}
		System.out.println("Вы ввели недопустимое значение. Попробуйте снова.");

	}
}
