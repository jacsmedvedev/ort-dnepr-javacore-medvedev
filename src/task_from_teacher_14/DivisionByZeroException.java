package task_from_teacher_14;

/**A separate class for the division by zero exception */
public class DivisionByZeroException extends Exception {
	
	private String _message = "Do not devide by zero !";
	
	public DivisionByZeroException() {
		super();
	}

	public DivisionByZeroException(String message) {
		super(message);
	}
	
	public DivisionByZeroException(Throwable cause) {
		super(cause);
	}
	
	public DivisionByZeroException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public String getMessage() {
		return _message;
	}
}
