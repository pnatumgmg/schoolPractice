package printA2_Person_1;

import java.util.Scanner;

public class PersonTester {
	public static void main(String[] args) {
		//5-2
		Scanner sc = new Scanner(System.in);
		System.out.println("本日の日付をスペースで分割して入力してください");
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		Day day = new Day(y,m,d);
		//5-3
		Student yuuzi = new Student(day,"悠仁 (ゆうじ)",2008,3,20);
		Student megumi = new Student(day,"恵 (めぐみ)",2007,12,22);
		Student nobara = new Student(day,"野薔薇 (のばら)",2007,8,7);
		Student yuuta = new Student(day,"優太 (ゆうた)",2006,3,7);
		
		Student[] students = {yuuzi,megumi,nobara,yuuta};
		//5-4
		for (int i = 0; i < students.length; i++) {
			students[i].printTestResult();
			students[i].introduce();
			System.out.println();
		}
		//5-5
		Teacher satoru = new Teacher(day,"悟 (さとる)",1994,12,7,students);
		//5-6
		satoru.introduce();
		System.out.println();
		//5-7
		System.out.println("%sが得意教科の生徒は%d人です。"
				.formatted(satoru.getTeachingSubject(),satoru.getFavoriteSubjectCount()));
		//5-8
		System.out.println("担当生徒のテストの平均点:%.2f"
				.formatted(satoru.getAverageScore()));
		System.out.println();
		//5-9
		satoru.printStudentNames();
		//5-10
		satoru.printStudentsByAverageScore();
		//5-11
		satoru.printStudentNames();
	}
}
