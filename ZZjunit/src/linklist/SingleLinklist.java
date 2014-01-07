package linklist;

import java.util.ArrayList;
import java.util.List;

public class SingleLinklist {
	private Node head=new Node();
	public SingleLinklist() {
		this.head=new Node();
	}
 	public void reserverList(){
		Node pre=null;
		Node cur=null;
		Node next=null;
		pre=this.head;
		cur=this.head.next;
		while(cur!=null){
			next=cur.next;
			cur.next=pre;
			pre=cur;
			cur=next;
		}
		// 将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head  
	    head.next=null;  
	    head = pre;   

	}
	public SingleLinklist(List list) {
		Node t=new Node();
		Node tmp=null;
		Node cur=null;
		for(Object o:list){
			tmp=new Node(o);
			if(this.head.data==null){
				this.head=tmp;//第一个节点为head
			}else{
				cur.next=tmp;//以后的节点不断的往后设  
			}
			cur=tmp;
		}
	}
	@Override
	public String toString() {
		StringBuffer s=new StringBuffer();
		Node n=head;
		while(n!=null){
			s.append(n.data);
			s.append(",");
			n=n.next;
		}
		s.deleteCharAt(s.length()-1);
		return s.toString();
	}
	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		SingleLinklist b=new SingleLinklist(a);
		System.out.println(b);
		b.head.next=null;
		
		b.reserverList();
		System.out.println(b);
	}
	

}
