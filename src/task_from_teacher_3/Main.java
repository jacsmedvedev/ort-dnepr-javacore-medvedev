package task_from_teacher_3;

public class Main {

	public static void main(String[] args) {
		
		FractionsMedvedev testVar = new FractionsMedvedev();
		FractionsMedvedev a = new FractionsMedvedev(112 ,(short) 43);
		FractionsMedvedev b = new FractionsMedvedev(111,(short) 43);

		testVar.summ(a, b);
		testVar.subtraction(a, b);
		testVar.multiplication(a, b);
		testVar.comparison(a, b);
	}
}
