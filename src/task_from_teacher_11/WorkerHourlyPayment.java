
package task_from_teacher_11;

/**
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
		 _payment = x*28.8*8;	
	}

	
	
}
