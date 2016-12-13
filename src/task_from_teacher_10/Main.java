/**
 * 
 * In this class we declared and initialized object InternationalPassport.
 * 
 * @author Yakov Medvedev
 */

package task_from_teacher_10;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		InternationalPassport interPas = new InternationalPassport(
				new Visa (VisaType.Tourist,
						  LocalDate.now(),
					      LocalDate.of(2017,12,31),
						  Sex.Male),
				67354434,
				Country.Ukraine,
				"СЮ",
				3344261,
				"Yakov",
				"Medvedev",
				"Ivanovich",1989,9,5,
				"Tokmak",
				27);
		
	ipToString(interPas);
	}

	private static void ipToString(InternationalPassport interPas) {

		StringBuilder sb = new StringBuilder();
			sb.append(interPas.getVisa().getVisaType())
			  .append("\n")
			  .append("ID ")
			  .append(interPas.getInternationalPassportID())
			  .append("\n")
			  .append(interPas.getVisa().getOpeningDate())
			  .append("\n")
			  .append(interPas.getVisa().getClosingDate())
			  .append("\n")
			  .append(interPas.getVisa().getSex())
			  .append("\n")
			  .append(interPas.getInternationalPassportID())
			  .append("\n")
			  .append(interPas.getCountry())
			  .append("\n")
			  .append(interPas.getPasportSeries())
			  .append(" ")
			  .append(interPas.getPasportNumber())
			  .append("\n")
			  .append(interPas.getName())
			  .append(" ")
	          .append(interPas.getSurname())
			  .append(" ")
		      .append(interPas.getPatronymic())
	          .append("\n")
			  .append(interPas.getBirthday())
			  .append("\n")
			  .append(interPas.getBirthplace())
			  .append("\n")
			  .append("Age ")
			  .append(interPas.getAge());
	 System.out.println(sb.toString());
	}
}
