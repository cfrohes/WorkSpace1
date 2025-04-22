package kodNest_qp;

public class Abtraction01 {
	public static void main(String[] args) {
		JavaMentor j = new JavaMentor();
		SqlMentor s = new SqlMentor();
		HtmlMentor h = new HtmlMentor();
		//Mentor m = new Mentor();// error cAnnot create the object of abstract class!
		accessMentors(j);
		accessMentors(s);
		accessMentors(h);
		
	}
	public static void accessMentors(Mentor m) {
		m.trainInterns();
		m.takeAttendance();
	}

}
abstract class Mentor {
    public abstract void trainInterns();
    public abstract void takeAttendance();
}

class JavaMentor extends Mentor {
    // Java-specific stuff
	public void trainInterns() {
    	System.out.println("Java trainInterns");
    }
    public void takeAttendance() {
    	System.out.println("Java Class takeAttendance");
    }
}

class SqlMentor extends Mentor {
    // SQL-specific stuff
	public void trainInterns() {
    	System.out.println("  SQL trainInterns");
    }
    public void takeAttendance() {
    	System.out.println("  SQL Class takeAttendance");
    }
}

class HtmlMentor extends Mentor {
    // HTML-specific stuff
	public void trainInterns() {
    	System.out.println("    HTML trainInterns");
    }
    public void takeAttendance() {
    	System.out.println("    HTML Class takeAttendance");
    }
}
