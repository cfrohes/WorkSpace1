package my;

public class Recursion6FindOccuranceOfACharacter {
	public static int first = -1;
	public static int last = -1;

	public static void main(String[] args) {
		
		String s = "aghjjkgfaaadfggaaafgssadaga";
		for(int i = 0;i < s.length();i++) {
			if(s.charAt(i) == 'a') {
				if(first == -1) {
					first = i;
				}else {
					last = i;
				}
			}
		}
		
//		System.out.println(s.length());
//		findIndex( s,'a',0);
		System.out.println(first);
//			
		System.out.println(last);
//	}  
//	public static void findIndex(String str,char ele,int index) {
//		if(index == str.length()) {
//			return;
//		}
//		if(str.charAt(index) == ele) {
//			if (first == -1) {
//				first = index;
//				
//				
//			}else {
//				last = index;
//				
//			}
//		}findIndex(str,ele,index+1);
	}

}
