package printA2_Person_1;

public class Day {
	private int year;
	private int month;
	private int day;
	
	Day(int year,int month,int day){
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setMonth(int month) {
		this.month = month;
	}
	
	void setDay(int day) {
		this.day = day;
	}
	
	int getYear() {
		return this.year;
	}
	
	int getMonth() {
		return this.month;
	}
	
	int getDay() {
		return this.day;
	}
	
	

}
