package printA1_Vehicle_1;

public class Car extends Vehicle{
	//3-2
	private String brand;
	//3-3
	Car(String kind,String color,int speed,String brand){
		super(kind,color,speed);
		setBrand(brand);
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	String getBrand() {
		return this.brand;
	}
	
	@Override
	void introduction() {
		System.out.println("私の%sの色は%sです。メーカーは%sです。"
				.formatted(getKind(),getColor(),getBrand()));
	}
	
	

}
