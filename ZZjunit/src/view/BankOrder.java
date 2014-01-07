package view;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankOrder {
	Map queen=new ConcurrentHashMap(); 
	int max=9;
	public int call(Map queue) {
		// TODO Auto-generated method stub
		int level=0;
		LinkedList list=(LinkedList)queue.get(level);
		while(level<=max){
			if(list!=null&&list.size()>0){
				Integer result=(Integer)list.getFirst();
				list.removeFirst();
				return result;
			}
			else{
				level++;
				list=(LinkedList)queue.get(level);
			}
		}
		return -1;
	}
	public int add(Map queue,int level,int customerId){
		LinkedList list=(LinkedList)queue.get(level);
		list.addLast(customerId);
		return customerId;
	}
	public void service() throws Exception{
		Thread.sleep(1000);
	}
	public static void main(String[] args) {
		BankOrder a=new BankOrder();
		
		
	}
	
	
	
	

}
