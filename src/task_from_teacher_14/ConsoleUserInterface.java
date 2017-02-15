package task_from_teacher_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ConsoleUserInterface reads user input string with the expression,
 * converts and validates received data.
 * 
 * @author Yakov Medvedev
 *
 */
public class ConsoleUserInterface  implements UserInterface {

	private String _userExpression;
	private ArrayList<String> _numsAndOprs = new ArrayList<String>();
	private CalculatorService _calculatorService;
	
	public ConsoleUserInterface() {
		super();
	}

	public ConsoleUserInterface(CalculatorService cs) {
		super();
		_calculatorService = cs;
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
		return _calculatorService;
	}

	public void setCs(CalculatorService cs) {
		_calculatorService = cs;
	}

	@Override
	public void start() throws Exception { 
		System.out.println("Введите выражение: ");
			Scanner s = new Scanner(System.in);
			setUserExpression(s.next());
			//s.close();
			}

	/**
	 * Method parses user input string into separate elements - numbers
	 * and arithmetic operators and writes them to list.
	 * 
	 * @param userInput user input string
	 * @return 
	 * @throws NumberFormatException
	 */
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
	
	/**
	 * Method checks if the numbers is in a predetermined range.
	 * 
	 * @param arrlist user input string parsed to ArrayList
	 * @throws NumberFormatException
	 */
	public void validateValueLimit(ArrayList<String> arrlist) throws  NumberFormatException {
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
	
	/**
	 *  Method checks fractional part of the numbers in accordance with the conditions of the task.
	 *  
	 * @param arrlist user input string parsed to ArrayList
	 * @throws NumberFormatException
	 */
	public void validateFractionalPart(ArrayList<String> arrlist) throws  NumberFormatException{
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
	 * @param str user input string parsed to ArrayList
	 * @throws ExpressionFormatException
	 */
	public void validateForLetters(String str) throws  ExpressionFormatException{
		str = getUserExpression();
		boolean regex = str.matches("(.*[a-zA-Z].*)");
			if(regex){
				throw new ExpressionFormatException();
			}
		}
	}
