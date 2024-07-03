package printD1_queue_1.Driver;

import printD1_queue_1.queue.LinkedCharQueue;
import printD1_queue_1.queue.Queue;

public class Driver {
	public static void main(String[] args) {
		LinkedCharQueue link = new LinkedCharQueue("いろはに４ほへとちりぬるを");
		Queue que = link;
		
		System.out.println(que);
		
		que.delete(4);
		System.out.println(que);
		System.out.println(que.getValueAt(30));
	}

}
