package kodNest_qp;

public class String01 {
	public static void main(String[] args) {
		//Object stores in heap inside the string pool
		String str = "Lee";
		String str1 = "Lee";
		
		if(str == str1) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equals.");
		}
		
		
		//Object stores in heap outside the string pool
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str3.equals(str4)) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equals.");
		}
	}

}
