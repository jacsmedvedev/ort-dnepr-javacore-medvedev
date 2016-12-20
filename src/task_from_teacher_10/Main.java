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
				VisaType.Tourist, 
				ForeignCountries.UnitedKingdom,
				LocalDate.of(2016, 12, 19),  LocalDate.of(2017, 12, 31),
				67354434,
				Country.Ukraine,
				"СЮ", 3344261,
				"Medvedev", "Yakov", "Ivanovich",
				1989,9,5, "Tokmak", 2006,5,5);
		
		/**Visa addition*/
		interPas.setVisa(VisaType.Diplomatic, 
				  		ForeignCountries.Italy, 
				  		LocalDate.of(2016, 12, 10),
				  		LocalDate.of(2017, 6, 9));

	interPasToString(interPas);
	}

	private static void interPasToString(InternationalPassport interPas) {
		StringBuilder sb = new StringBuilder();
			sb.append(interPas.getVisa())
			  .append("\nInternationalPassport ID: ")
			  .append(interPas.getInternationalPassportID())
			  .append("\nСтрана: ")
			  .append(interPas.getCountry())
			  .append("\nСерия и номер паспорта: ")
			  .append(interPas.getPasportSeries())
			  .append(" ")
			  .append(interPas.getPasportNumber())
			  .append("\n")
			  .append(interPas.getName())
			  .append(" ")
	          .append(interPas.getSurname())
			  .append(" ")
		      .append(interPas.getPatronymic())
	          .append("\nДата рождения: ")
			  .append(interPas.getBirthday())
			  .append("\nГород: ")
			  .append(interPas.getBirthplace())
			  .append("\nДата выдачи документа: ")
			  .append(interPas.getDateOfIssue());
	 System.out.println(sb.toString());
	}
}
