package kodNest_qp;

public class Constructor_Super01 {
	public static void main(String[] args) {
		new SamsungPhone();
	}
}

class Phone {
	Phone() {
		System.out.println("Phone Constructor");
	}
}

class SmartPhone extends Phone {
	 SmartPhone() {
		System.out.println("Smartphone Constructor");
	}
}

class AndroidPhone extends SmartPhone {
	 AndroidPhone() {
		System.out.println("Androidphone Constructor");
	}
}

class SamsungPhone extends AndroidPhone {
	public SamsungPhone() {
		System.out.println("Samsung Constructor");
	}
}