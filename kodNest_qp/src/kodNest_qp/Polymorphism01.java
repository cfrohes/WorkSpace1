package kodNest_qp;

public class Polymorphism01 {
	public static void main(String[] args) {
		Robot r;
//		r = new FighterRobot();
//		r.learn();
//		r.talk();
//		r.charge();
		FighterRobot fr = new FighterRobot();
		accessRobot(fr);
//		accessRobot(new FighterRobot());
//		accessRobot(new DriverRobot());
//		accessRobot(new TeacherRobot());
		
		
//		r = new DriverRobot();
//		r.learn();
//		r.talk();
//		r.charge();
//		r = new TeacherRobot();
//		r.learn();
//		r.talk();
//		r.charge();
    }
	public static void accessRobot(Robot robo) {
		robo.learn();
		robo.talk();
		robo.charge();
	}
}

class Robot {
	void learn() {
		System.out.println("learning");
	}
	void talk() {
		System.out.println("talking");
	}
	void charge() {
		System.out.println("charging");
	}
}

class FighterRobot extends Robot {
	void learn() {
		System.out.println("FighterRobot learning how to fight");
	}
	void talk() {
		System.out.println("FighterRobot talking about  fight");
	}
	void charge() {
		System.out.println("FighterRobot charging to fight");
	}
}

class DriverRobot extends Robot {
	void learn() {
		System.out.println("DriverRobot learning how to drive");
	}
	void talk() {
		System.out.println("DriverRobot talking about  drive");
	}
	void charge() {
		System.out.println("DriverRobot charging to drive");
	}
}

class TeacherRobot extends Robot {
	void learn() {
		System.out.println("TeacherRobot learning how to teach");
	}
	void talk() {
		System.out.println("TeacherRobot talking about  teaching");
	}
	void charge() {
		System.out.println("TeacherRobot charging to teach");
	}
}

class PlayerRobot extends Robot {
	void learn() {
		System.out.println("PlayerRobot learning how to teach");
	}
	void talk() {
		System.out.println("PlayerRobot talking about  teaching");
	}
	void charge() {
		System.out.println("PlayerRobot charging to teach");
	}
}