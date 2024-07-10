package printTimeAPI_1.questions02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat
				("yyyy年MM月dd日(E) HH時mm分dd秒");
		System.out.println(f.format(d2));
	}

}
