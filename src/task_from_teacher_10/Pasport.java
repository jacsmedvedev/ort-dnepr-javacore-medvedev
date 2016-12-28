/** 
 * Task №10
 * 
 *  Создайте класс Passport, который будет содержать 
 *  паспортные данные гражданина Украниы. 
 *  С помощью наследования (расширения), 
 *  создайте класс ForeignPassport (паспорт для выезда за границу) 
 *  производный от Passport. 
 *  Загранпаспорт содержит данные о визах и номер загранпаспорта. 
 *  Визу рекомендую реализовать как отдельный класс
 *  и типом визы и датой открытия и закрытия 
 *  (плюс дополнительные свойства на ваше усмотрение).
 * 
 * @author Yakov Medvedev
 * 
 */
package task_from_teacher_10;

import java.time.LocalDate;

public class Pasport {
	private Country _country;
	private String _pasportSeries;
	private int _pasportNumber;
	private String _surname;
	private String _name;
	private String _patronymic;
	private LocalDate _birthday;
	private String _birthplace;
	private LocalDate _dateOfIssue;
	
	public Pasport (
			final Country country,
			final String pasportSeries,
			final int pasportNumber,
			final String surname,
			final String name,
			final String patronymic,
			final int yearOfBirthday,
			final int mounthOfBirthday, 
			final int dayOfBirthday,
			final String birthplace,
			final int yearOfIssue,
			final int mounthOfIssue, 
			final int dayOfIssue) {
		super();
		setCountry(country);
		setPasportSeries(pasportSeries);
		setPasportNumber(pasportNumber);
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setBirthday(yearOfBirthday,mounthOfBirthday,dayOfBirthday);
		setBirthplace(birthplace);
		setDateOfIssue(yearOfIssue,mounthOfIssue,dayOfIssue);
	}
	
	public Pasport () {}
	
	

	public Country getCountry() {
		return _country;
	}

	public void setCountry(Country country) {
		_country = country;
	}

	public String getPasportSeries() {
		return _pasportSeries;
	}

	public void setPasportSeries(String pasportSeries) {
		this._pasportSeries = pasportSeries;
	}

	public int getPasportNumber() {
		return _pasportNumber;
	}

	public void setPasportNumber(int pasportNumber) {
		this._pasportNumber = pasportNumber;
	}

	public String getSurname() {
		return _surname;
	}
	public void setSurname(String surname) {
		this._surname = surname;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public String getPatronymic() {
		return _patronymic;
	}
	public void setPatronymic(String patronymic) {
		this._patronymic = patronymic;
	}
	
	public LocalDate getBirthday() {
		return _birthday;
	}
	public void setBirthday(int y, int m, int d) {
		this._birthday = LocalDate.of(y, m, d);
	}
	
	public String getBirthplace() {
		return _birthplace;
	}
	public void setBirthplace(String birthplace) {
		this._birthplace = birthplace;
	}

	public void setDateOfIssue(int y2, int m2, int d2) {
		this._dateOfIssue = LocalDate.of(y2, m2, d2);
	}
	public LocalDate getDateOfIssue() {
		return _dateOfIssue;
	}
	
	@Override
	 	public String toString(){
		StringBuilder sb = new StringBuilder();	
		sb.append("\nСтрана: ")
		  .append(getCountry())
		  .append("\nСерия и номер паспорта: ")
		  .append(getPasportSeries())
		  .append(" ")
		  .append(getPasportNumber())
		  .append("\n")
		  .append(getName())
		  .append(" ")
          .append(getSurname())
		  .append(" ")
	      .append(getPatronymic())
          .append("\nДата рождения: ")
		  .append(getBirthday())
		  .append("\nГород: ")
		  .append(getBirthplace())
		  .append("\nДата выдачи документа: ")
		  .append(getDateOfIssue());
		return sb.toString();
	}
}
