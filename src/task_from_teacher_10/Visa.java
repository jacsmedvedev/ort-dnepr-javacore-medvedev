package task_from_teacher_10;

import java.time.LocalDate;


public class Visa {
	private VisaType _visaType;
	private LocalDate _openingDate;
	private LocalDate _closingDate;
	private Sex _sex;
	
	public Visa( final VisaType visaType, 
				 final LocalDate openingDate, 
				 final LocalDate closingDate, 
				 final Sex sex) {
		super();
		_visaType = visaType;
		_openingDate = openingDate;
		_closingDate = closingDate;
		_sex = sex;
	}
	
	public Visa(){};
	
	public VisaType getVisaType() {
		return  _visaType;
	}
	public void setVisaType(VisaType visaType) {
		_visaType = visaType;
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
	public Sex getSex() {
		return _sex;
	}
	public void setSex(Sex sex) {
		_sex = sex;
	}
}
