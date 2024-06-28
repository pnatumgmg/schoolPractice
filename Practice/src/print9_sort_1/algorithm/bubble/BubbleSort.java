package print9_sort_1.algorithm.bubble;

import print9_sort_1.algorithm.Sorter;
import print9_sort_1.util.Logger;

/**
 * バブルソートを実装
 */
public class BubbleSort implements Sorter{

	private Logger logger;

	/**
	 * バブルソート(Bubble Sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] arr) {
		logger = new Logger();
		
		bubbleSort(arr);
        return arr;
	}

	/**
	 * バブルソート(昇順)
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		
		boolean sort = false;
		for (; !sort;) {
			sort = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i-1]) {
					Sorter.swap(arr, i, i-1);
					sort = false;
				}
                logger.print(logger.toString(arr, 0, arr.length));
			}
		}
	}
}
