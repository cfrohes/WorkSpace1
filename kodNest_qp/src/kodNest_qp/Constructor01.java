package kodNest_qp;

public class Constructor01 {
	public static void main(String[] args) {
		Students s1 = new Students(1,"rahul","mech",2024,"blr");
		s1.introduce();
		Students s2 = new Students(2,"raka","civil",2024,"pune");
		s2.introduce();
	}
	
}

class Students {
	int roll;
	String name;
	String branch;
	int yop;
	String city;


public Students(int r, String n, String b, int y, String c) {
	roll = r;
	name = n;
	branch = b;
	yop = y;
	city = c;
}

public void introduce() {
	System.out.println("roll: " + roll + "name: " + name + "branch: " +
branch + "yop: " + yop + "city: " + city);
}
}

