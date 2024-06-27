package print9_Animal;

//1
public class AnimalTester {
	public static void main(String[] args) {
		//2
		Animal cat = new Animal("猫","タマ","にゃーにゃー",5);
		Animal dog = new Animal("犬","ポチ","ワンワン",3);

		//3
		cat.show();
		dog.show();
		
		//4
		Animal dog2 = new Animal();
		
		//5
		dog2.setName("限界突破鶴太郎");
		dog2.setKind("鶴");
		dog2.setCry("クエークエー");
		dog2.setAge(1001);
		
		//6
		dog2.show();
	}
}
