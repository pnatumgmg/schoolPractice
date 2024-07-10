package printTimeAPI_1.questions04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		//1
		LocalDateTime l1 = LocalDateTime.of
				(1995, 1,17, 5,46,52);
		LocalDateTime l2 = LocalDateTime.of
				(2011, 3,11,14,46,18);

		//2
		LocalDate ld1 = l1.toLocalDate();
		LocalDate ld2 = l2.toLocalDate();

		//3
		LocalTime lt1 = l1.toLocalTime();
		LocalTime lt2 = l2.toLocalTime();

		//4
		Period p = Period.between(ld1, ld2);

		//5
		Duration d = Duration.between(lt1, lt2);

		//6
		printdif(p,d);
	}
	
	public static void printdif(Period p,Duration d) {
		int yea = p.getYears();
		int mon = p.getMonths();
		int day = p.getDays();
		int hou = d.toHoursPart();
		int min = d.toMinutesPart();
		int sec = d.toSecondsPart();
		System.out.println("%d年%dか月%d日%d時間%d分%d秒差です"
				.formatted(yea,mon,day,hou,min,sec));
	}
}