package my;

import java.util.Scanner;

public class SpiralOrder2DMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			  arr[i][j]=sc.nextInt();
			 
			}
		}
		System.out.println("The Spiral Order Matrix is : ");

		//To print the spiral order matrix
		int colStart=0;
		int colEnd=m-1;
		int rowStart=0;
		int rowEnd=n-1;
		while(rowStart<=rowEnd && colStart<=colEnd ) {
			for(int col=colStart;col<=colEnd;col++) {
				System.out.print(arr[rowStart][col]+" ");
			}rowStart++;
			for(int row=rowStart;row<=rowEnd;row++) {
				System.out.print(arr[row][colEnd]+" ");
			}colEnd--;
			for(int col=colEnd;col>=colStart;col--) {
				System.out.print(arr[rowEnd][col]+" ");
			}rowEnd--;
			for(int row=rowEnd;row>=rowStart;row--) {
				System.out.print(arr[row][colStart]+" ");
			}colStart++;
			System.out.println();
		}
	}

}
