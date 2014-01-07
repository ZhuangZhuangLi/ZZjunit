package view;

public class SubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[]{1,-3,4,5,-2,3,9,-1};
		System.out.println(subarray(a));
		System.gc();

	}
	public static int subarray(int a[]){
		int temp=0;
		int sum=0;
		for(int i:a){
			if(temp>=0){
				temp=temp+i;//如果上次的和大于0，那么继续加这次的
			}else{
				temp=i;//如果上次都小于0了，那么这次直接置为当前值
			}
			if(sum<=temp){
				sum=temp;//将最大的temp保留下来。
			}
		}
		
		return sum;
	}

}
