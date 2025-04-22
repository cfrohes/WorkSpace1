package my;

import java.util.Scanner;

public class A_Homework2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}//output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
				
			}System.out.println();
		}
//		public class SpiralOrderMatrix {   ===============================================================================
//
//		    public static void main(String[] args) {
//		        int[][] matrix = {
//		            {1, 2, 3, 4},
//		            {5, 6, 7, 8},
//		            {9, 10, 11, 12},
//		            {13, 14, 15, 16}
//		        };
//
//		        printSpiralOrder(matrix);
//		    }
//
//		    public static void printSpiralOrder(int[][] matrix) {
//		        if (matrix.length == 0) return;
//
//		        int rowStart = 0;
//		        int rowEnd = matrix.length - 1;
//		        int colStart = 0;
//		        int colEnd = matrix[0].length - 1;
//
//		        while (rowStart <= rowEnd && colStart <= colEnd) {
//		            // Traverse Right
//		            for (int col = colStart; col <= colEnd; col++) {
//		                System.out.print(matrix[rowStart][col] + " ");
//		            }
//		            rowStart++;
//
//		            // Traverse Down
//		            for (int row = rowStart; row <= rowEnd; row++) {
//		                System.out.print(matrix[row][colEnd] + " ");
//		            }
//		            colEnd--;
//
//		            // Traverse Left
//		            if (rowStart <= rowEnd) {
//		                for (int col = colEnd; col >= colStart; col--) {
//		                    System.out.print(matrix[rowEnd][col] + " ");
//		                }
//		                rowEnd--;
//		            }
//
//		            // Traverse Up
//		            if (colStart <= colEnd) {
//		                for (int row = rowEnd; row >= rowStart; row--) {
//		                    System.out.print(matrix[row][colStart] + " ");
//		                }
//		                colStart++;
//		            }
//
//		            System.out.println();
//		        }
//		    }
//		}======================================================================

	}

}
