package printC1_animal_1;

public class Sheep extends Animal{
	
	String fur;

	public Sheep(String name, String kind, int weight, String fur) {
		super(name, kind, weight);
		setFur(fur);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return fur
	 */
	public String getFur() {
		return fur;
	}

	/**
	 * @param fur セットする fur
	 */
	public void setFur(String fur) {
		this.fur = fur;
	}
	
	void showFur() {
		System.out.println("羊の毛並みは%sです。"
				.formatted(getFur()));
	}
	
	@Override
	public void cry() {
		System.out.println("羊の鳴き声はメーメーです。");
	}
}
