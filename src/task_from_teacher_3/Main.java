package task_from_teacher_3;

public class Main {

	public static void main(String[] args) {

		FractionsMedvedev a = new FractionsMedvedev(351, 2, (short) 34);
		FractionsMedvedev b = new FractionsMedvedev(511,  3, (short) 4);

		summ(a, b);
		subtraction(a, b);
	}

	// Данный метод сумирует 2 числа типа FractionsMedvedev.
	public static void summ(FractionsMedvedev a, FractionsMedvedev b) {

		long IntegerPartSumm = a.getIntegerPart() + b.getIntegerPart();
		double FractionPartA = (double) (a.getFractionPart() / (double) Math.pow(10, a.getDegreeOfFractionalPart()));
		double FractionPartB = (double) (b.getFractionPart() / (double) Math.pow(10, b.getDegreeOfFractionalPart()));
		double FractionPartSumm = FractionPartA + FractionPartB;
		if (FractionPartSumm >= 1) {
			IntegerPartSumm += 1;
			FractionPartSumm += -1;
		}
		System.out.print((a.getIntegerPart() + FractionPartA) + " + " + (b.getIntegerPart() + FractionPartB) + " = ");
		System.out.println(IntegerPartSumm + FractionPartSumm);
	}
	
	// Данный метод вычитает 2 числа типа FractionsMedvedev.
	public static void subtraction(FractionsMedvedev a, FractionsMedvedev b) {

		long IntegerPartSubtr = a.getIntegerPart() - b.getIntegerPart();
		double FractionPartA = (double) (a.getFractionPart() / (double) Math.pow(10, a.getDegreeOfFractionalPart()));
		double FractionPartB = (double) (b.getFractionPart() / (double) Math.pow(10, b.getDegreeOfFractionalPart()));
		double FractionPartSubtr = FractionPartA - FractionPartB;
		if (FractionPartSubtr < 0) {
			IntegerPartSubtr -= 1;
			FractionPartSubtr +=1;
		}
		System.out.print((a.getIntegerPart() + FractionPartA) + " - " + (b.getIntegerPart() + FractionPartB) + " = ");
		System.out.println(IntegerPartSubtr + FractionPartSubtr);
	}
}
	
	
	
