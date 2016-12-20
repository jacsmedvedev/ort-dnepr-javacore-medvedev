package task_from_teacher_10;


import java.util.ArrayList;
import java.time.LocalDate;

public class InternationalPassport extends Pasport {
		
	private ArrayList <Visa> _visa = new ArrayList<Visa>();
	private Integer _internationalPassportID;
	
	public InternationalPassport() {
		super();	
	}
	public InternationalPassport(
			VisaType visaType,
			ForeignCountries foreignCountries,
			LocalDate openingDate, 
			LocalDate closingDate,
			Integer internationalPassportID,
			Country country, 
			String pasportSeries, 
			int pasportNumber, 
			String surname, 
			String name,
			String patronymic, 
			int yearOfBirthday, 
			int mounthOfBirthday, 
			int dayOfBirthday, 
			String birthplace, 
			int yearOfIssue,
			int mounthOfIssue, 
			int dayOfIssu) {
		super(country, pasportSeries, pasportNumber, surname, name, patronymic, 
				yearOfBirthday, mounthOfBirthday, dayOfBirthday, birthplace, yearOfIssue,mounthOfIssue,dayOfIssu);
		setVisa(visaType, foreignCountries, openingDate, closingDate);
		_internationalPassportID = internationalPassportID;
	}
	
	public ArrayList <Visa> getVisa() {
		return _visa;
	}
	public void setVisa(VisaType visaType, ForeignCountries foreignCountries, 
						LocalDate openingDate, LocalDate closingDate)
	{
		 _visa.add(new Visa(visaType, foreignCountries, openingDate, closingDate));
	}

	public Integer getInternationalPassportID() {
		return _internationalPassportID;
	}

	public void setInternationalPassportID(Integer internationalPassportID) {
		_internationalPassportID = internationalPassportID;
	}
}
