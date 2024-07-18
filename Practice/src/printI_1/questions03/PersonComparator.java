package printI_1.questions03;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	private int check;
	public PersonComparator(int check) {
		this.check = check;
	}
	@Override
	public int compare(Person o1, Person o2) {
		if(check == 0) {
			return o1.getName().compareTo(o2.getName());
		}else if(check == 1) {
			return Integer.compare(o1.getAge(), o2.getAge());
		}else if(check == 2) {
			return Integer.compare(o1.getHeight(), o2.getHeight());
		}else {
			return Integer.compare(o1.getWeight(), o2.getWeight());
		}
		
		
	}

}
