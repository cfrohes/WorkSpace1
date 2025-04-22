package my;

public class Sorting_methods {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void main(String[] args) {
		
		//Bubble Sorting refer book for the Explanation=====================================
		int[] arr= {0,2,3,4,9,8,4,3,3,0,1,5,0,1};
		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					//swap
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					
//				}
//			}
//		}printArray(arr);
//========================================================================================
		//selection sort refer book for the Explanation===================================== 
		for(int i=0;i<arr.length-1;i++) {
			int smallest= i;
			 for(int j=i+1;j<arr.length;j++) {
				
				if (arr[smallest]>arr[j]) {
					smallest=j;
				}
			   
				}//swap
			 int temp=arr[smallest];
			 arr[smallest]=arr[i];
			 arr[i]=temp;

		}printArray(arr);
	
	}

}
