package print9_sort_1.algorithm.tree;

public class TreeSort {
	/*
	class Node{
		private int self;
		private Node greater;
		private Node smaller;
		private Node same;
		
		Node(int x){
			this.self = x;
		}
		
		public void add(int x) {
			if (self < x) {
				if (greater == null) {
					this.greater = new Node(x);
					System.out.print("self: %d, greater.add(%d)を呼び出します。".formatted(x,this.greater));
				}
				this.greater.add(x);
			}
			else if (self > x) {
				if (smaller == null) {
					this.smaller = new Node(x);
					System.out.print("self: %d, smaller.add(%d)を呼び出します。".formatted(x,this.smaller));
				}
				smaller.add(x);
				
			}
			else if (self == x) {
				if (same == null) {
					this.same = new Node(x);
					System.out.print("self: %d, same.add(%d)を呼び出します。".formatted(x,this.same));
				}
				same.add(x);
			}
		}
		
		public int[] dump() {
			int[] smallerDump;
			int[] sameDump;
			int[] greaterDump;
			if (this.smaller == null) {
				smallerDump = new int[0];
			}else {
				smallerDump = dump();
			}
			if (this.same == null) {
				sameDump = new int[0];
			}else {
				sameDump = dump();
			}
			if (this.greater == null) {
				greaterDump = new int[0];
			}else {
				greaterDump = dump();
			}
			int[] result = new int[smallerDump.length + sameDump.length + greaterDump.length + 1];
			
		}
	}
	
	private int[] sort(int[] array) {
		
	}
	
	*/
}