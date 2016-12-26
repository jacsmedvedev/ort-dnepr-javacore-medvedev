package task_from_teacher_3;

public class Main {

	public static void main(String[] args) {

		FractionsMedvedev a = new FractionsMedvedev(112 ,(short) 43);
		FractionsMedvedev b = new FractionsMedvedev(111,(short) 43);

		summ(a, b);
		subtraction(a, b);
		multiplication(a, b);
		comparison(a, b);
	}

	// Данный метод сумирует 2 числа типа FractionsMedvedev.
	public static void summ(FractionsMedvedev a, FractionsMedvedev b) {
		long commonDenominator = a.getFractionPart() * b.getFractionPart();
		long intPartA = (commonDenominator / a.getFractionPart()) * a.getIntegerPart();
		long intPartB = (commonDenominator / b.getFractionPart()) * b.getIntegerPart();;
		long numeratorPartSumm = intPartA + intPartB;
		double resultInDouble = (double)numeratorPartSumm / (double)commonDenominator;
		System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " + " +
						 b.getIntegerPart() + "/" + b.getFractionPart() + " = ");
		System.out.println(numeratorPartSumm + "/" + commonDenominator + " или " + resultInDouble);
	}
	
	// Данный метод вычитает 2 числа типа FractionsMedvedev.
	public static void subtraction(FractionsMedvedev a, FractionsMedvedev b) {
		long commonDenominator = a.getFractionPart() * b.getFractionPart();
		long intPartA = (commonDenominator / a.getFractionPart()) * a.getIntegerPart();
		long intPartB = (commonDenominator / b.getFractionPart()) * b.getIntegerPart();;
		long numeratorPartSumm = intPartA - intPartB;
		double resultInDouble = (double)numeratorPartSumm / (double)commonDenominator;
		System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " - " +
						 b.getIntegerPart() + "/" + b.getFractionPart() + " = ");
		System.out.println(numeratorPartSumm + "/" + commonDenominator + " или " + resultInDouble);
	}
	
	// Данный метод умножает 2 числа типа FractionsMedvedev.
		public static void multiplication(FractionsMedvedev a, FractionsMedvedev b) {
			long multNumerators = a.getIntegerPart() * b.getIntegerPart();
			long multDenominators = a.getFractionPart() * b.getFractionPart();
			double resultInDouble = (double)multNumerators / (double)multDenominators;
			if (multNumerators > multDenominators){
				long intQuantity = (multNumerators / multDenominators);
				long numerator = multNumerators - (intQuantity * multDenominators);
				System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " * " +
								 b.getIntegerPart() + "/" + b.getFractionPart() + " = ");
				System.out.println(intQuantity + " " + numerator + "/" + multDenominators + " или " + resultInDouble);
			} else {
				System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " * " +
								 b.getIntegerPart() + "/" + b.getFractionPart() + " = ");
				System.out.println(multNumerators + "/" + multDenominators + " или " + resultInDouble);
			}
		}
		
		// Данный метод сравнивает 2 числа типа FractionsMedvedev.
		public static void comparison(FractionsMedvedev a, FractionsMedvedev b) {
			System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " и " +
							 b.getIntegerPart() + "/" + b.getFractionPart() + " - ");
			double numerator = (double)a.getIntegerPart() / (double)a.getFractionPart();
			double denominator = (double)b.getIntegerPart() / (double)b.getFractionPart();
			if (numerator == denominator){
				System.out.println("числа равны");
			} else if (numerator > denominator){
				System.out.println("первое число больше второго");
			} else {
				System.out.println("второе число больше первого");
			}
	}
}
	

//if ((a.getIntegerPart() == b.getIntegerPart()) && (a.getFractionPart() == b.getFractionPart())) {
//System.out.println("числа равны");
//} else if ((a.getIntegerPart() == b.getIntegerPart()) && (a.getFractionPart() < b.getFractionPart()) ||
//	   (a.getIntegerPart() > b.getIntegerPart()) && (a.getFractionPart() == b.getFractionPart())) {
//System.out.println("первое число больше второго");
//} else {
//System.out.println("второе число больше первого");
//}
	
	
