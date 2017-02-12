package task_from_teacher_14;

public class ExpressionFormatException extends Exception {
	
	private String _message = "Check you expression! It shouldn't contain letters.";

	public ExpressionFormatException() {
	}

	public ExpressionFormatException(String message) {
		super(message);
	}

	public ExpressionFormatException(Throwable cause) {
		super(cause);
	}

	public ExpressionFormatException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public String getMessage() {
		return _message;
	}
}
