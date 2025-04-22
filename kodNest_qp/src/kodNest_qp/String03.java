package kodNest_qp;

public class String03 {
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = s1 + s2;
		String s4 = s1 + s2;
		String s5 = "Rama" + "Sita";
		String s6 = "Rama" + "Sita";
		
		if(s3 == s4) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are Unequal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		if(s5 == s6) {
			System.out.println("s5 and s6 References are equal");
		}else {
			System.out.println("s5 and s6 References are Unequal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s5 and s6 Strings are equal");
		}else {
			System.out.println("s5 and s6 Strings are not equal");
		}
	}
}
