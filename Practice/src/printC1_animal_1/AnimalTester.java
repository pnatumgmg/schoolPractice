package printC1_animal_1;

public class AnimalTester {
	public static void main(String[] args) {
		//6-1
		Dog   inu    = new Dog  ("ぽち","犬",5,"公園");
		Cat   neko   = new Cat  ("ミケ","猫",3,"ちゅーる");
		Sheep hituzi = new Sheep("メリー","羊",10,"良");
		
		//6-2
		inu.Attribution();
		anderLine();
		neko.Attribution();
		anderLine();
		hituzi.Attribution();
		anderLine();
		
		//6-3
		inu.cry();
		anderLine();
		neko.cry();
		anderLine();
		hituzi.cry();
		anderLine();
		
		//6-4
		inu.showCourse();
		anderLine();
		neko.showFeed();
		anderLine();
		hituzi.showFur();
		anderLine();
		
		//6-5
		Animal karu = Animal.compWeight(inu, neko);
		Animal ans = Animal.compWeight(karu, hituzi);
		System.out.println("一番軽いのは%sです"
				.formatted(ans.getName()));
		anderLine();
		
		//7
		Dog inu_1 = new Dog("太郎","犬",4,"河川敷");
		Cat neko_1 = new Cat("マル","猫",6,"ちゅーる");
		Sheep hituzi_1 = new Sheep("ショーン","羊",5,"並");
		Cat neko_2 = new Cat("ミミ","猫",3,"まぐろ缶");
		Dog inu_2 = new Dog("しろ","犬",8,"公園");
		Cat neko_3 = new Cat("すず","猫",4,"かつおぶし");
		Animal[] animals = {inu_1,neko_1,hituzi_1,neko_2,inu_2,neko_3};
		
		//8
		for (Animal a:animals) {
			a.cry();
			anderLine();
		}
		
		//9
		animalCount(animals);
		
		//10
		
		//11
		System.out.println(11);
		typeDecision(animals);
		
	}
	
	public static void anderLine() {
		System.out.println("---------------");
	}
	//9
	public static void animalCount(Animal[] animals) {
		int dogCount = 0;
		int catCount = 0;
		int sheepCount = 0;
		for (Animal a:animals) {
			switch (a) {
			case Dog d:
				dogCount ++;
				break;
			case Cat c:
				catCount ++;
				break;
			case Sheep s:
				sheepCount ++;
				break;
			default:
				System.out.println("あなた誰ですか？？");
				break;
			}
		}
		
		System.out.println("犬:%d 猫:%d 羊:%d"
				.formatted(dogCount,catCount,sheepCount));
		anderLine();

	}
	
	//10
	public static void typeDecision(Animal[] animals) {
		for (Animal a: animals) {
			if (a instanceof Dog d) {
				d.showCourse();
			}else if (a instanceof Cat c) {
				c.showFeed();
			}else if (a instanceof Sheep s) {
				s.showFur();
			}else {
				System.out.println("あなた誰ですか？？");
			}
			anderLine();
		}
	}
}
