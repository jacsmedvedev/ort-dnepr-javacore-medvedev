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
}
