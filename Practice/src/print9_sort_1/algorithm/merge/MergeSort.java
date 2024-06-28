package print9_sort_1.algorithm.merge;

import print9_sort_1.algorithm.Sorter;
import print9_sort_1.util.Logger;

/**
 * マージソートの実装
 */
public class MergeSort implements Sorter{
	
	private Logger logger;

	/**
	 * マージソート(Merge Sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] arr) {
		logger = new Logger();
		
		return mergeSort(arr, 0, arr.length);
	}
	
	/**
	 * 
	 * @param arr
	 * @param beg
	 * @param end
	 * @return
	 */
	private int[] mergeSort(int[] arr, int beg, int len) {

		
		// 配列長が2未満だと分割できないので処理不要
		if (len < 2) 
			return new int[] {arr[beg]};

		// 分割
		int halfA = len / 2;
		int halfB = len - halfA;
		int begA = beg;
		int begB = begA + halfA;
		
		int[] arrA =  mergeSort(arr, begA, halfA);
		int[] arrB =  mergeSort(arr, begB, halfB);
		
		// マージ
		int[] ret = new int[len];
		int j = 0, k = 0;
		//  i 挿入先
		for (int i = 0; i < len; i++) {
			if (j >= arrA.length) {
				ret[i] = arrB[k++];
			} else if (k >= arrB.length) {
				ret[i] = arrA[j++];
			} else {
				if (arrA[j] < arrB[k]) {
					ret[i] = arrA[j++];
				} else {
					ret[i] = arrB[k++];
				}
			}
		}
		
		logger.print("returning %s".formatted(logger.toString(ret, 0, ret.length)));
		return ret;
	}
}
