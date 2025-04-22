package my;

public class MoveAllX_toLAst {
	public static void main(String[] args) {
		String str = "axbcxxd";
		moveX(str,0,0,"");
	   //int count = 0;
//		for(int i = 0; i < str.length();i++) {
//		if (str.charAt(i) == 'x') {
//			count++;
//		} else {
//			System.out.print(str.charAt(i));
//		}
//	}
//		for (int i = 0; i < count; i++) {
//			System.out.print("x");
//	}
	}
	//recursion -----------------------------------------------------------------------
	public static void moveX(String s,int count,int i,String newString) {
		
		if(i == s.length()) {
			for( int idx = 0;idx < count; idx++) {
				newString += "x";
			}
			System.out.println(newString);
			return;
		}
		char curChar = s.charAt(i);
		if (curChar == 'x') {
			count++;
			
		}
		else {
			newString += curChar;
			
		}
		
		moveX(s,count,i+1,newString);
		
	}

}
