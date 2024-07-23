package printJ_FileReader.questions02;

import java.util.Comparator;

public class TempComparator implements Comparator<TempData>{
	private int select;
	
	public TempComparator(int select) {
		// TODO 自動生成されたコンストラクター・スタブ
		setSelect(select);
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}
	
	public int compare(TempData o1,TempData o2) {
		if(0 == select) {
			return o1.getDate().compareTo(o2.getDate());
		}else if(1 == select) {
			return check(o1.getAveTemp(),o2.getAveTemp());
		}else if(2 == select) {
			return check(o1.getMaxTemp(),o2.getMaxTemp());
		}else {
			return check(o1.getMinTemp(),o2.getMinTemp());
		}
	}
	
	public int check(double o1,double o2) {
		if(o1 > o2) {
			return 1;
		}else if(o1 < o2) {
			return -1;
		}else {
			return 0;
		}
	}

}
