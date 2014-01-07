package linklist;

public class Node {
	 Object data;
	 Node next;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(Object o) {
		this.data=o;
		this.next=null;
		// TODO Auto-generated constructor stub
	}
	public Node(Object o,Node next) {
		this.data=o;
		this.next=next;
		// TODO Auto-generated constructor stub
	}
	public Node() {
		this.data=null;
		this.next=null;
		// TODO Auto-generated constructor stub
	}
}
