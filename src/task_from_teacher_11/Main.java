/**
 * Task №11
 * 
 * Построить три класса (базовый и 2 потомка), 
 * описывающих некоторых работников с почасовой оплатой 
 * (один из потомков) и фиксированной оплатой (второй потомок). 
 * Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы. 
 * Для «повременщиков» формула для расчета такова: 
 * «среднемесячная заработная плата = 20.8 * 8 * почасовую ставку», 
 * для работников с фиксированной оплатой 
 * «среднемесячная заработная плата = фиксированной месячной оплате».
 * a) Упорядочить всю последовательность работников по убыванию среднемесячного заработка. 
 * При совпадении зарплаты – упорядочивать данные по алфавиту по имени. 
 * Вывести идентификатор работника, имя и среднемесячный заработок для всех элементов списка.
 * b) Вывести первые 5 имен работников из полученного в пункте а) списка.
 * c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.
 * 
 * @author Medvedev Yakov
 */

package task_from_teacher_11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Worker w1 = new WorkerHourlyPayment("Vasya", 39, 1);
		Worker w2 = new WorkerHourlyPayment("Pasha", 41, 2);
		Worker w3 = new WorkerHourlyPayment("Yasha", 41, 3);
		Worker w4 = new WorkerHourlyPayment("Veniamin", 30, 4);
		Worker w5 = new WorkerHourlyPayment("Arkadiy", 41, 5);
		Worker w6 = new WorkerFixedPayment("Gavrilo", 3000, 6);
		Worker w7 = new WorkerFixedPayment("Roma", 2500, 7);
		Worker w8 = new WorkerFixedPayment("Nikita", 4000, 8);
		Worker w9 = new WorkerFixedPayment("Petya", 3500, 9);
		Worker w10 = new WorkerFixedPayment("Vadik", 2000, 10);
		
	    Worker[] workers = new Worker[] {w1,w2,w3,w4,w5,w6,w7,w8,w9,w10};
	    
		printPayments(workers);
		System.out.println("___________________________________");
		printPaymentsFirstFive(workers);
		System.out.println("___________________________________");
		printPaymentsLastThree(workers);
		System.out.println("___________________________________");
	}

	public static void printPayments(Worker[] workers) {
		Arrays.sort(workers, new PaymentComparator().reversed());
		for (int i = 0; i < workers.length; ++i) {
			System.out.println(workers[i].toString());
		}
	}
	
	public static void printPaymentsFirstFive(Worker[] workers) {
		Arrays.sort(workers, new PaymentComparator().reversed());
		for (int i = 0; i < 5; ++i) {
			System.out.println(workers[i].toString());
		}
	}
	
	public static void printPaymentsLastThree(Worker[] workers) {
		Arrays.sort(workers, new PaymentComparator().reversed());
		for (int i = (workers.length - 3); i < workers.length; ++i) {
			workers[i].toString();
			System.out.println(workers[i].toString());
		}
	}
}
