package print9_sort_1.algorithm;

public interface Sorter {

	/**
	 * 配列のidxAにある値とidxBにある値を入れ替える
	 * @param arr
	 * @param idxA
	 * @param idxB
	 */
	public static void swap(int[] arr, int idxA, int idxB) {
		int tmp = arr[idxA];
		arr[idxA] = arr[idxB];
		arr[idxB] = tmp;
	}
	
	public int[] sort(int[] arr);

}
