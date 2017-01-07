/**
 * Task №2
 * 
 * Составить программу для начисления стипендии студентам 
 * по результатам экзаменационной сессии. Информация о результатах сессии включает в себя:
	– фамилию;
	– имя;
	– отчество;
	– номер группы;
	– экзаменационные оценки.
    Количество экзаменационных оценок не менее 3 и не более 5. 
    Стипендия начисляется студентам, сдавшим все экзамены в сессию, 
    по следующим правилам. Студенты, сдавшие все экзамены на "отлично" 
    получают надбавку равную 100%; студенты, 
    сдавшие экзамены на "хорошо" и "отлично" – 50%; а студенты, 
    сдавшие экзамены на "хорошо", – 25%. Стипендия не начисляется студентам, 
    имеющим в сессию более двух удовлетворительных оценок.
	Список студентов каждой группы, получивших стипендию, 
	вывести на экран, упорядочив его по алфавиту.

 * @author Yakov Medvedev
 *
 */
package task_from_teacher_2;

import java.util.Arrays;

public class CalculationOfScholarships {

	private static final int STUDENTSQUANTITY = 9;

	public static void main(String[] args) {

		Student[] someStudents = new Student[STUDENTSQUANTITY];
		
		// 351 group
someStudents[0] = new Student("Ларин", "Вадим", "Александрович", 351, new int[] { 5, 2, 5, 3, 3});
someStudents[1] = new Student("Бычек", "Артур ", "Владимирович", 351, new int[] { 5, 5, 4, 5, 5 });
someStudents[2] = new Student("Калашник ", "Александр", "Сергеевич", 351, new int[] { 5, 5, 5, 5, 5 });
		
		// 352 group
someStudents[3] = new Student("Медведев", "Яков", "Иванович", 352, new int[] { 5, 5, 5, 5, 5 });
someStudents[4] = new Student("Лесовой", "Роман", "Николаевич", 352, new int[] {4, 4, 4, 4});
someStudents[5] = new Student("Смолий", "Петр", "Александрович", 352, new int[] {5, 5, 4, 5, 3  });
someStudents[6] = new Student("Главацкий ", "Арттур ", "Александрович", 352, new int[] { 4, 4, 4, 5, 4 });
		
		// 354 group
someStudents[7] = new Student("Горяев ", "Сергей ", "Владимирович", 354, new int[] { 4, 4, 4 });
someStudents[8] = new Student("Глущук ", "Андрей ", "Александрович", 354, new int[] { 5, 4, 3, 3, 3});

		calculation(someStudents);
		sortStudents(someStudents);
	}
	
	public static void calculation(Student[] someStudents) {
		for (int i = 0; i < someStudents.length; ++i) {
			someStudents[i].NewScholarships((someStudents[i].getExam_score()));
		}
	}
		
 	public static void sortStudents(Student[] someStudents) {
		Arrays.sort(someStudents, new StudentCorparator());
		for (int i = 0; i < someStudents.length; ++i) {
			someStudents[i].toString();
			System.out.println(someStudents[i].toString());
		}
 	}
}
			
			
			


