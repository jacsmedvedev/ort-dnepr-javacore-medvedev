package task_from_teacher_14;

import java.util.ArrayList;

public class SimpleCalculatorService implements CalculatorService {
	
	private double _result;
	
	public SimpleCalculatorService() {
		super();
	}

	public double getResult() {
		return _result;
	}

	public void setResult(double result) {
		_result = result;
	}

	@Override
	public double evaluate(ArrayList<String> list) throws DivisionByZeroException{
		double temp = 0;
		double result = 0;
		for (int i = 0; i < list.size(); ++i){
			if (list.get(i).contains("*") || list.get(i).contains("/")) {
				if (list.get(i).contains("*")){
					double pred = Double.parseDouble(list.get(i-1));
					double sled = Double.parseDouble(list.get(i+1));
					temp = pred*sled;
					String res = String.valueOf(temp);
					list.set(i,res);
					list.remove(i-1);
					list.remove(i);
					i=i-1;
				} else {
					double pred = Double.parseDouble(list.get(i-1));
					double sled = Double.parseDouble(list.get(i+1));
					if (sled == 0){
						throw new DivisionByZeroException();
					}
					temp = pred/sled;
					String res = String.valueOf(temp);
					list.set(i,res);
					list.remove(i-1);
					list.remove(i);
					i=i-1;
				}
			}
			if (i == list.size()){
				i=1;
			}
		}
	
		for (int i = 0; i < list.size(); ++i){
			if (list.get(i).contains("+") || list.get(i).contains("-")) {
				if (list.get(i).contains("+")){
					double pred = Double.parseDouble(list.get(i-1));
					double sled = Double.parseDouble(list.get(i+1));
					temp = pred+sled;
					String res = String.valueOf(temp);
					list.set(i,res);
					list.remove(i-1);
					list.remove(i);
				i=i-1;
				} else {
					double pred = Double.parseDouble(list.get(i-1));
					double sled = Double.parseDouble(list.get(i+1));
				    temp = pred-sled;
					String res = String.valueOf(temp);
					list.set(i,res);
					list.remove(i-1);
					list.remove(i);
					i=i-1;
				}
			}
			if (i == list.size()){
				i=1;
			}
		}
		
		 result = Double.parseDouble(list.get(0));
		 setResult(result);
		return result;
	}
}

