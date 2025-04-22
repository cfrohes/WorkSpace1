package kodNest_qp;

public class Abstraction03 {
	public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.run();  // Outputs: Car is running smoothly.
    }
}
abstract class Vehicle {
    abstract void run();
}
class Car extends Vehicle {
    void run() {
        System.out.println("Car is running smoothly.");
    }
}
