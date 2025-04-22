package Hey;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		String str = "abbccda";
		boolean br[] = new boolean[str.length()];
		
		System.out.println(removeDuplicates(0, str, br));
//		for (int i = 0; i < str.length(); i++) {
//			char cur = str.charAt(i);
//			if (br[cur - 'a'] == true) {
//				continue;
//			}else {
//				br[cur - 'a'] = true;
//				System.out.print(cur);
//			}
//			
//				
//			}
		}
	//Recursion
	public static String removeDuplicates(int i, String str,boolean br[]) {
		if (i == str.length()) {
			return "";
		}
		char cur = str.charAt(i);
		if(br[cur - 'a']== true) {
			return removeDuplicates(i+1, str, br);
		}else {
			br[cur- 'a'] = true;
			return cur + removeDuplicates(i+1, str, br);
		}
	}
}
