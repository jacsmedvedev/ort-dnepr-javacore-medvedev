package task_from_teacher_10;

import java.time.LocalDate;


public class Visa {
	private VisaType _visaType;
	private DepartureCountry _departureCountry;
	private LocalDate _openingDate;
	private LocalDate _closingDate;
	
	
	public Visa( final VisaType visaType, 
				 final DepartureCountry departureCountry,
				 final LocalDate openingDate, 
				 final LocalDate closingDate
				 ) {
		super();
		_visaType = visaType;
		_departureCountry = departureCountry;
		_openingDate = openingDate;
		_closingDate = closingDate;
	}
	
	public Visa(){};
	
	public VisaType getVisaType() {
		return  _visaType;
	}
	public void setVisaType(VisaType visaType) {
		_visaType = visaType;
	}
	public DepartureCountry getForeignCountries() {
		return _departureCountry;
	}

	public void setForeignCountries(DepartureCountry departureCountry) {
		_departureCountry = departureCountry;
	}

	public LocalDate getOpeningDate() {
		return _openingDate;
	}
	public void setOpeningDate(LocalDate openingDate) {
		_openingDate = openingDate;
	}
	public LocalDate getClosingDate() {
		return _closingDate;
	}
	public void setClosingDate(LocalDate closingDate) {
		_closingDate = closingDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nТип визы:              ")
		  .append(_visaType)
		  .append("\nСтрана следования:     ")
		  .append(_departureCountry)
		  .append("\nВиза действительна от: ")
		  .append(_openingDate)
		  .append("\nдо:                    ")
		  .append(_closingDate)
		  .append("\n");
		return sb.toString();
	}
}
