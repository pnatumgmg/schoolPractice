package printD1_queue_1.queue;

public class LinkedCharQueue implements Queue{
	private Node root;
	
	public LinkedCharQueue() {}
	
	public LinkedCharQueue(String str){
		append(str);
	}
	
	public Queue append(char ch) {
		if (root == null) {
			root = new CharNode(ch);
		}else {
			Node n = root;
			while(n.hasNext()) {
				n = n.getNext();
			}
			n.setNext(new CharNode(ch));
		}
		return this;
	}
	
	public Queue append(String str) {
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			append(ch);
		}
		return this;
	}
	
	public Queue delete(int idx) {
		Node prev = get(idx - 1);
		if (prev == null) {
			Node pika = get(idx);
			Node next = pika.getNext();
			this.root = next;
			return this;
		}
		Node tgt = prev.getNext();
		Node next = tgt.getNext();
		prev.setNext(next);
		return this;
	}
	
	@Override
	//多分済
	public Object getValueAt(int idx) {
		Node n = get(idx);
		if (n != null) {
			return n.getValue();
		}else {return null;}
	}
	
	public Node get(int idx) {
		//多分済
		if (idx < 0) {return null;}
		Node n = root;
		idx --;
		while(n.hasNext() && idx >= 0) {
			n = n.getNext();
			idx --;
		}
		if (idx >= 0) {return null;}
		else {return n;}
	}
	
	@Override
	//多分済
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(root != null) {
			Node n = root;
			sb.append(n);
			while(n.hasNext()) {
				n = n.getNext();
				sb.append(n);
			}
		}
		return sb.toString();
	}
}

class CharNode implements Node{
	private char value;
	private Node next;
	
	public CharNode(char value){
		this.setValue(value);
	}
	
	@Override
	public void setValue(Object obj){
		this.setValue((char)obj);
	}
	
	
	public void setValue(char value) {
		//済	
		this.value = value;
	}
	
	@Override
	//多分済
	public Object getValue() {
		return (Object)this.value;
	}
	
	@Override
	//済
	public boolean hasNext() {
		if(next == null) {
			return false;
		}else {
			return true;
		}
		
	}
	
	@Override
	//済
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	//済
	public Node getNext() {
		return this.next;
	}
	
	@Override
	//びみょー
	public String toString() {
//		return (String)getValue();
		return String.valueOf(this.getValue());
	}
}