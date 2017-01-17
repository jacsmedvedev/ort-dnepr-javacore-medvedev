package task_from_teacher_2;

import java.util.Comparator;

public class StudentCorparator implements Comparator<Student>{

	@Override
	public int compare(Student w1, Student w2 ) {
		int result = Double.compare(w1.getNewScholarships(), w2.getNewScholarships());
		if (result == 0) {
			result = Double.compare(w1.getSurname().charAt(0), w2.getSurname().charAt(0));
		}
		return result;
	}
}
