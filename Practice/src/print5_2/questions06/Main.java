package print5_2.questions06;

public class Main {
	public static void main(String[] args) {
		int [] array = {5,3,10,8,2,4,1,4,7,9,0,4,3,1};
		int count = 0;
		int lastsansan = 0;
		for (int i = 0; i < array.length ; i++) {
			if (array[i] == 2)
				System.out.printf("2 の値は%1d 番目に出現します。\n",i);
			if (array[i] == 4)
				count += 1;
			if (array[i] == 3)
				lastsansan = i;
		}
		System.out.printf("4 の値は%1d 個出現した\n",count);
		System.out.printf("最後に現れる3 の値は前から%1d 番目です",lastsansan);
	}

}
