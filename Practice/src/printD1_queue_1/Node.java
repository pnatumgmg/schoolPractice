package printD1_queue_1;

public interface Node {
	
	void setValue(Object obj);
	
	Object getValue();
	
	boolean hasNext();
	
	void setNext(Node next);
	
	Node getNext();

}
