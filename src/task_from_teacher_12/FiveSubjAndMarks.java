package task_from_teacher_12;

import java.util.Arrays;

/**
 * 
 * This class is for creating five couples "subject - mark".
 */
public class FiveSubjAndMarks {
	
	private static final int DEFAULT_NUMBER_OF_SUBJECTS = 5;
	
	SudjectAndMark[] _fiveSubjAndMarks = new SudjectAndMark[DEFAULT_NUMBER_OF_SUBJECTS];

	public FiveSubjAndMarks(SudjectAndMark[] fiveSubjAndMarks) {
		super();
		this._fiveSubjAndMarks = fiveSubjAndMarks;
	}

	public FiveSubjAndMarks(){};
	
	public SudjectAndMark[] getFiveSubjAndMarks() {
		return _fiveSubjAndMarks;
	}

	public void setFiveSubjAndMarks(SudjectAndMark[] fiveSubjAndMarks) {
		this._fiveSubjAndMarks = fiveSubjAndMarks;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(getFiveSubjAndMarks()));
		return sb.toString();
	}
}