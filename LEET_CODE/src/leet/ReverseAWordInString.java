package leet;

public class ReverseAWordInString {
	public static void main(String[] args) {
		String s = "the sky is blue";
		//s = s.trim();
		StringBuilder sb = new StringBuilder();
		String[] words = s.split("\\s+");
		 for (int i = words.length - 1; i >= 0; i--) {
	            sb.append(words[i]);
	            if (i > 0) {
	                sb.append(" ");
	            }
	     }
		 System.out.println(sb.toString());
	}
}
