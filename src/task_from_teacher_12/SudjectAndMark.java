package task_from_teacher_12;

/**
 * 
 * This class is for creating the couple "subject - mark".
 */
public class SudjectAndMark {
	private String _subjectName;
	private int _subjectMark;
	
	public SudjectAndMark(String subjectName, int subjectMark) {
		super();
		_subjectName = subjectName;
		_subjectMark = subjectMark;
	}
	
	public SudjectAndMark(){}

	public String getSubjectName() {
		return _subjectName;
	}

	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;
	}

	public int getSubjectMark() {
		return _subjectMark;
	}

	public void setSubjectMark(int subjectMark) {
		_subjectMark = subjectMark;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb
		  .append(getSubjectName())
		  .append("-")
		  .append(getSubjectMark())
		  .append(" балла(ов)");	
		return sb.toString();
	}
}
