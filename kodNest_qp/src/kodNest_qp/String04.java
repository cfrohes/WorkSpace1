package kodNest_qp;

public class String04 {
	public static void main(String[] args) {
		String s1 = new String("RAma");
		String s2 = s1;
		if(s1 == s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("not equal");
		}
		String s3 = "Kodnest";
		String s4 = s3.concat("Technology");
		System.out.println(s4);
	}

}
