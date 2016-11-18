package medvedev_Homework_7_arrays_tasks;

import java.util.Arrays;

/*
 * 
 * 
 * @author Jacob Medvedev
 * 
 */

//9.10 Даны названия трех городов.
// Вывести на экран самое длинное и самое короткое название.

public class Medvedev_task_9_10 {

	public static void main(String[] args) {
		String[] cities = new String[] { "Днепр", "Киев", "Чоп", "Ивано-Франковск", "Токмак",  };
		System.out.println(Arrays.toString(cities));
		int maxLetters = cities[0].length();
		for (int i = 0; i < cities.length; ++i) {
			if (maxLetters < cities[i].length()) {
				maxLetters = cities[i].length();
			}
		}
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].length() == maxLetters) {
				System.out.println(cities[i] + " - имеет больше всего букв.");
			}
		}
		int minLetters = cities[0].length();
		for (int i = 0; i < cities.length; ++i) {
			if (minLetters > cities[i].length()) {
				minLetters = cities[i].length();

			}
		}
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].length() == minLetters) {
				System.out.println(cities[i] + " - имеет меньше всего букв.");
			}
		}
	}
}
