package my;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int limitNum = sc.nextInt();
		for(int i=0; i<=limitNum;i++) {
			if( isArmStrongNum(i)) {
			System.out.print(i+",");
		
			}
		
		
		
		}System.out.println();
		}
	public static boolean isArmStrongNum(int num) {
	int temp = num;
	int n = String.valueOf(num).length();
	int sum =0;
	
	while (num > 0) {
	int r = num % 10;
	num = num / 10;
	sum = sum +(int)Math.pow(r, n);
	}
	return sum == temp;
	}

}
