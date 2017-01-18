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
	
	// Данный метод суммирует 2 числа типа FractionsMedvedev.
	public void summ(FractionsMedvedev someNumber) {
		long commonDenominator;
		long numeratorPartSumm;
		if (this.getFractionPart() == someNumber.getFractionPart()){
			 commonDenominator = this.getFractionPart();
			 numeratorPartSumm = this.getIntegerPart() + someNumber.getIntegerPart();
		} else {
		commonDenominator = this.getFractionPart() * someNumber.getFractionPart();
		long intPartA = (commonDenominator / someNumber.getFractionPart()) * someNumber.getIntegerPart();
		long intPartB = (commonDenominator / this.getFractionPart()) * this.getIntegerPart();
		numeratorPartSumm = intPartA + intPartB;
		}
		double resultInDouble = (double) numeratorPartSumm / (double) commonDenominator;
		System.out.print(someNumber.getIntegerPart() + "/" + someNumber.getFractionPart() + " + " +
				this.getIntegerPart() + "/"+ this.getFractionPart() + " = ");
		System.out.println(numeratorPartSumm + "/" + commonDenominator + " или " + resultInDouble);
	}

	// Данный метод вычитает 2 числа типа FractionsMedvedev.
	public void subtraction(FractionsMedvedev someNumber) {
		long commonDenominator;
		long numeratorPartSubtr;
		if (this.getFractionPart() == someNumber.getFractionPart()){
			 commonDenominator = this.getFractionPart();
			 numeratorPartSubtr = this.getIntegerPart() - someNumber.getIntegerPart();
		} else {
		commonDenominator = this.getFractionPart() * someNumber.getFractionPart();
		long intPartA = (commonDenominator / this.getFractionPart()) * this.getIntegerPart();
		long intPartB = (commonDenominator / someNumber.getFractionPart()) * someNumber.getIntegerPart();
		numeratorPartSubtr = intPartA - intPartB;
		}
		double resultInDouble = (double) numeratorPartSubtr / (double) commonDenominator;
		System.out.print(this.getIntegerPart() + "/" + this.getFractionPart() + " - " + someNumber.getIntegerPart() + "/"
				+ someNumber.getFractionPart() + " = ");
		System.out.println(numeratorPartSubtr + "/" + commonDenominator + " или " + resultInDouble);
	}

	// Данный метод умножает 2 числа типа FractionsMedvedev.
	public void multiplication(FractionsMedvedev someNumber) {
		long multNumerators = this.getIntegerPart() * someNumber.getIntegerPart();
		long multDenominators = this.getFractionPart() * someNumber.getFractionPart();
		double resultInDouble = (double) multNumerators / (double) multDenominators;
		if (multNumerators > multDenominators) {
			long intQuantity = (multNumerators / multDenominators);
			long numerator = multNumerators - (intQuantity * multDenominators);
			System.out.print(this.getIntegerPart() + "/" + this.getFractionPart() + " * " + someNumber.getIntegerPart() + "/"
					+ someNumber.getFractionPart() + " = ");
			System.out.println(intQuantity + " " + numerator + "/" + multDenominators + " или " + resultInDouble);
		} else {
			System.out.print(this.getIntegerPart() + "/" + this.getFractionPart() + " * " + someNumber.getIntegerPart() + "/"
					+ someNumber.getFractionPart() + " = ");
			System.out.println(multNumerators + "/" + multDenominators + " или " + resultInDouble);
		}
	}

	// Данный метод сравнивает 2 числа типа FractionsMedvedev.
	public void comparison(FractionsMedvedev someNumber) {
		System.out.print(this.getIntegerPart() + "/" + this.getFractionPart() + " и " + someNumber.getIntegerPart() + "/"
				+ someNumber.getFractionPart() + " - ");
		double numerator = (double) this.getIntegerPart() / (double) this.getFractionPart();
		double denominator = (double) someNumber.getIntegerPart() / (double) someNumber.getFractionPart();
		if (numerator == denominator) {
			System.out.println("числа равны");
		} else if (numerator > denominator) {
			System.out.println("первое число больше второго");
		} else {
			System.out.println("второе число больше первого");
		}
	}
}

