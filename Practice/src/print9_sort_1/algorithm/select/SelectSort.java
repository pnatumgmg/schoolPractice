package print9_sort_1.algorithm.select;

import print9_sort_1.algorithm.Sorter;
import print9_sort_1.util.Logger;


/**
 * 選択ソートを実装
 */
public class SelectSort implements Sorter{

	private Logger logger;

	/**
	 * 挿入ソート(Insert Sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] arr) {
		logger = new Logger();
		
		selectSort(arr);
        return arr;
	}

    /**
     * 選択ソートの実装
     * @param arr
     */
    private void selectSort(int[] arr) {

		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					Sorter.swap(arr, i, j);
				}
			}
            logger.print(logger.toString(arr, 0, arr.length));
		}
    }

}
