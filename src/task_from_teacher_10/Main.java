package task_from_teacher_10;

import java.util.Arrays;
import java.time.LocalDate;

/**
 * 
 * In this class we declared and initialized object InternationalPassport.
 * 
 * @author Yakov Medvedev
 */
public class Main {
	
	public static void main(String[] args) {
		InternationalPassport interPas = new InternationalPassport(
				63546236,
				new Pasport(Country.Ukraine, "СЮ", 3344261,
						"Medvedev", "Yakov", "Ivanovich",
						1989,9,5, "Tokmak", 2006,5,5),
				VisaType.Tourist, 
				DepartureCountry.UnitedKingdom,
				LocalDate.of(2016, 12, 19),  LocalDate.of(2017, 12, 31));
		
		/**Visa addition*/
		interPas.setVisa(VisaType.Diplomatic, 
				  		DepartureCountry.Italy, 
				  		LocalDate.of(2016, 12, 10),
				  		LocalDate.of(2017, 6, 9));

		System.out.println(interPas.toString());
	}
}
