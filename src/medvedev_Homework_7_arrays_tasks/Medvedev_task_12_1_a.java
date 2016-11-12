package medvedev_Homework_7_arrays_tasks;
/*
/*
 * 
 * 
 * @author Jacob Medvedev
 * 
 */

import java.util.Arrays;

public class Medvedev_task_12_1_a {

	// 12.1 Дан двумерный массив
	// а) Вывести на экран элемент, расположенный в правом верхнем углу массива.

	public static void main(String[] args) {
		int rows = 10;
		int coll = 12;
		int[][] somearray = new int[rows][];
		for (int i = 0; i < somearray.length; ++i) {
			somearray[i] = new int[coll];
		}
		for (int i = 0; i < somearray.length; ++i) {
			for (int j = 0; j < somearray[i].length; ++j) {
				somearray[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < somearray.length; ++i) {
			for (int j = 0; j < somearray[i].length; ++j) {
				System.out.print(somearray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print(
				"\n\n\n\nЗлемент, расположенный в " + "правом \nверхнем углу массива равен " + +somearray[0][coll - 1]);
	}
}
