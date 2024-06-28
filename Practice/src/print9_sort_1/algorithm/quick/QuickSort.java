package print9_sort_1.algorithm.quick;

import print9_sort_1.algorithm.Sorter;
import print9_sort_1.util.Logger;


/**
 * クイックソートを実装
 */
public class QuickSort implements Sorter{

	private Logger logger;

	/**
	 * クイックソート(Quick Sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] arr) {
		logger = new Logger();
		
		quickSort(arr, 0, arr.length-1);
        return arr;
	}

	/**
	 * クイックソートの実装
	 * @param arr
	 * @param beg
	 * @param len
	 */
	private void quickSort(int[] arr, int beg, int end) {
		
		if (beg >= end)	return;
		// show(arr, beg, end -beg+1);
		
		int pivot = arr[end];
		int idxPivot = beg -1;
		for (int i = beg; i < end; i++) {
			if (arr[i] < pivot) {
				Sorter.swap(arr, i, ++idxPivot);
				// show(arr, beg, end -beg+1);
			}
        }
		
        Sorter.swap(arr, ++idxPivot, end);
logger.print("beg:%2d, len:%2d, end:%2d".formatted(beg, end -beg+1, end));
        logger.print(arr, beg, end -beg+1);
		
		quickSort(arr, beg, idxPivot-1);
		quickSort(arr, idxPivot+1, end);
	}

}
