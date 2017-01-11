package task_from_teacher_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		AutoOwnerDirectory catalog = new AutoOwnerDirectory();

		catalog.putElement("2323", "Vasya");
		catalog.putElement("AE 1120", "Petya");
		catalog.putElement("1119", "Sanya");
		catalog.putElement("1118", "Gora");
		catalog.putElement("4567", "Misha");
		catalog.putElement("0001", "Vlentin");

		
		catalog.findName("1119");
		catalog.editElement("2323", "Vasya", "7777", "Vahtang");
		catalog.removeElement("7777");
		catalog.print();
	}
}
