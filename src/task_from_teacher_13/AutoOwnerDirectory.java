package task_from_teacher_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/** Class  represents a directory which 
 * contains car owners with car numbers.
 * */
public class AutoOwnerDirectory {

	Map<String,List<String>> _manAndCarNumber = new HashMap<String,List<String>>();
	
	public AutoOwnerDirectory() {
		super();
	}

	public Map<String, List<String>> getManAndCarNumber() {
		return _manAndCarNumber;
	}

	public void setManAndCarNumber(Map<String, List<String>> manAndCarNumber) {
		_manAndCarNumber = manAndCarNumber;
	}

	public void putElement(String name, List<String> number){
		_manAndCarNumber.put(name, number);
	}
	
	public void removeElement(String name){
		_manAndCarNumber.remove(name);
	}
	
	public void editElement(String name, String newName, List<String> newNumber){
		if(this._manAndCarNumber.containsKey(name) == true ){
			this._manAndCarNumber.remove(name);
			this._manAndCarNumber.put(newName,newNumber);
		}
	}
	
	public void findName(String number){		
		for (Entry<String, List<String>> entry: this._manAndCarNumber.entrySet()) {
			if (entry.getValue().contains(number) == true){
				String result =  entry.getKey();	
				System.out.println(result + " is owner of tne car number " + number);
			}
		}
	}
	
	public void print() {
		ArrayList<Entry<String, List<String>>> list = new ArrayList<>(_manAndCarNumber.entrySet());
		for (Entry<String, List<String>> entry : this._manAndCarNumber.entrySet()) {
			Collections.sort(list, new CarNumberComparator());
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
	}
}
