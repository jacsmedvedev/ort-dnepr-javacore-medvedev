package task_from_teacher_11;

public abstract class Worker {

	private String _name;
	protected double _payment;
	private int _id;
	
	public Worker(String name, double payment, int id) {
		super();
		_name = name;
		_payment = payment;
		_id = id;
	}

	public Worker() {};

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getPayment() {
		return _payment;
	}

	public void setPayment(double payment) {
		_payment = payment;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public abstract void avrgMonSalary(double x);
}
