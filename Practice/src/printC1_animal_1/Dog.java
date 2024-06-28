package printC1_animal_1;

public class Dog extends Animal{
	
	public Dog(String name, String kind, int weight, String course) {
		super(name, kind, weight);
		setCourse(course);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	String course;

	/**
	 * @return course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course セットする course
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	void showCourse() {
		System.out.println("お散歩コースは%sです。"
				.formatted(getCourse()));
	}
	
	@Override
	public void cry() {
		System.out.println("鳴き声はワンワンです。");
	}
}
