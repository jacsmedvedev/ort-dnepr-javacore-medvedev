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
			result = w1.getName().compareTo(w2.getName()) * (-1);
		}
		return result;
	}
}
