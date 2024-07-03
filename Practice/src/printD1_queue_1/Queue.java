package printD1_queue_1;

public interface Queue {
	Queue append(String str);
	
	Queue delete(int idx);
	
	Object getValueAt(int idx);

}
