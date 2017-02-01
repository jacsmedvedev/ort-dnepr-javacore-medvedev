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
	 * @param name car owner name 
	 * @param number car number 
	 */
	public void addNewElement(String name, List<String> number){
		_manAndCarNumber.put(name, number);
	}
	
	/**
	 * This method removes a record in AutoOwnerDirectory.
	 * 
	 * @param name car owner name
	 */
	public void removeElement(String name){
		if(_manAndCarNumber.containsKey(name)){
			_manAndCarNumber.remove(name);
			if(_manAndCarNumber.containsKey(name) == false){
				System.out.println("Запись с именем " + name + " успешно удалена.");
			} else {
				System.out.println("Запись не удалена.Повторите попытку.");
			}
		} else {
			System.out.println("Записи с именем " + name + " не найдено. Уточните данные.");
		}
	}
	
	/**
	 * This method helps to edit a record in AutoOwnerDirectory.
	 * 
	 * @param name current car owner name
	 * @param newName new car owner name
	 * @param newNumber car number of new car owner
	 */
	public void editElement(String name, String newName, List<String> newNumber){
		if(this._manAndCarNumber.containsKey(name)){
			this._manAndCarNumber.put(newName,newNumber);
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
			if (entry.getValue().contains(number) == true){
			  ownerName =  entry.getKey();	
			}
		}
		return ownerName;
	}
}
