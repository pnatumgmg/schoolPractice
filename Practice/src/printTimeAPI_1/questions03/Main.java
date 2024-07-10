package printTimeAPI_1.questions03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern
				("yyyy年MM月dd日(E) HH時mm分ss秒");
		String str = l1.format(fmt);
		System.out.println(str);
	}
}
