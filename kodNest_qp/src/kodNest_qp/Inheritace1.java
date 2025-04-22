package kodNest_qp;

public class Inheritace1 {

	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.exercice();
		c.play();
		c.win();
		Football f = new Football();
		f.exercice();
		f.play();
		f.win();
		
		
		
	}

}
class Player {
	public void exercice() {
		System.out.println("Exercise everyday.");
		
	}
	public void play() {
		System.out.println("Play games.");
		
	}
	public void win() {
		System.out.println("Win games.");
		
	}
}
class Cricket extends Player {
	
}
class Football extends Player {
	
}
class Tennis extends Player {
	
}
