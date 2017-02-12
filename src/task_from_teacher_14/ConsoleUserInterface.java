package task_from_teacher_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUserInterface  implements UserInterface {

	private String _userExpression;
	private ArrayList<String> _numsAndOprs = new ArrayList<String>();
	private CalculatorService _cs;
	
	public ConsoleUserInterface() {
		super();
	}

	public ConsoleUserInterface(CalculatorService cs) {
		super();
		_cs = cs;
	}

	public String getUserExpression() {
		return _userExpression;
	}

	public void setUserExpression(String userExpression) {
		_userExpression = userExpression;
	}

	public ArrayList<String> getNumsAndOprs() {
		return _numsAndOprs;
	}

	public void setNumsAndOprs(ArrayList<String> numsAndOprs) {
		_numsAndOprs = numsAndOprs;
	}

	public CalculatorService getCs() {
		return _cs;
	}

	public void setCs(CalculatorService cs) {
		_cs = cs;
	}

	@Override
	public void start() throws Exception { 
		System.out.println("Введите выражение: ");
			Scanner s = new Scanner(System.in);
			setUserExpression(s.next());
			s.close();
			}

	public ArrayList<String> parseUserInput(String userInput) throws NumberFormatException{
		userInput = getUserExpression();
		String[] parsedArray = null;
		String getUserExpression = userInput.replace(",", ".");
		parsedArray = getUserExpression.split("((?<=[<=|>=|==|\\+|\\*|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\-|<|>|/|=]))|[a-zA-Z]+\\s*");
		for (int i = 0; i < parsedArray.length; ++i) {
			_numsAndOprs.add(parsedArray[i]);
		}
		return _numsAndOprs;
	}
	
	public void validatorValueLimit(ArrayList<String> arrlist) throws  NumberFormatException {
		arrlist = getNumsAndOprs();
		for (int i = 0; i < arrlist.toArray().length; ++i) {
			boolean regex = arrlist.get(i).matches("([\\d].*)");
			if (regex){
				double tempDouble = Double.parseDouble(arrlist.get(i));
				if (tempDouble < Integer.MIN_VALUE || tempDouble > Integer.MAX_VALUE){
					throw new NumberFormatException("The number is not in the permissible range of values.");
				}
			}
		}
	}
	
	public void validatorFractionalPart(ArrayList<String> arrlist) throws  NumberFormatException{
		arrlist = getNumsAndOprs();
		for (int i = 0; i < arrlist.toArray().length; ++i) {
			boolean regex = arrlist.get(i).matches("([\\d].*)");
			if (regex){
				boolean regexForPoint = arrlist.get(i).matches(".*[\\.]((\\d){3,})");
				double tempDouble = Double.parseDouble(arrlist.get(i));
				if (regexForPoint){
					throw new NumberFormatException("Not valid decimal part of the number.");
				}
			}
		}
	}
	
	/**
	 * Method checks user input expression for letters presence.
	 * @param str user input string
	 * @throws ExpressionFormatException
	 */
	public void validatorForLetters(String str) throws  ExpressionFormatException{
		str = getUserExpression();
		boolean regex = str.matches("(.*[a-zA-Z].*)");
			if(regex){
				throw new ExpressionFormatException();
			}
		}
	}
