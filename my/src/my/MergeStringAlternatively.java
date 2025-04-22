package my;

public class MergeStringAlternatively {

	public static void main(String[] args) {
		String word1 = "Hello";
		String word2 = "World";
		StringBuilder merged = new StringBuilder();
		int l1 = word1.length();
		int l2 = word2.length();
		int i = 0;
		int j = 0;
		while (i < l1 ||j <l2) {
			if (i < l1) {
				System.out.print(word1.charAt(i));
				i++;
			}
			if (j < l2) {
				System.out.print(word2.charAt(j));
				j++;
			}
		}
		

	}

}
