package print5_1.questions06;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int lastsan = 0;
		int[] array = {5,3,10,8,2,4,1,4,7,9,0,4,3,1};
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				System.out.println("2 の値は" + i +" 番目に出現します。");
			}
			if (array[i] == 4) {
				sum +=1;
			}
			if (array[i] == 3) {
				lastsan = i;
			}
		}
		System.out.println("4 の値は" + sum +" 個出現した");
		System.out.println("最後に現れる3 の値は前から" + lastsan + " 番目です");
	}

}
