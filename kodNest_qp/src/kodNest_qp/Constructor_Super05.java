package kodNest_qp;

public class Constructor_Super05 {
	public static void main(String[] args) {
		Lecture l1 = new Lecture("A2", "deep", "java");
		l1.display();
		
		Lecture l2 = new Lecture(l1);
		l2.tech = "sql";
		l2.display();
		
		l1.display();
	}
}

class Lecture {
	String classRoom;
	String mentor;
	String tech;
	public Lecture(String classRoom, String mentor, String tech) {
		super();
		this.classRoom = classRoom;
		this.mentor = mentor;
		this.tech = tech;
	}
//COPY CONSTRUCTOR
	public Lecture(Lecture l) {
		this.classRoom = l.classRoom;
		this.mentor = l.mentor;
		this.tech = l.tech;
	}
	
	public void display() {
		System.out.println(classRoom);
		System.out.println(mentor);
		System.out.println(tech);
	}
}