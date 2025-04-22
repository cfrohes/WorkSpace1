package kodNest_qp;

public class Array01 {
	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 95;
		marks[1] = 80;
		marks[2] = 75;
		marks[3] = 52;
		marks[4] = 70;
		
		
		System.out.println("marks[0] : " + marks[0] );
		System.out.println("marks[1] : " + marks[1] );
		System.out.println("marks[2] : " + marks[2] );
		System.out.println("marks[3] : " + marks[3] );
		System.out.println("marks[4] : " + marks[4] );
		System.out.println();
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println("marks[" + i + "] : " + marks[i] );
		}
	}

}
