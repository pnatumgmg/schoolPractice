package print9_sort_1;

import java.util.Random;

import print9_sort_1.algorithm.Sorter;
import print9_sort_1.algorithm.bubble.BubbleSort;
import print9_sort_1.util.Logger;

public class SortDriver{

    public static void main(String[] args) {
    	
        int[] array = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        Logger logger = new Logger();
        Sorter sorter = new BubbleSort();
        // BubbleSort sorter = new BubbleSort();
        // SelectSort sorter = new SelectSort();
        // InsertSort sorter = new InsertSort();
        // MergeSort sorter = new MergeSort();
        // QuickSort sorter = new QuickSort();
        // TreeSort sorter = new TreeSort();
        logger.print(toString(array));
        int[] result = sorter.sort(array);
        logger.print(toString(result));

    }

    /**
     * intの配列を文字列化する
     * @param arr
     */
    static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int v : arr) {
            sb.append(", %2d".formatted(v));
        }
        sb.deleteCharAt(0);		// 行頭のカンマを削除
        sb.insert(0, "[");      // 行頭に"["を追加
        sb.append("]");         // 行末に"]"を追加 

        return sb.toString();
    }
}