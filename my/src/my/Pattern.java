package my;

public class Pattern {

	public static void main(String[] args) {
		int n = 1;
		char lowerCaseLetter= 'b';
		char upperCaseLetter= 'D';
		for(int i = 1; i <= 5;i++ ) {
			for(int j = 1;j <= i;j++) {
				if(n % 2!=0) {
					System.out.print(n+" ");
					
				}
				else {
					if(n % 4 == 0) {
						System.out.print(upperCaseLetter+" ");
						upperCaseLetter+=4;
						
					}else {
						System.out.print(lowerCaseLetter+" ");
						lowerCaseLetter+=4;
					}
				}n++;
			}System.out.println();
		}
	}
}
				