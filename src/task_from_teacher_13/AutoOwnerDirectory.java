package task_from_teacher_13;


import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class AutoOwnerDirectory {

	Map<String,String> _manAndCarNumber = new TreeMap<String,String>();
	
	public AutoOwnerDirectory() {
		super();
		setManAndCarNumber(_manAndCarNumber);
	}

	public Map<String, String> getManAndCarNumber() {
		return _manAndCarNumber;
	}

	public void setManAndCarNumber(Map<String, String> manAndCarNumber) {
		_manAndCarNumber = manAndCarNumber;
	}

	public void putElement(String number, String name){
		_manAndCarNumber.put(number, name);
	}
	
	public void removeElement(String number){
		_manAndCarNumber.remove(number);
	}
	
	public void editElement(String number, String name, String newNumber, String newName){
		if(this._manAndCarNumber.containsKey(number) == true && 
			this._manAndCarNumber.containsValue(name) == true){
			this._manAndCarNumber.remove(number);
			this._manAndCarNumber.put(newNumber,newName);
		}
	}
	
	public void findName(String number){	
		if (this._manAndCarNumber.containsKey(number) == true){
			String result =  this._manAndCarNumber.get(number);	
			System.out.println(result + " is owner of tne car number " + number);
			}
		}
	
	public void print(){
		for (Entry<String, String> entry: this._manAndCarNumber.entrySet()) {
			System.out.println("Owner: " + entry.getValue() + " - " + "Car number: " + entry.getKey());
		}
	}
}
	