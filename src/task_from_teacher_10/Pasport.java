package task_from_teacher_10;


import java.time.LocalDate;

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

public class Pasport {
	private Country _country;
	private String _pasportSeries;
	private int _pasportNumber;
	private String _surname;
	private String _name;
	private String _patronymic;
	private LocalDate _birthday = LocalDate.of(1989, 9, 02);;
	private String _birthplace;
	private int _age;
	private LocalDate _dateOfIssue = LocalDate.now();
	
	public Pasport (
			final Country country,
			final String pasportSeries,
			final int pasportNumber,
			final String surname,
			final String name,
			final String patronymic,
			final int year,
			final int mounth, 
			final int day,
			final String birthplace,
			final int age) {
		super();
		setCountry(country);
		setPasportSeries(pasportSeries);
		setPasportNumber(pasportNumber);
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setBirthday(year,mounth,day);
		setBirthplace(birthplace);
		setBirthplace(birthplace);
		setAge(age);
		setDateOfIssue();
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
	public int getAge() {
		return _age;
	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("You  didn't born yet, son !!!!");
		}
		this._age = age;
	}
	public LocalDate getDateOfIssue() {
		return _dateOfIssue;
	}
	public void setDateOfIssue() {
		this._dateOfIssue = LocalDate.now();
	}
}
