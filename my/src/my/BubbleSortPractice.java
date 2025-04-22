package my;

public class BubbleSortPractice {

	public static void main(String[] args) {
		int arr[] = {0,2,3,4,9,8,4,3,3,0,1,5,0,1};
		for(int i=0;i<arr.length;i++) {
			int current=arr[i];//unsorted array
			int j = i-1;//sorted array
			while(j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1]=current;
			
		}printArray(arr);
		
		
		}
	public static void printArray(int arr[]) {
		for( int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
	}

}
//bubble sort
//int arr[] = {8,6,7,4,3,2,0};
//
//for(int i = 0;i < arr.length - 1;i++) {
//	for(int j = 0;j < arr.length-i-1;j++) {
//		if(arr[j] > arr[j+1]) {
//		int temp = arr[j];
//		arr[j]=arr[j+1];
//		arr[j+1]=temp;
//		
//	}
//}
//}
//printArray(arr);
//
//}
//public static void printArray(int arr[]) {
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]+" ");
//}System.out.println();



//selection sort
//for(int i = 0;i < arr.length - 1;i++) {
//int smallest=i;
//for(int j = i+1;j < arr.length;j++) {
//	if(arr[smallest]>arr[j]) {
//		smallest=j;
//						}
//}
////swap
//int temp = arr[smallest];
//arr[smallest]=arr[i];
//arr[i]=temp;
//
//}printArray(arr);
//}
//public static void printArray(int arr[]) {
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]+" ");
//}System.out.println();	