package print9_sort_1.algorithm.insert;


import print9_sort_1.algorithm.Sorter;
import print9_sort_1.util.Logger;


/**
 * 挿入ソートを実装する
 */
public class InsertSort implements Sorter{

	private Logger logger;

	/**
	 * 挿入ソート(Insert Sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] arr) {
		logger = new Logger();
		
		insertSort(arr);
        return arr;
	}

    private void insertSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int k;
			
			for (k = i -1; k >= 0 && arr[k] > curr; k--) {
				arr[k +1] = arr[k];
			}
			arr[k+1] = curr;

            logger.print(logger.toString(arr, 0, arr.length));
		}
    }
}
