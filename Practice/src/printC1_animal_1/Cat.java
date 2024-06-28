package printC1_animal_1;

public class Cat extends Animal{
	
	String feed; 
	
	public Cat(String name, String kind, int weight, String feed) {
		super(name, kind, weight);
		setFeed(feed);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	/**
	 * @return feed
	 */
	public String getFeed() {
		return feed;
	}

	/**
	 * @param feed セットする feed
	 */
	public void setFeed(String feed) {
		this.feed = feed;
	}

	
	void showFeed() {
		System.out.println("好きな餌は%sです。"
				.formatted(getFeed()));
	}
	
	@Override
	public void cry() {
		System.out.println("鳴き声はニャーニャーです。");
	}

}
