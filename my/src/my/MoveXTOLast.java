package my;

public class MoveXTOLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "axbcxxd";
		String s = "";
		int c = 0;
		for (int i = 0;i <= word.length()-1;i++) {
			if (word.charAt(i) != 'x') {
				s += word.charAt(i); 
			}else {
				c++;
			}
		}
		while (c > 0) {
			s += 'x';
			c--;
		}
		System.out.println(s);
		
	}

}
