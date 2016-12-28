package task_from_teacher_10;


import java.util.ArrayList;
import java.time.LocalDate;

public class InternationalPassport extends Pasport {
		
	private static final int DEFAULT_ID = 00000000;
	private Integer _internationalPassportID;
	private Pasport _ukrainePasport = new Pasport();
	private ArrayList <Visa> _visa = new ArrayList<Visa>();
	
	
	public InternationalPassport() {
		super();	
	}
	
	public InternationalPassport(
			Integer internationalPassportID,
			Pasport ukrainePasport,
			VisaType visaType,
			DepartureCountry departureCountry,
			LocalDate openingDate, 
			LocalDate closingDate) {
		super();
		_internationalPassportID = internationalPassportID;
		_ukrainePasport = ukrainePasport;
		setVisa(visaType, departureCountry, openingDate, closingDate);
	}
	
	public InternationalPassport(Integer internationalPassportID) {
		super();
		_internationalPassportID = DEFAULT_ID;
	}
	
	public Pasport getUkrainePasport() {
		return _ukrainePasport;
	}
	public void setUkrainePasport(Pasport ukrainePasport) {
		this._ukrainePasport = ukrainePasport;
	}
	public ArrayList <Visa> getVisa() {
		return _visa;
	}
	public void setVisa(VisaType visaType, DepartureCountry departureCountry, 
						LocalDate openingDate, LocalDate closingDate)
	{
		 _visa.add(new Visa(visaType, departureCountry, openingDate, closingDate));
	}

	public Integer getInternationalPassportID() {
		return _internationalPassportID;
	}

	public void setInternationalPassportID(Integer internationalPassportID) {
		if (internationalPassportID != null){
			_internationalPassportID = internationalPassportID;
		} else {
			_internationalPassportID = DEFAULT_ID;
		}
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nInternationalPassport ID: ")
		  .append(getInternationalPassportID())
		  .append("\n")
		  .append(getUkrainePasport())
		  .append("\n")
		  .append(getVisa())
		  .append("\n");
		return sb.toString();
	}
}