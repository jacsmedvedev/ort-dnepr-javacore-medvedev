package task_from_teacher_12;

import java.util.Map;
import java.util.Map.Entry;

public class Main {

	static TheClassRegister classRegister = new TheClassRegister();
	
	public static void main(String[] args) {
		
/////////////////////////////////////////////////////////////
		classRegister.addSchoolBoy("Ivanov");
		classRegister.addSubjectAndMark("Ivanov","Mathematic", 5);
		classRegister.addSubjectAndMark("Ivanov","Physics", 4);
		classRegister.addSubjectAndMark("Ivanov","Chemistry", 3);
		classRegister.addSubjectAndMark("Ivanov","English", 5);
		classRegister.addSubjectAndMark("Ivanov","Drawing", 5);
////////////////////////////////////////////////////////////		
		classRegister.addSchoolBoy("Sidorov");
		classRegister.addSubjectAndMark("Sidorov","Mathematic", 2);
		classRegister.addSubjectAndMark("Sidorov","Physics", 3);
		classRegister.addSubjectAndMark("Sidorov","Chemistry", 4);
		classRegister.addSubjectAndMark("Sidorov","English", 3);
		classRegister.addSubjectAndMark("Sidorov","Drawing", 5);
///////////////////////////////////////////////////////////		
		classRegister.addSchoolBoy("Dodikof");
		classRegister.addSubjectAndMark("Dodikof","Mathematic", 3);
		classRegister.addSubjectAndMark("Dodikof","Physics", 4);
		classRegister.addSubjectAndMark("Dodikof","Chemistry", 5);
		classRegister.addSubjectAndMark("Dodikof","English", 3);
		classRegister.addSubjectAndMark("Dodikof","Drawing", 3);
////////////////////////////////////////////////////////////
		classRegister.addSchoolBoy("Morozov");
		classRegister.addSubjectAndMark("Morozov","Mathematic", 5);
		classRegister.addSubjectAndMark("Morozov","Physics", 4);
		classRegister.addSubjectAndMark("Morozov","Chemistry", 4);
		classRegister.addSubjectAndMark("Morozov","English", 4);
		classRegister.addSubjectAndMark("Morozov","Drawing", 3);
////////////////////////////////////////////////////////////////////		
		
		classRegister.deleteSchoolBoy("Morozov");
		classRegister.deleteSubjectAndMark("Dodikof", "Drawing");
		
		print();
	}
	
	private static void print() {
		System.out.println("Name       Subject       Mark");
		System.out.println("------------------------------");
		for (Entry<String, Map<String, Integer>> item : classRegister.getList().entrySet()) {
			System.out.println(item.getKey());
			Map<String, Integer> x = item.getValue();
			for (Entry<String, Integer> itemz : x.entrySet()) {
				System.out.print("           " + itemz.getKey());
				System.out.println("       " + itemz.getValue());
			}
		}
	}
}

