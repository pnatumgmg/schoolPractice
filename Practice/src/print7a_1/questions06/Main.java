package print7a_1.questions06;

public class Main {
	public static void main(String[] args) {
		String[] country = {"Japan","Australia","United States","China","Brazil"};
		int[] population = {126500000,25500000,331000000,1448500000,215400000};

//		final String FORMAT = "%-14s:%,14d";
		final String FORMAT = "%-14s:%,14d\n";

		for (int i = 0; i < country.length; i++) {
//			String s = String.format(FORMAT, country[i],population[i]);
//			System.out.println(s);
			System.out.printf(FORMAT,country[i],population[i]);
		}
	}	

}
