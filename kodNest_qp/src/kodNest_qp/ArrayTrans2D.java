package kodNest_qp;

public class ArrayTrans2D {
	public static void main(String[] args) {
	int arr[][] = {
			{1, 2, 3},
			{2, 3, 6},
			{3, 5, 7}
	};
	
	int rows = arr.length;
	int cols = arr[0].length;
	int[][] transpose = new int[cols][rows];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				transpose[j][i] = arr[i][j];
		}	
	}
	//transpose	
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] +"  ");	
		}
			System.out.println();
	}
		//print pde principal
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][i] + " ");
			sum += arr[i][i];
			
		}
		System.out.println(sum+" -> sum");
		
		//print sde secondary daigonal element
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][arr.length-i-1] + " ");
}
}
}
