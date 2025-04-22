package p34;

public class ArmStrong {
	public static void main(String[] args) {
		int n = 154;
		int count =0;
		
		for(int i = 1; ; i++) {
			if(isArm(i)) {
				System.out.println(p);
				count++;
				
			}
			if(count == n) {
				break;
			}
			
		}
	}
	public static boolean isArm(int num) {
		int n = num;
		String len = "" + num;
        int length = len.length();
        //int length = 0
        // while (number > 0) {
        //     int r = number % 10;
        //     length++;
        //     number /= 10;
        // }
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum +=  (int)Math.pow(rem, length);
             num /= 10;
        }
        return n == sum;
	}
}
