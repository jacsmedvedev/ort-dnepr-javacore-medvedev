package task_from_teacher_14;

import java.util.ArrayList;

/**
 * Calculating a user-defined expression and returns the result.
 * 
 * @author Yakov Medvedev
 *
 */
public class SimpleCalculatorService implements CalculatorService {
	
	private double _result;
	
	public SimpleCalculatorService() {
		super();
	}

	public double getResult() {
		return _result;
	}

	public void setResult(double result) throws NumberFormatException {
		if (result < Integer.MIN_VALUE || 
			result > Integer.MAX_VALUE){
			throw new NumberFormatException();
		} else {
		_result = result;
		}
	}
	
	@Override
	public double evaluate(ArrayList<String> list) throws DivisionByZeroException {
		double temp = 0;
		double previousValue = 0;
		double subsequentValue = 0;
		double result = 0;
		String forRegex = "([+-/*].*)";
		for (int i = 0; i < list.size(); ++i) {
			boolean regex = list.get(i).matches(forRegex);
			if (regex) {
				if (list.get(i).contains("*") || list.get(i).contains("/")) {
					if (list.get(i).contains("*")) {
						previousValue = Double.parseDouble(list.get(i - 1));
						subsequentValue = Double.parseDouble(list.get(i + 1));
						temp = previousValue * subsequentValue;
						String res = String.valueOf(temp);
						list.set(i, res);
						list.remove(i - 1);
						list.remove(i);
						i = i - 1;
					} else {
						previousValue = Double.parseDouble(list.get(i - 1));
						subsequentValue = Double.parseDouble(list.get(i + 1));
						if (subsequentValue == 0) {
							throw new DivisionByZeroException();
						}
						temp = previousValue / subsequentValue;
						String res = String.valueOf(temp);
						list.set(i, res);
						list.remove(i - 1);
						list.remove(i);
						i = i - 1;
					}
				}
			}
		}
		
		for (int i = 0; i < list.size(); ++i) {
			boolean regex = list.get(i).matches(forRegex);
			if (regex) {
				if (list.get(i).contains("+") || list.get(i).contains("-")) {
					if (list.get(i).contains("+")) {
						previousValue = Double.parseDouble(list.get(i - 1));
						subsequentValue = Double.parseDouble(list.get(i + 1));
						temp = previousValue + subsequentValue;
						String res = String.valueOf(temp);
						list.set(i, res);
						list.remove(i - 1);
						list.remove(i);
						i = i - 1;
					} else {
						previousValue = Double.parseDouble(list.get(i - 1));
						subsequentValue = Double.parseDouble(list.get(i + 1));
						temp = previousValue - subsequentValue;
						String res = String.valueOf(temp);
						list.set(i, res);
						list.remove(i - 1);
						list.remove(i);
						i = i - 1;
					}
				}
			}
		}
		result = Double.parseDouble(list.get(0));
		setResult(result);
		return result;
	}
}

