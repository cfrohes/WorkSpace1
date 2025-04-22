package Hey;

public class printKeypadCombination {
	public static String keyboard[] = { ".","abc","def","ghi","jkl","mno",
			"pqrs","tu", "vwx", "yz"};

	public static void main(String[] args) {
		String number = "03";
		keyBoardPattern(number, 0, "");
		
	}
	public static void keyBoardPattern(String str,int idx,String res) {
		if(idx == str.length()) {
			System.out.println(res);
			return;
			}
			char curchar = str.charAt(idx);
			String mapping = keyboard[curchar-'0'];
			for (int i = 0; i < mapping.length(); i++) {
				keyBoardPattern(str, idx+1, res+mapping.charAt(i));
			}
//			for(int i=0; i<keyboard[str.charAt(idx)-'0'].length(); i++) {
//			char curr = keyboard[str.charAt(idx)-'0'].charAt(i);
//			keyBoardPattern(str, idx+1, res+curr);
//			}
		}
			
	}


