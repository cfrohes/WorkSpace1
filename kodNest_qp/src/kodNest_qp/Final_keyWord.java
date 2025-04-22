package kodNest_qp;

public class Final_keyWord {
	public static void main(String[] args) {
		FinalKey f = new FinalKey();
		f.hello();
		
	}

}
final class FinalKey {
	final int x = 99;
	final void hello() {
		//x=89; shoes error while changing the final variable
		System.out.println(x);
	}
}//A final class cannot be subclassed. This means no other
//class can extend a final class.
//class Fui extends FinalKey {
	//void hello () {
		//shows ana error
	//}
//}
