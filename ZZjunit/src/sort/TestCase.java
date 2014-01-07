package sort;

import org.junit.Test;


public class TestCase {
	@Test
	public void QuickSort() {
		// TODO Auto-generated method stub
		QuickSort qs=new QuickSort();
		int  [] arr=new int[]{3,8,1,2,5};
		qs.Print(arr);
		qs.Sort(arr,0,arr.length-1);
		System.out.println("--------------------------------");
		qs.Print(arr);
	}
	
	@Test
	public void TestFinnaly() {
		try {
			System.out.println("Test");
			return ;
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			System.out.println("finally");
		}
	}
	
	@Test
	public void TestFind() {
		for(int i=10;i<=100000;i++){
			int[] a=splitNum(i);
//			System.out.println("i:"+i);
//			System.out.println("first:"+first);
//			System.out.println("last:"+last);
//			System.out.println("middle:"+middle);
//			System.out.println("互换后的数为："+(last*temp+middle*10+first));
//			System.out.println("---------------------------");
			int swapi=(a[2]*a[3]+a[1]*10+a[0]);
			int sum=i+swapi;
			int[] result=splitNum(sum);
			if(result[1]==result[0]+result[2]){
				System.out.println(i);
				System.out.println(swapi);
				System.out.println(sum);
				System.out.println("-------------------------");
			}
			
		}
	}
	public int[] splitNum(int src){
		int[] a=new int[4];
		a[2]=src%10;
		a[0]=1;
		int count=1;
		int temp=1;
		int j=src;
		while(j>=10){
			j=j/10;
			a[0]=j;
			count++;
			temp=temp*10;
		}
		a[1]=(src%temp)/10;
		a[3]=temp;
		return a;
	}
	
}
