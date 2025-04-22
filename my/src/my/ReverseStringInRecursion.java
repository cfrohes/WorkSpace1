package my;

public class ReverseStringInRecursion {

	public static void main(String[] args) {
		String s = "abcde";
		int i = s.length()-1;
		reverseString(s,i);
		

	}
	public static void reverseString(String str,int index) {
		if (index == 0) {
			System.out.println(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		reverseString(str,index-1);
	}

}
