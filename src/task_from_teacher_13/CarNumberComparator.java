package task_from_teacher_13;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Class contains a single method which compares
 * values(car numbers) in a map(AutoOwnerDirectory).
 *  
 * @author Yakov Medvedev
 *
 */
public class CarNumberComparator implements Comparator<Map.Entry<String, List<String>>> {
	
	@Override
	public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {	
		return o1.getValue().toString().compareTo(o2.getValue().toString());
	}
}