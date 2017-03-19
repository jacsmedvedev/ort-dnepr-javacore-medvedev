package task_from_teacher_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		try {
			AutoOwnerDirectory myDirectory = new AutoOwnerDirectory();
			myDirectory.addNewCarOwner("Vasya", Arrays.asList("1100", "АЕ 5555"));
			myDirectory.addNewCarOwner("Petya", Arrays.asList("3722", "АН 4321","0000"));
			myDirectory.addNewCarOwner("Sanya",Arrays.asList("3442", "6362"));
			myDirectory.addNewCarOwner("Gora", Arrays.asList("7777", "АР 1111"));
			myDirectory.addNewCarOwner("Misha", Arrays.asList("5333", "6666","0000"));
			myDirectory.addNewCarOwner("Valentin", Arrays.asList("4456", "1111"));
			
			///////////////////////////// testing methods /////////////////////////////////////////
			
			boolean addNewCarOwner = myDirectory.addNewCarOwner("Kolya", Arrays.asList("5632"));
			if (addNewCarOwner){
				System.out.println("Запись успешно добавлена в каталог.");
			} else {
				System.out.println("Ошибка записи - проверьте данные и повторите операцию.");
			}
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			boolean removeElement = myDirectory.removeElement("Kolya");
			if (removeElement){
				System.out.println("Запись успешно удалена из каталога.");
			} else {
				System.out.println("Ошибка операции удаления - проверьте данные и повторите операцию.");
			}
			
			/////////////////////////////////////////////////////////////////////////////////////
			
			boolean editElement = myDirectory.editElement("Vasya", Arrays.asList("7000"));
			if (editElement){
				System.out.println("Запись успешно отредактирована.");
			} else {
				System.out.println("Ошибка !!! Запись не отредактирована. Проверьте данные и повторите операцию.");
			}
			
			////////////////////////////////////////////////////////////////////////////////////////
			
			String findName = myDirectory.findName("1100");
			System.out.println(findName);
			
			////////////////////////////////////////////////////////////////////////////////////////
			
			print(myDirectory.getManAndCarNumber());
			
		} catch (Exception e) {
			System.out.println("Bad news ...");
			e.printStackTrace();
		}
	}
	
	
	
	public static void print(Map<String, List<String>> someEntrySet) {
		ArrayList<Entry<String, List<String>>> list = new ArrayList<>(someEntrySet.entrySet());
		for (Entry<String, List<String>> entry : someEntrySet.entrySet()) {
			Collections.sort(entry.getValue());
			Collections.sort(list, (o1,o2) -> o1.getValue().toString().compareTo(o2.getValue().toString()));
		}
		list.forEach(i -> System.out.println(i)) ;
	}
	
	
}

