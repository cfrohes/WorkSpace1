package kodNest_qp;

public class String02 {
	public static void main(String[] args) {
		String s1 = "kodnest";
		String s2 = new String("Kodnest");
		String s3 = new String("KODNEST");
		
		if(s1 == s2) {
			System.out.println("Reference are equal...");
		} else {
			System.out.println("Reference are un equal...");
		}

		if(s1.equals(s2)) {
			System.out.println("Strings are equal...");
		} else {
			System.out.println("Strings are un equal...");
		}

		if(s2 == s3) {
			System.out.println(" s2 and s3 Reference are equal...");
		} else {
			System.out.println("s2 and s3 Reference are un equal...");
		}
		
		if(s2.equalsIgnoreCase(s2)) {
			System.out.println("s2 and s3 Strings are equal if Strings are ig nored...");
		} else {
			System.out.println("s2 and s3 Strings are unequal if Strings are ignored...");
		}

		
		
		 
	}
}
