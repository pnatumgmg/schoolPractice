package printE1_brassband_1;

public class BrassBandClub {
	private int grade;
	private String name;
	private String instrument;
	
	public BrassBandClub(int grade, String name, String instrument) {
		setGrade(grade);
		setName(name);
		setInstrument(instrument);
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	//1-2
	@Override
	public String toString() {
		return "学年：%d、名前：%s、担当楽器：%s"
				.formatted(getGrade(),getName(),getInstrument());
	}
	
	public static void containsMember(BrassBandClub b,BrassBandClub[] bs) {
		boolean neko = true;
		if (b != null) {
			for(BrassBandClub bb : bs) {
				if(b.equals(bb)) {
					System.out.println("データが存在します。");
					neko = false;
					break;
				}
			}
		}
		if (neko) {
			System.out.println("データが存在しません");
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) { return true;}
		if (o instanceof BrassBandClub b) {
			if (this.getGrade() == b.getGrade()       //intの比較
			&&	this.getName().equals                 //strの比較      
				  (b.getName())
			&&	this.getInstrument().equals           //strの比較
				  (b.getInstrument())) {
				return true;
			}
		}
		return false;
	}
	

}
