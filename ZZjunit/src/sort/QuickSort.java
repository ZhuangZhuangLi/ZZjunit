package sort;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void Sort(int[] arr,int low ,int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int middle=Parttion(arr, low ,high);
			Sort(arr, low ,middle-1);
			Sort(arr, middle+1 ,high);
		}
		
	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return 
	 */
	public int Parttion(int[] arr,int low ,int high) {
		// TODO Auto-generated method stub
		int key=arr[low];
		while(low<high){
			while(key<=arr[high]&&low<high){
				high--;
			}
				arr[low]=arr[high];
	
			while(key>=arr[low]&&low<high){
				low++;
			}
				arr[high]=arr[low];
		}
		arr[low] = key;
	    return low;

	}
	public void Print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("��ӡ������");
		for(int a:arr){
			System.out.print(a);
			System.out.print(",");
		}
	}


}
