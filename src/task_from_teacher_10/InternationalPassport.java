package task_from_teacher_10;

import java.time.LocalDate;

public class InternationalPassport extends Pasport {
		
	private Visa _visa;
	private Integer _internationalPassportID;
	
	public InternationalPassport() {
		super();	
	}
	public InternationalPassport(
			Visa visa,
			Integer internationalPassportID,
			Country country, 
			String pasportSeries, 
			int pasportNumber, 
			String surname, 
			String name,
			String patronymic, 
			int year, 
			int mounth, 
			int day, 
			String birthplace, 
			int age) {
		super(country, pasportSeries, pasportNumber, surname, name, patronymic, year, mounth, day, birthplace, age);
		_visa = visa;
		_internationalPassportID = internationalPassportID;
	}
	public Visa getVisa() {
		return _visa;
	}
	public void setVisa(VisaType visaType, 
						LocalDate openingDate,
						LocalDate closingDate,
						Sex sex)
	{
		this._visa = new Visa(visaType, LocalDate.now(), LocalDate.of(2017, 12, 31), sex);
	}

	public Integer getInternationalPassportID() {
		return _internationalPassportID;
	}

	public void setInternationalPassportID(Integer internationalPassportID) {
		_internationalPassportID = internationalPassportID;
	}
}
