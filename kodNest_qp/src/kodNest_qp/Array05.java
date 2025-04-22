package kodNest_qp;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Ask user for matrix dimensions and create the 2D array
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        
        // TODO: Populate the matrix with user input
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // TODO: Calculate and print the transpose of the matrix
        System.out.println("Original Matrix:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transpose of the Matrix:");
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];
                System.out.print(transpose[j][i] + " ");
            }
           System.out.println();
        }
           
        }
        
        //sc.close();
    }
