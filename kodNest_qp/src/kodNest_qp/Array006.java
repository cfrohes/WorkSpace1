package kodNest_qp;

public class Array006 {
	public static void main(String[] args) {
		int[] arr = {1,23, 56, 78, 89, 299, 78};
		System.out.println("The Maximum array element is : " + Array006.findMax(arr));
		System.out.println("The Minimu array emlement is : " + Array006.findMin(arr));

	}


public static int findMax(int a[]) {
	int max  = a[0];
	for(int i = 1; i < a.length; i++) {
		if(a[i] > max) {
			max = a[i];
		}
	}
	return max;
}

public static int findMin(int a[]) {
	int min  = a[0];
	for(int i = 1; i < a.length; i++) {
		if(a[i] < min) {
			min = a[i]; 
		}
	}
	return min;
}
}