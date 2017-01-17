package task_from_teacher_2;

import java.util.Arrays;

/**
 * This class contains information about student some group.
 * 
 * @author Yakov Medvedev
 *
 */
public class Student {
	
	private final static int DEFAULT_LENGTH = 5;
	private final static double SCOLARSHIP = 1000;
	
	private String _surname;
	private String _name;
	private String _patronymic;
	private int _group_number;
	public int[] _exam_score;
	private double _newScholarships; // стипендия + надбавка 
	
	public Student (String surname, 
					String name, 
					String patronymic, 
					int group_number, 
					int[] exam_score
					){
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setGroup_number(group_number);
		setExam_score(exam_score);
	}
	public String getSurname() {
		return _surname;
	}
	
	public void setSurname(String surname) {
		this._surname = surname;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	public String getPatronymic() {
		return _patronymic;
	}
	
	public void setPatronymic(String patronymic) {
		this._patronymic = patronymic;
	}
	
	public int getGroup_numberr() {
		return _group_number;
	}
	
	public void setGroup_number(int group_number) {
		this._group_number = group_number;
	}
	
	public int[] getExam_score() {
		return _exam_score;
	}
	
	public void setExam_score(int[] exam_score) {
		if (exam_score.length < 3 || exam_score.length > 5) {
			int[] newExam_score = new int[DEFAULT_LENGTH];
			System.arraycopy(exam_score, 0, newExam_score, 0, exam_score.length);
			this._exam_score = newExam_score;
		} else {
			this._exam_score = exam_score;
		}
	}
	
	public double getNewScholarships() {
		return _newScholarships;
	}
	
	public void setNewScholarships(double newScholarships) {
		_newScholarships = newScholarships;
	}
	
	/**
	 * This method charges the scholarship depends on exem scores.
	 * 
	 * @param studentMarks
	 * @return scholarship with premium
	 */
	public double NewScholarships(int[] studentMarks) {
		int five = 0;
		int four = 0;
		int three = 0;
		int lessThree = 0;
		for (int i = 0; i < studentMarks.length; ++i) {
			
			if (studentMarks[i] == 5) {
				++five;
			} else if (studentMarks[i] == 4) {
				++four;
			} else if (studentMarks[i] == 3) {
				++three;
			} else if (studentMarks[i] < 3) {
				++lessThree;
			}
		}
		if (five == studentMarks.length) {
			_newScholarships = SCOLARSHIP * 2.0;
		} else if (five > 0 && four > 0 && three == 0 && lessThree == 0) {
			_newScholarships = SCOLARSHIP * 1.5;
		} else if (four == studentMarks.length) {
			_newScholarships = SCOLARSHIP * 1.25;
		} else if (five > 0 && four > 0 && three < 3 && lessThree == 0) {
			_newScholarships = SCOLARSHIP;
		} else if ((five != 0 && four == 0 && three < 3 && lessThree == 0) || 
				   (five == 0 && four != 0 && three < 3 && lessThree == 0)) {
			_newScholarships = SCOLARSHIP; 
		} else  if (lessThree > 0){
			_newScholarships = 0;
		}
		return _newScholarships;
		}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb .append(getNewScholarships())
		   .append("  ")
		   .append(getSurname())
		   .append("  ")
		   .append(getName())
		   .append("  ")
		   .append(getPatronymic())
		   .append("  ")
		   .append(getGroup_numberr())
		   .append("  ")
		   .append(Arrays.toString(getExam_score()))
		   .append("  ");;	
		return sb.toString();
	}
}