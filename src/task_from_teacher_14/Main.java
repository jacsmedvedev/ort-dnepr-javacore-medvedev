package task_from_teacher_14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ConsoleUserInterface cui = new ConsoleUserInterface();
		SimpleCalculatorService scs = new SimpleCalculatorService();
		CalculationHistory ch = new CalculationHistory();
		
		try {
			cui.start();
			cui.parseUserInput(cui.getUserExpression());
			cui.validateValueLimit(cui.getNumsAndOprs());
			cui.validateFractionalPart(cui.getNumsAndOprs());
			cui.validateForLetters(cui.getUserExpression());
			System.out.println(cui.getNumsAndOprs());
			scs.evaluate(cui.getNumsAndOprs());
			ch.saveToFile(ch.stringBuilding(ch.getFormatedDate(),cui.getUserExpression() , scs.getResult()));
			System.out.println(scs.getResult());
			
			while(true){
			System.out.println("Нажмите 1 для повторного ввода выражения\n"
							 + "Нажмите 2, чтобы вызвать историю вычисленний\n" 
						+ "Нажмите 3 , чтобы выйти из приложения.");
				Scanner scan = new Scanner(System.in);
				int cs = scan.nextInt();
				switch (cs) {
				case 1:
					cui.start();
					break;
				case 2:
					ch.showHistory();
					break;
				case 3:
					System.out.println("App closed.");
					System.exit(0);
				default:
					System.out.println("App closed.");
					System.exit(0);
				}
			}
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ExpressionFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
