package print8_1.questions02;

public class Main {
	public static void main(String[] args) {
		Employee katsuo = new Employee();
		
		katsuo.id_data = 15001;
		katsuo.name_data = "磯野 かつお";
		katsuo.division_data = "営業部";
		katsuo.salary_data = 100000;
		
		katsuo.information();
		
		Employee wakame = new Employee();
		wakame.setAll(15002, "磯野 わかめ", "総務部", 200000);
		
		Employee hanako = new Employee();
		hanako.setAll(15004, "花沢 はな子", "総務部", 200000);
		
		Employee tarao = new Employee();
		tarao.setAll(15003, "フグ田 たらお", "営業部", 300000);
		
		Employee ikura = new Employee();
		ikura.setAll(15005, "波野 いくら", "営業部", 500000);
		
		System.out.println();
		katsuo.information();
		wakame.information();
		hanako.information();
		tarao.information();
		ikura.information();
	}

}
