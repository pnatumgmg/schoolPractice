package printA2_Person_1;

import java.util.Random;

public class Student extends Person{
	final private String[] SUBJECTS = {"国語","算数","理科","社会","英語"};
	int [] scores;
	Random rand = new Random();
	
	Student(Day today,String name,int birthYear,int birthMonth,int birthDay){
		super(today,name,birthYear,birthMonth,birthDay);
		this.takeTest();
	}
	
	String[] getSubject() {
		return this.SUBJECTS;
	}
	
	int[] getScores() {
		return this.scores;
	}
	
	void takeTest() {
		this.scores = new int[SUBJECTS.length];
		for (int i = 0; i < SUBJECTS.length; i++) {
			int r = rand.nextInt(71) + 30;
			this.scores[i] = r;
		}
	}
	//7-1
	Double getAverageScore() {
		int sum = 0;
		for (int k = 0; k < SUBJECTS.length;k++) {
			sum += this.scores[k];
		}
		return (double)sum / (double)SUBJECTS.length;
		
	}
	//7-2s
	void printTestResult() {
		System.out.println("【%sのテスト結果】"
				.formatted(super.getName()));
		for (int i = 0; i < SUBJECTS.length;i++) {
			System.out.println("%s : %3d"
					.formatted(this.SUBJECTS[i],this.scores[i]));
		}
		System.out.println("平均点:%3f"
				.formatted(this.getAverageScore()));
	}
	//7-3
	int getBestScoreIndex() {
		int index = 0;
		for (int i = 1; i < SUBJECTS.length; i++) {
			if (this.getScores() [index] < this.getScores()[i]) {
				index = i;
			}
		}
		return index;
	}
	//7-4
	String getFavoriteSubject() {
		return SUBJECTS[getBestScoreIndex()];
	}
	//7-5
	@Override
	void introduce() {
		super.introduce();
		System.out.println("得意科目は%sです"
				.formatted(getFavoriteSubject()));
	}
	
	void superIntroduce() {
		super.introduce();
	}
}
