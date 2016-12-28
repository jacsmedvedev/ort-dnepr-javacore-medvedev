package task_from_teacher_12;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Map<String,FiveSubjAndMarks> schoolboysSubjectsAndMarks = new HashMap<String,FiveSubjAndMarks>();
		schoolboysSubjectsAndMarks.put("Ivanov", new FiveSubjAndMarks (new SudjectAndMark[]{
									new SudjectAndMark("Mathematic", 5),
									new SudjectAndMark("Physics", 4),
									new SudjectAndMark("Chemistry", 3),
									new SudjectAndMark("English", 5),
									new SudjectAndMark("Drawing", 5)}));
		schoolboysSubjectsAndMarks.put("Sidorov", new FiveSubjAndMarks (new SudjectAndMark[]{
				new SudjectAndMark("Mathematic", 4),
				new SudjectAndMark("Physics", 4),
				new SudjectAndMark("Chemistry", 4),
				new SudjectAndMark("English", 3),
				new SudjectAndMark("Drawing", 5)}));
		schoolboysSubjectsAndMarks.put("Dodikof", new FiveSubjAndMarks (new SudjectAndMark[]{
				new SudjectAndMark("Mathematic", 3),
				new SudjectAndMark("Physics", 4),
				new SudjectAndMark("Chemistry", 5),
				new SudjectAndMark("English", 3),
				new SudjectAndMark("Drawing", 3)}));
		schoolboysSubjectsAndMarks.put("Morozov", new FiveSubjAndMarks (new SudjectAndMark[]{
				new SudjectAndMark("Mathematic", 5),
				new SudjectAndMark("Physics", 4),
				new SudjectAndMark("Chemistry", 3),
				new SudjectAndMark("English", 4),
				new SudjectAndMark("Drawing", 3)}));
		schoolboysSubjectsAndMarks.put("Barugin", new FiveSubjAndMarks (new SudjectAndMark[]{
				new SudjectAndMark("Mathematic", 5),
				new SudjectAndMark("Physics", 4),
				new SudjectAndMark("Chemistry", 4),
				new SudjectAndMark("English", 5),
				new SudjectAndMark("Drawing", 4)}));
		
		for (Entry<String,FiveSubjAndMarks> entry: schoolboysSubjectsAndMarks.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());	
		}
	}
}
