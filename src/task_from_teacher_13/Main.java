package task_from_teacher_13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		AutoOwnerDirectory catalog = new AutoOwnerDirectory();

		catalog.putElement("Vasya", Arrays.asList("1100", "АЕ 5555"));
		catalog.putElement("Petya", Arrays.asList("3722", "АН 4321"));
		catalog.putElement("Sanya",Arrays.asList("3442", "6362"));
		catalog.putElement("Gora", Arrays.asList("7777", "АР 1111"));
		catalog.putElement("Misha", Arrays.asList("5333", "6666"));
		catalog.putElement("Valentin", Arrays.asList("4456", "1111"));

		// testing methods
		
		catalog.findName("5333");
		catalog.editElement("Vasya", "Vahtang", Arrays.asList("7000"));
		catalog.removeElement("Petya");
		catalog.print();
	}
}
