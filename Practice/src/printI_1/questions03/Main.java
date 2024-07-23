package printI_1.questions03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Person> ap = new ArrayList<Person>();
		
		Person c = new Person("Charlie",20,170,70);
		Person b = new Person("Bob",15,165,55);
		Person j = new Person("John",18,175,70);
		Person a = new Person("Alice",23,155,45);
		
		ap.add(c);
		ap.add(b);
		ap.add(j);
		ap.add(a);
		
		System.out.println("「０：名前 １：年齢 ２：身長 ３：体重」で昇順ソートします");
		int sortNumber = sc.nextInt();
		
		Collections.sort(ap,new PersonComparator(sortNumber));
		
		show(ap);
		
		sc.close();
	}
	
	public static void show(ArrayList<Person> aa) {
		for(int i = 0;i < aa.size();i++) {
			System.out.println("%s 年齢：%d 身長:%d 体重:%d"
					.formatted(aa.get(i).getName(),aa.get(i).getAge(),aa.get(i).getHeight(),aa.get(i).getWeight()));
		}
	}
}