package KodNEST;
//car -class
//brand,price -states
//drive -behaviour
public class OOPs2 {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("car brand  " + c.brand);
		System.out.println("car price  " + c.price);
		c.brand = "Tesla";
		c.price = 4000000;
		System.out.println("car brand  " + c.brand);
		System.out.println("car price  " + c.price);
		c.drive();
		

	}

}
class Car {
	String brand;
	int price;
	void drive() {
		System.out.println("drive safe");
	}
}
