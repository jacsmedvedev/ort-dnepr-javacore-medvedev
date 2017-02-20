package task_from_teacher_13;

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
		return _manAndCarNumber;
	}

	/**This method adds new car owner to AutoOwnerDirectory.
	 * 
	 * @param name new car owner name 
	 * @param number car number 
	 * @return true if new car owner successfully added and false if not
	 */
	public boolean addNewCarOwner(String name, List<String> number) {
		_manAndCarNumber.put(name, number);
		if (_manAndCarNumber.containsKey(name)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * This method removes a record in AutoOwnerDirectory.
	 * 
	 * @param name car owner name
	 * @return true if record successfully removed and false if not
	 */
	public boolean removeElement(String name) {
		boolean containsKey = _manAndCarNumber.containsKey(name);
		if (containsKey) {
			_manAndCarNumber.remove(name);
			if (_manAndCarNumber.containsKey(name)) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	/**
	 * This method helps to edit a record in AutoOwnerDirectory.
	 * 
	 * @param name current car owner name
	 * @param newName new car owner name
	 * @param newNumber car number of new car owner
	 * @return true if record successfully edited and false if not
	 */
	public boolean editElement(String name, String newName, List<String> newNumber){
		if(this._manAndCarNumber.containsKey(name)){
			this._manAndCarNumber.put(newName,newNumber);
			return true;
		} else {
			return false;
		}
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
