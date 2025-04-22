package p34;
//find the given number is present in the array or not
public class Array02 {
	public static void main(String[] args) {
		int arr[] = {4, 17, -5, -97, 434};
		int num = 434;
		System.out.println(findNum(arr, num));
		
	}
	public static  int findNum(int arr[], int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("number is present at index : " );
				return i;
			}

		}
		return -1;
	}

}

