package kodNest_qp;

public class Inharitance07 {

	public static void main(String[] args) {
			Player01 c = new Cricket01();
//			c.exercice();
//			c.play();
//			((Cricket01)c).winICCcup();
			
			Player01 f = new Football01();
//			f.exercice();
//			f.play();
//			((Football01)f).winFifacup();
			
			Player01 t = new Tennis01();
//			t.exercice();
//			t.play();
//			((Tennis01)t).winWincup();
			Inharitance07 s = new Inharitance07();
			s.accessPlyer01(c);
			s.accessPlyer01(f);
			s.accessPlyer01(t);
			
		}
	public void accessPlyer01(Player01 p) {
		p.exercice();//access Inherited method
		p.play();// access overridden method
		// access chikld specific method
		if(p instanceof Cricket01) {
			((Cricket01)p).winICCcup();
		}
		
		if(p instanceof Football01) {
			((Football01)p).winFifacup();
		}
		
		if(p instanceof Tennis01) {
			((Tennis01)p).winWimbledon();
		}
		
	}

	}
class Player01 {
	public void exercice() {
		System.out.println("Exercise everyday.");		
	}
	public void play() {
		System.out.println("Play games.");		
	}
	
	}

class Cricket01 extends Player01 {
	public void exercice() {
		System.out.println("Cricket Exercise everyday.");		
	}
	public void play() {
		System.out.println("Play games like Cricket.");		
	}
	public void winICCcup() {
		System.out.println("Win ICC CUP games.");	
		}	
	}

class Football01 extends Player01 {
	public void exercice() {
		System.out.println("Footballer Exercise everyday.");		
	}
	public void play() {
		System.out.println("Play games like Football.");		
	}
	public void winFifacup() {
		System.out.println("Win FIFA CUP games.");		
		}
		
	}

class Tennis01 extends Player01 {
	public void exercice() {
		System.out.println("Tennis Exercise everyday.");		
	}
	public void play() {
		System.out.println("Play games like Tennis.");		
	}
	public void winWimbledon() {
		System.out.println("Win winWimbledon CUP games.");
			
		}
		
	}

