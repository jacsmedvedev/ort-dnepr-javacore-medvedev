package task_from_teacher_13;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/** Class  represents a directory which 
 * contains car owners with car numbers.
 * */
public class AutoOwnerDirectory {

	private Map<String,List<String>> _manAndCarNumber = new HashMap<String,List<String>>();
	
	public AutoOwnerDirectory() {
		super();
	}

	public Map<String, List<String>> getManAndCarNumber() {
		return Collections.unmodifiableMap(_manAndCarNumber);
	}

	/**This method adds new car owner to AutoOwnerDirectory.
	 * 
	 * @param name new car owner name 
	 * @param number car number 
	 * @return true if new car owner successfully added and false if not
	 */
	public boolean addNewCarOwner(String name, List<String> number) {
		_manAndCarNumber.put(name, number);
		return _manAndCarNumber.containsKey(name);
	}
	
	/**
	 * This method removes a record in AutoOwnerDirectory.
	 * 
	 * @param name car owner name
	 * @return true if record successfully removed and false if not
	 */
	public boolean removeElement(String name) {
		return _manAndCarNumber.remove(name) != null;
	}
	
	/**
	 * This method helps to edit a record in AutoOwnerDirectory.
	 * 
	 * @param name current car owner name
	 * @param newNumber new car number of current car owner
	 * @return true if record successfully edited and false if not
	 */
	public boolean editElement(String name, List<String> newNumber){
		List<String> previousValue = this._manAndCarNumber.get(name);
		return	this._manAndCarNumber.put(name,newNumber) == previousValue;
		}
	
	/**
	 * Method finds name of car owner by car number.
	 * 
	 * @param number car number
	 * @return car owner name
	 */
	public String findName(String number){	
		String ownerName = null;
		for (Entry<String, List<String>> entry: this._manAndCarNumber.entrySet()) {
			if (entry.getValue().contains(number)){
			  ownerName =  entry.getKey();	
			}
		}
		return ownerName;
	}
}
