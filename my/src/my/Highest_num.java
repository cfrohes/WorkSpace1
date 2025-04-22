package my;

public class Highest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,89,56,99,345,444,555,665,9};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println(max);

	}

}
