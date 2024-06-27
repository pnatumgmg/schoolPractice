package printA2_Person_1;

import java.util.Random;

public class Teacher extends Student{
	private String teachingSubject;
	private Student[] students;
	Random rand = new Random();
	
	Teacher(Day today,String name,int birthYear,int birthMonth,int birthDay,Student[] students){
		super(today,name,birthYear,birthMonth,birthDay);
		this.setStudents(students);
		this.setTeachingSubject();
	}
	
	void setStudents(Student[] students) {
		this.students = students;
	}
	
	void setTeachingSubject() {
		int r = rand.nextInt(super.getSubject().length);
		this.teachingSubject = super.getSubject()[r];
	}
	
	Student[] getStudents() {
		return this.students;
	}
	
	String getTeachingSubject() {
		return this.teachingSubject;
	}
	
	@Override
	void introduce() {
		super.superIntroduce();
		System.out.println("担当科目は%sです。"
				.formatted(this.getTeachingSubject()));
	}
	
	@Override
	Double getAverageScore() {
		double sum = 0;
		for(int i = 0; i < this.getStudents().length;i++) {
			sum += this.students[i].getAverageScore();
		}
		return (double)sum / this.getStudents().length;
	}
	
	int getFavoriteSubjectCount() {
		int count = 0;
		for (int i = 0;i < getStudents().length;i++) {
			if (this.getTeachingSubject().equals(this.getStudents()[i].getFavoriteSubject())) {
				count ++;
			}
		}	
		return count;
	}
	
	void printStudentNames() {
		for (int i = 0;i < this.getStudents().length;i++) {
			System.out.println("[%d番]%s"
					.formatted(i+1,getStudents()[i].getName()));
		}
		System.out.println();
	}
	
	void printStudentsByAverageScore() {
		for (int i = 0;i < this.getStudents().length;i++) {
			for (int k = i+1;k < this.getStudents().length;k++) {
				if(this.getStudents()[i].getAverageScore() < 
				   this.getStudents()[k].getAverageScore()) {
					Student kari = this.getStudents()[i];
//					students[i] = this.getStudents()[k];
					this.getStudents()[i] = this.getStudents()[k];
					students[k] = kari;
				}
			}
		}
	}
}
