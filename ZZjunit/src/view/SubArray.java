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
				temp=temp+i;//����ϴεĺʹ���0����ô��������ε�
			}else{
				temp=i;//����ϴζ�С��0�ˣ���ô���ֱ����Ϊ��ǰֵ
			}
			if(sum<=temp){
				sum=temp;//������temp����������
			}
		}
		
		return sum;
	}

}
