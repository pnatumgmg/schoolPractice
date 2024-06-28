package print9_sort_1.util;

public class Logger {

    /**
     * ログ出力
     * @param msg
     */
    public void print(String msg) {
        System.out.println(msg);
    }

    /**
     * 配列を出力する
     * @param arr
     * @param beg
     * @param len
     */
    public void print(int[] arr, int beg, int len) {
        this.print(this.toString(arr, beg, len));
    }

    /**
     * int[]を文字列で表現する
     * @param arr
     * @param beg
     * @param len
     * @return
     */
    public String toString(int[] arr, int beg, int len) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = beg; i < beg+len; i++) {
    		sb.append(", %2d".formatted(arr[i]));
    	}
    	return "[%s]".formatted(sb.substring(1));    	
    }
}

