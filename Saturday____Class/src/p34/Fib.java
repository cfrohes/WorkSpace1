package p34;

public class Fib {
	public static void main(String[] args) {
		int first = 0, sec = 1;
		int num = 10;
		for(int i = 1; i <= num; i++) {
			System.out.println(first + " ");
			int next = first + sec;
			first = sec;
			sec = next;
		}
		
	}
}
