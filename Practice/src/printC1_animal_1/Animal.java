package printC1_animal_1;

public abstract class Animal {
	protected String name; //名前
	protected String kind; //属性(動物の種類)
	protected int weight;  //体重
	
	//コンストラクタ
	public Animal(String name, String kind, int weight){
	this.name = name; this.kind = kind; this.weight = weight;
	}
	//具象メソッド
	//名前、属性、体重を表示
	public void Attribution() {
	System.out.println("名前は" + getName() + "です。");
	System.out.println("属性は" + getKind() + "です。");
	System.out.println("体重は" + getWeight ()+ "kg です。");
	}
	//抽象メソッド
	//鳴き声を表示
	public abstract void cry();
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return kind
	 */
	public String getKind() {
		return kind;
	}
	/**
	 * @param kind セットする kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
	/**
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight セットする weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static Animal compWeight(Animal a,Animal b) {
		if (a.getWeight() < b.getWeight()) {
			return a;
		}else {
			return b;
		}
	}
}
