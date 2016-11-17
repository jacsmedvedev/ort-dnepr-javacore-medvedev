package medvedev_Homework_7_arrays_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 
 * 
 * @author Jacob Medvedev
 * 
 */



public class Medvedev_task_9_10 {

	// 9.10 Даны названия трех городов.
	// Вывести на экран самое длинное и самое короткое название.

	public static void main(String[] args) {

		String[] cities = new String[] { "Днепр", "Киев", "Чоп", "Ивано-Франковск", "Токмак" };

	}

	private static void bubbleSort(String[] cities) {

		for (int i = cities.length; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (cities[j].charAt(0) > cities[j + 1].charAt(0)) {

					String temp = cities[j];
					cities[j] = cities[j + 1];
					cities[j + 1] = temp;
				}
			} System.out.println(Arrays.toString(cities));

			// System.out.println(cities[0] + " - имеет меньше всего букв.");
			// System.out.println(cities[cities.length-1] + " - имеет больше
			// всего букв.");
		}
		
	} 
}
