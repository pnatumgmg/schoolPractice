package printTimeAPI_1.questions01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(f.format(d1));
		
	}
	
}
