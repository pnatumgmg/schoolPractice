package print6_1.questions06;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String weather = getWeatherMessage();
		System.out.println(weather);
	}
	
	public static String getWeatherMessage() {
		String [] when = {"今日","明日","明後日"};
		String [] weather = {"晴れ","曇り","雨","雪"};
		Random rand = new Random();
		int when_r = rand.nextInt(when.length);
		int weather_r = rand.nextInt(weather.length);
		
		return when[when_r] + "の天気は" + weather[weather_r] + "でしょう";
	}

}
