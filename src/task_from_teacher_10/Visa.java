package task_from_teacher_10;

import java.time.LocalDate;


public class Visa {
	private VisaType _visaType;
	private ForeignCountries _foreignCountries;
	private LocalDate _openingDate;
	private LocalDate _closingDate;
	
	
	public Visa( final VisaType visaType, 
				 final ForeignCountries foreignCountries,
				 final LocalDate openingDate, 
				 final LocalDate closingDate
				 ) {
		super();
		_visaType = visaType;
		_foreignCountries = foreignCountries;
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
	public ForeignCountries getForeignCountries() {
		return _foreignCountries;
	}

	public void setForeignCountries(ForeignCountries foreignCountries) {
		_foreignCountries = foreignCountries;
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
		  .append(_foreignCountries)
		  .append("\nВиза действительна от: ")
		  .append(_openingDate)
		  .append("\nдо:                    ")
		  .append(_closingDate)
		  .append("\n");
		return sb.toString();
	}
}
