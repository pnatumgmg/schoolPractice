package print9_bank_1;
/**
 * 【口座作成年月日を表すクラス】
 */
public class CreateDate {
	private int year;
	private int month;
	private int day;
	
	CreateDate(int year, int month, int day){
		setAll(year,month,day);
	}
	
	int getYear() {
		return this.year;
	}
	
	void setYear(int year){
		this.year = year;
	}
	
	int getMonth() {
		return this.month;
	}
	
	void setMonth(int month) {
		this.month = month;
	}
	
	int getDay() {
		return this.day;
	}
	
	void setDay(int day) {
		this.day = day;
	}
	
	void setAll(int year,int month,int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	void showCreateData() {
		System.out.println("口座作成日は%d年%d月%d日です。".formatted(getYear(),getMonth(),getDay()));
	}

}
