package my;

public class FindArrayAscending {
	public static boolean isSorted(int index,int[] arr) {
		if(index == arr.length - 1) {
			return true;
		}if(arr[index] >= arr[index+1]) {
			return false;
		}else {
			return isSorted(index+1,arr);
		}
	}
	public static void main (String[] args) {
		int[] a = {2,3,4,5,6,7};
		System.out.println(isSorted(0,a));
	}
	

}


























//public static boolean isAscending(int arr[]) {
//	for ( int i = 0; i < arr.length-1;i++) {
//		if(arr [i] >= arr [i+1]) {
//			return false;
//		}
//	}return true;
//	
//}
//public static void main(String[] args) {
//	int[] a = {2,3,4,5,6,6};
//	System.out.println("isAscending : "+isAscending(a));
//}