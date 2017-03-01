package task_from_teacher_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class represents list of schoolboys and their sudjects with marks.
 * 
 * @author Yakov Medvedev
 * @version 1.2
 */
public class TheClassRegister {
	
	private Map<String, Map<String, Integer>> _list = new HashMap<>();
	
	public TheClassRegister() {
	}

	public Map<String, Map<String, Integer>> getList() {
		return (Map<String, Map<String, Integer>>) _list.entrySet();
	}

	/**
	 * Add one schoolboy to list without sudject and marks.
	 * 
	 * @param name name of schoolboy
	 * @return true if new schoolboy added to list and false if not.
	 */
	public boolean addSchoolBoy(String name) {
		boolean res = true;
		_list.put(name, createMapForSchoolboy());
		if (!_list.containsKey(name)){
			res = false;
		}
		return res;
	}
	
	/**
	 * Add couple sudject - mark to list of sudjects and markss of schoolboy.
	 * 
	 * @param name name of schoolboy
	 * @param subject new subject
	 * @param mark subject mark
	 * @return true if new sudject and mark added to list and false if not.
	 */
	public boolean addSubjectAndMark(String name, String subject, Integer mark) {
		boolean res = true;
		for (Entry<String, Map<String, Integer>> item : _list.entrySet()) {
			if (item.getKey() == name) {
				item.getValue().put(subject, mark);
				if (item.getValue().entrySet().contains(subject)) {
				} else {
					res = false;
				}
			}
		}
		return res;
	}
		
	/**
	 * Create map which will containe sudjects and marks.
	 * 
	 * @return empty map for sudjects and marks
	 */
	public Map<String, Integer> createMapForSchoolboy(){
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		return nameMap;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Школота - ")
			.append(_list);
	
		return sb.toString();
	}            
}
