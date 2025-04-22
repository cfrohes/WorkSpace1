package leet;

public class SumOfDigitsOfStringsAfterConvering {
	public static void main(String[] args) {
		String s = "iiii";
		int k = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a' + 1;//i-'a' = 106-97 = >9
			sb.append(val);//sb="9999"
		}
		
		
		int sum = 0;
		for (int i = 0; i < sb.length(); i++) {
			sum += sb.charAt(i) - '0';//0+'9'-'0'=> 57 - 48 = 9
		}
		
		for(int i = 0; i < k-1; i++) {
			int newSum = 0;
			while(sum > 0) {
				newSum += sum % 10;
				sum /= 10;
			}
			sum = newSum;
		}
		System.out.println(sum);
		
	}
	
}
