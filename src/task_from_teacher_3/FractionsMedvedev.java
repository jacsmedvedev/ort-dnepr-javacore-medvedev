/**
 * Task №3.
 * 
 * Класс Дробное число со знаком (Fractions). 
 * Число должно быть представлено двумя полями: 
 * целая часть - длинное целое со знаком, 
 * дробная часть - беззнаковое короткое целое. 
 * Реализовать арифметические операции сложения, вычитания, умножения и операции сравнения. 
 * В функции main проверить эти методы
 * 
 * @author Yakov Medvedev
 */
package task_from_teacher_3;

/**
 * Класс состоит из 3-ех полей:
 * 1.Целая часть числа;
 * 2.Степень дробной части числа;
 * 3.Дробная часть числа.
 * 
 * @author Yakov Medvedev
 *
 */
public class FractionsMedvedev {

	private long  _integerPart;
	private short  _fractionPart;
	
	public FractionsMedvedev(long integerPart, short fractionPart) {
		super();
		_integerPart = integerPart;
		_fractionPart = fractionPart;
	}
	
	public FractionsMedvedev(){};
	
	public long getIntegerPart() {
		return _integerPart;
	}
	
	public void setIntegerPart(long integerPart) {
		_integerPart = integerPart;
	}
	
	public short getFractionPart() {
		return _fractionPart;
	}
	
	/** При параметре _degreeOfFractionalPart = 1 
	 * дробная часть числа не должна быть больше 9.
	 * */
	public void setFractionPart(short fractionPart) {
		_fractionPart = (short) Math.abs(fractionPart);
	}
	
	// Данный метод сумирует 2 числа типа FractionsMedvedev.
	public void summ(FractionsMedvedev a, FractionsMedvedev b) {
		long commonDenominator = a.getFractionPart() * b.getFractionPart();
		long intPartA = (commonDenominator / a.getFractionPart()) * a.getIntegerPart();
		long intPartB = (commonDenominator / b.getFractionPart()) * b.getIntegerPart();
		;
		long numeratorPartSumm = intPartA + intPartB;
		double resultInDouble = (double) numeratorPartSumm / (double) commonDenominator;
		System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " + " +
						 b.getIntegerPart() + "/"+ b.getFractionPart() + " = ");
		System.out.println(numeratorPartSumm + "/" + commonDenominator + " или " + resultInDouble);
	}

	// Данный метод вычитает 2 числа типа FractionsMedvedev.
	public void subtraction(FractionsMedvedev a, FractionsMedvedev b) {
		long commonDenominator = a.getFractionPart() * b.getFractionPart();
		long intPartA = (commonDenominator / a.getFractionPart()) * a.getIntegerPart();
		long intPartB = (commonDenominator / b.getFractionPart()) * b.getIntegerPart();
		;
		long numeratorPartSumm = intPartA - intPartB;
		double resultInDouble = (double) numeratorPartSumm / (double) commonDenominator;
		System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " - " + b.getIntegerPart() + "/"
				+ b.getFractionPart() + " = ");
		System.out.println(numeratorPartSumm + "/" + commonDenominator + " или " + resultInDouble);
	}

	// Данный метод умножает 2 числа типа FractionsMedvedev.
	public void multiplication(FractionsMedvedev a, FractionsMedvedev b) {
		long multNumerators = a.getIntegerPart() * b.getIntegerPart();
		long multDenominators = a.getFractionPart() * b.getFractionPart();
		double resultInDouble = (double) multNumerators / (double) multDenominators;
		if (multNumerators > multDenominators) {
			long intQuantity = (multNumerators / multDenominators);
			long numerator = multNumerators - (intQuantity * multDenominators);
			System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " * " + b.getIntegerPart() + "/"
					+ b.getFractionPart() + " = ");
			System.out.println(intQuantity + " " + numerator + "/" + multDenominators + " или " + resultInDouble);
		} else {
			System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " * " + b.getIntegerPart() + "/"
					+ b.getFractionPart() + " = ");
			System.out.println(multNumerators + "/" + multDenominators + " или " + resultInDouble);
		}
	}

	// Данный метод сравнивает 2 числа типа FractionsMedvedev.
	public void comparison(FractionsMedvedev a, FractionsMedvedev b) {
		System.out.print(a.getIntegerPart() + "/" + a.getFractionPart() + " и " + b.getIntegerPart() + "/"
				+ b.getFractionPart() + " - ");
		double numerator = (double) a.getIntegerPart() / (double) a.getFractionPart();
		double denominator = (double) b.getIntegerPart() / (double) b.getFractionPart();
		if (numerator == denominator) {
			System.out.println("числа равны");
		} else if (numerator > denominator) {
			System.out.println("первое число больше второго");
		} else {
			System.out.println("второе число больше первого");
		}
	}
}

