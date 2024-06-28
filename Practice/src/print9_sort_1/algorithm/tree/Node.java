package print9_sort_1.algorithm.tree;

import print9_sort_1.util.Logger;

/**
 * ヒープソートの子クラス
 */
public class Node {
	
	private Logger logger;
	
	private int self;
	private Node greater;
	private Node smaller;
	private Node same;
	
	/**
	 * コンストラクタ
	 * @param value
	 */
	public Node(int value) {
		this.self = value;
		this.logger = new Logger();
	}

	/**
	 * Nodeを追加する
	 * @param value
	 */
	public void add(int value) {

		String judge;
		
		if (this.self < value) {
			judge = "greater";
			if (this.greater == null) {
				this.greater = new Node(value);
			} else {
				this.greater.add(value);
			}
		} else if (this.self > value) {
			judge = "smaller";
			if (this.smaller == null) {
				this.smaller = new Node(value);
			} else {
				this.smaller.add(value);
			}
		} else {
			judge = "same";
			if (this.same == null) {
				this.same = new Node(value);
			} else {
				this.same.add(value);
			}
		}
		
		this.logger.print("self: %2d, %s.add(%2d)を呼び出します。".formatted(this.self, judge, value));
	}
	
	/**
	 * 保持している値を出力する
	 * @return
	 */
	public int[] dump() {
		
		// 小さい方の値をゲット
		int[] sm;
		if (this.smaller == null) {
			sm = new int[0];
		} else {
			sm = this.smaller.dump();
		}
		
		// 同値をゲット
		int[] eq;
		if (this.same == null) {
			eq = new int[0];
		} else {
			eq = this.same.dump();
		}
		
		// 大きい方の値をゲット
		int[] gr;
		if (this.greater == null) {
			gr = new int[0];
		} else {
			gr = this.greater.dump();				
		}
		
		// 戻り値の配列長を計算
		int len = sm.length + eq.length + gr.length + 1;
		// 戻り値を作成
		int[] result = new int[len];
		
		// 小さい方の値を戻り値に転記
		int base = 0;
		for (int i = 0; i < sm.length; i++) {
			result[base +i] = sm[i];
		}
		// 同値を戻り値に転記
		base += sm.length;
		for (int i = 0; i < eq.length; i++) {
			result[base +i] = eq[i];
		}
		// 自値を戻り値に転記
		base += eq.length;
		result[base] = this.self;
		// 大きい方の値を戻り値に転記
		base += 1;
		for (int i = 0; i < gr.length; i++) {
			result[base +i] = gr[i];
		}
		
		// 戻り値を出力		
//		self: 5, 戻り値:[ 2, 4, 5, 5, 8, 10, 32, 98]
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(",%3d".formatted(result[i]));
		}

		this.logger.print("self:%2d, 戻り値:[%s]".formatted(this.self, sb.substring(1)));

		return result;
	}

}

