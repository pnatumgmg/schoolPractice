package printA1_Vehicle_1;

public class Vehicle {
	private String kind;
	private String color;
	private int speed;
	
	Vehicle(String kind,String color,int speed){
		this.setKind(kind);
		this.setColor(color);
		this.setSpeed(speed);
	}
	
	void setKind(String kind) {
		this.kind = kind;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}

	String getKind() {
		return this.kind;
	}
	
	String getColor() {
		return this.color;
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	void drivingSpeed() {
		System.out.println("運転速度は%dkmです".formatted(getSpeed()));
	}
	
	void introduction() {
		System.out.println("私は%sの色は%sです".formatted(getKind(),getColor()));
	}
	
	
}
