package Hey;

import java.util.HashSet;

public class SubStrinString {
	public static void main(String[] args) {
		String str = "aaaa";
		//to avoide the duplicates
		HashSet<String> set = new HashSet<>();
		stringSubSequence(str,"", 0,set);
		
		}
	// total no. of subsequence is 2^n
	//recursion...........................................................
//	public static void stringSubSequence (String str,String str1,int i) {
//		if (i == str.length()) {
//			System.out.println(str1);
//			return;
//		}
//		
//		char curchar = str.charAt(i);
//		//to be a part of a SubString
//		stringSubSequence(str, str1+curchar, i+1);
//		
//		//NOT to be a part of a SubString
//		stringSubSequence(str, str1, i+1);
//	}
//
//}
	//to avoide the duplicates using hashset
	public static void stringSubSequence (String str,String str1,int i,HashSet<String> set) {
		if (i == str.length()) {
			if(set.contains(str1)) {
			return;
		}else {
			System.out.println(str1);
			set.add(str1);
			return;
		}
		}
		
		char curchar = str.charAt(i);
		//to be a part of a SubString
		stringSubSequence(str, str1+curchar, i+1,set);
		
		//NOT to be a part of a SubString
		stringSubSequence(str, str1, i+1,set);
	}

}
