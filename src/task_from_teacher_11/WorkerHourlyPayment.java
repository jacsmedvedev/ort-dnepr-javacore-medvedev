
package task_from_teacher_11;

/**
 * This class represents workers with Hourly Payment. 
 * 
 * @author Yakov Medvedev
 *
 */
public class WorkerHourlyPayment extends Worker{
			
	public WorkerHourlyPayment(String name, double payment, int id) {
		super(name, payment, id);
		avrgMonSalary(payment);
	}

	public WorkerHourlyPayment() {
		super();
	}
	
	@Override
	public void avrgMonSalary(double x) {
		setPayment(x*28.8*8);	
	}
}
