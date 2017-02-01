package task_from_teacher_13;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		AutoOwnerDirectory myDirectory = new AutoOwnerDirectory();

		myDirectory.addNewElement("Vasya", Arrays.asList("1100", "АЕ 5555"));
		myDirectory.addNewElement("Petya", Arrays.asList("3722", "АН 4321"));
		myDirectory.addNewElement("Sanya",Arrays.asList("3442", "6362"));
		myDirectory.addNewElement("Gora", Arrays.asList("7777", "АР 1111"));
		myDirectory.addNewElement("Misha", Arrays.asList("5333", "6666"));
		myDirectory.addNewElement("Valentin", Arrays.asList("4456", "1111"));

		// testing methods
		
		myDirectory.addNewElement("Kolya", Arrays.asList("5632"));
		myDirectory.findName("1100");
		myDirectory.editElement("Vasya", "Vahtang", Arrays.asList("7000"));
		myDirectory.removeElement("Misha");
		print(myDirectory.getManAndCarNumber());
	}
	
	public static void print(Map<String, List<String>> someEntrySet) {
		ArrayList<Entry<String, List<String>>> list = new ArrayList<>(someEntrySet.entrySet());
		for (Entry<String, List<String>> entry : someEntrySet.entrySet()) {
			Collections.sort(list, new CarNumberComparator());
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
	}
}

