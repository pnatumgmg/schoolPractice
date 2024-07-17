package printG_1.questions09;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
	public String name;
	public int age;
	public int height;
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//(1)
		ArrayList<Person> persons = new ArrayList<Person>();
		//(2)
		System.out.print("作成したい人数を指定してください：");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		//(3)
		createPerson(persons,n);
		
		//(4)
		showPerson(persons);
	}
	
	static void createPerson(ArrayList<Person> persons,int n) {
		String name;
		int age;
		int height;
		//1
		for(int i = 0;i < n;i++) {
			//2
			Person p = new Person();
			//3
			System.out.print("名前を入力してください：");
			name = sc.nextLine();
			//4
			System.out.print("年齢を入力してください：");
			age = sc.nextInt();
			//5
			System.out.print("身長を入力してください：");
			height = sc.nextInt();
			sc.nextLine();
			//6
			p.name = name;
			p.age = age;
			p.height = height;
			//7
			persons.add(p);	
		}
	}
	
	static void showPerson(ArrayList<Person> persons) {
		for(Person p:persons) {
			System.out.println("名前：" + p.name);
			System.out.println("年齢：" + p.age);
			System.out.println("身長：" + p.height);
		}
	}
}