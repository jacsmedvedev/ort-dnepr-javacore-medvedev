package task_from_teacher_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class CalculationHistory implements HistoryDisplay {

	private Date _queryDate = new Date();
	private List _calculationHistoryList = new ArrayList<String>();
	
	public CalculationHistory() {
	}

	public Date getQueryDate() {
		
		return _queryDate;
	}

	public void setQueryDate(Date queryDate) {
		_queryDate = queryDate;
	}
	
	public List getCalculationHistoryList() {
		return _calculationHistoryList;
	}

	public void setCalculationHistoryList(List calculationHistoryList) {
		_calculationHistoryList = calculationHistoryList;
	}
	
	public String getFormatedDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss a");
		String res = dateFormat.format(getQueryDate());
		return res;
	}
	
	/**Forms string that saves to file*/
	public String stringBuilding(String date, String query, double result){
		StringBuilder sb = new StringBuilder();
		sb.append(date)
		  .append(" Query: ")
		  .append(query)
		  .append(" Result: ")
		  .append(result)
		  .append("\n");
		return sb.toString();
	}
	
	/** Save user input expression, date end result to file*/
	public void saveToFile(String strToSave) throws IOException{
		File saveFile = new File("Calculation_history.txt");
		try (BufferedWriter w = new BufferedWriter(new FileWriter(saveFile, true))) {
			w.write(strToSave);
		} catch (IOException e) {
			throw new IOException("Ошибка записи в файл", e);
		}
	}
	
	/**Method displays calculationhistory in console.*/
	@Override
	public void showHistory() {
		List list = new ArrayList<String>();
		try (Scanner s = new Scanner(new File("Calculation_history.txt"))) {
			while (s.hasNextLine()) {
				String query = s.nextLine();
				System.out.println(query);
				list.add(query);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
