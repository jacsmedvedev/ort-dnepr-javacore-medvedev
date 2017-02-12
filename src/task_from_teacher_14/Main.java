package task_from_teacher_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Main {
	
	public static void main(String[] args) {
		
		ConsoleUserInterface cui = new ConsoleUserInterface();
		SimpleCalculatorService scs = new SimpleCalculatorService();
		CalculationHistory ch = new CalculationHistory();
		
		try {
			cui.start();
			cui.parseUserInput(cui.getUserExpression());
			cui.validatorValueLimit(cui.getNumsAndOprs());
			cui.validatorFractionalPart(cui.getNumsAndOprs());
			cui.validatorForLetters(cui.getUserExpression());
			System.out.println(cui.getNumsAndOprs());
			scs.evaluate(cui.getNumsAndOprs());
			//ch.saveToFile(ch.stringBuilding(ch.getFormatedDate(),cui.getUserExpression() , scs.getResult()));
			System.out.println(scs.getResult());
			//ch.showHistory();
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ExpressionFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
