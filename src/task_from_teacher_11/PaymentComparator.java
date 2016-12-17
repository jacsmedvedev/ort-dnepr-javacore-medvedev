package task_from_teacher_11;

import java.util.Comparator;

/**
 * @author Yakov Medvedev
 *
 */
public class PaymentComparator implements Comparator<Worker> {

	@Override
	public int compare(Worker w1, Worker w2 ) {
		int result = Double.compare(w1.getPayment(), w2.getPayment());
		if (result == 0) {
			result = Double.compare(w1.getName().charAt(0), w2.getName().charAt(0)) * (-1);
		}
		return result;
	}
}
