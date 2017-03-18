package task_from_teacher_11;

/**
 * This class represents workers with Fixed Payment. 
 * 
 * @author Yakov Medvedev
 *
 */
public class WorkerFixedPayment extends Worker{

	public WorkerFixedPayment(String name, double payment, int id) {
		super(name, payment, id);
		avrgMonSalary(payment);
	}

	public WorkerFixedPayment() {
		super();
	}

	@Override
	public double avrgMonSalary(double salary) {
		double res = 0;
		salary = res;
		setPayment(salary);
		return res;
	}
}
