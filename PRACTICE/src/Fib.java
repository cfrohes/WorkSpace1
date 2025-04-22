import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		
		//Armstrong num
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int n = num;
		int count = 0;
		while(n > 0) {
			n = n /10;
			count++;
			
		}
		int res = 0;
		while(num > 0) {
			int d = num % 10;
			res = res +(int) Math.pow(d, count);
			num /= 10;
			
		}
		
		if(temp == res) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
	
}
