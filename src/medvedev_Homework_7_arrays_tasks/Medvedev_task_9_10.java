package medvedev_Homework_7_arrays_tasks;

/*
 * 
 * 
 * @author Jacob Medvedev
 * 
 */

import java.util.Objects;

public class Medvedev_task_9_10 {

	// 9.10 Даны названия трех городов.
	// Вывести на экран самое длинное и самое короткое название.

	public static void main(String[] args) {
		String a = "Днепр";
		String b = "Киев";
		String c = "Чоп";

		int a_length = a.length();
		int b_length = b.length();
		int c_length = c.length();

		if (a_length > b_length && a_length > c_length) {
			System.out.println(a + " - самое длинное название.");
		} else if (b_length > a_length && b_length > c_length) {
			System.out.println(b + " - самое длинное название.");
		} else if (c_length > a_length && c_length > b_length) {
			System.out.println(c + " - самое длинное название.");
		} 
		
		if (a_length < b_length && a_length < c_length) {
			System.out.println(a + " - самое короткое название.");
		} else if (b_length < a_length && b_length < c_length) {
			System.out.println(b + " - самое короткое название.");
		} else if (c_length < a_length && c_length < b_length) {
			System.out.println(c + " - самое короткое название.");
		} 
		
		if (a_length == b_length && a_length == c_length && b_length == c_length) {
			System.out.println(a + " и " + b + " и " + c + " - имеют одинаковое колличество букв.");
		} else if (a_length == b_length && a_length < c_length) {
			System.out.println(a + " и " + b + " - имеют одинаковое колличество букв, которое меньше чем в " + c);
		} else if (a_length == b_length && a_length > c_length) {
				System.out.println(a + " и " + b + " - имеют одинаковое колличество букв, которое больше чем в " + c);
		} else if (a_length == c_length && a_length < b_length) {
			System.out.println(a + " и " + c + " - имеют одинаковое колличество букв, которое меньше чем в " + b);
		} else if (a_length == c_length && a_length > b_length) {
				System.out.println(a + " и " + c + " - имеют одинаковое колличество букв, которое больше чем в " + b);
		} else if (b_length == c_length && b_length < a_length) {
			System.out.println(b + " и " + c + " - имеют одинаковое колличество букв, которое меньше чем в " + a);
		} else if (b_length == c_length && b_length > a_length) {
			System.out.println(b + " и " + c + " - имеют одинаковое колличество букв, которое больше чем в " + a);
		}
	}
}

		
