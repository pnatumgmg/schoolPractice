package print9_sort_1.util;

public class Logger {
	/**
	 * mesgをprintlnする
	 * @param mesg
	 */
	private void print (String mesg) {
		System.out.println(mesg);
	}
	
	/**
	 * 処理未記入
	 * @param arr
	 * @param beg
	 * @param len
	 * @return
	 */
	private String toString(int[] arr, int beg,int len) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = beg; i < len;i++) {
			sb.append(arr[i]);
			if (i != len - 1)	sb.append(",");
		}
		sb.append("]");
		
		return sb.toString();
	}

}

