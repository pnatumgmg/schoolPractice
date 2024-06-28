package print9_sort_1.algorithm.tree;

import print9_sort_1.algorithm.Sorter;

/**
 * ヒープソート(Tree Sort)を実装する
 */
public class TreeSort implements Sorter{
	
	/**
	 * ヒープソート(tree sort)を実行する
	 * @param array
	 * @return
	 */
	@Override
	public int[] sort(int[] array) {

		Node root = new Node(array[0]);
		for (int i = 1; i < array.length; i++) {
			root.add(array[i]);
		}
		return root.dump();
	}

}