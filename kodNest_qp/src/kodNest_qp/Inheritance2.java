package kodNest_qp;
import java.util.Scanner;
public class Inheritance2 {
	public static void main(String[] args) {
	 // Write your code here
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine().toLowerCase();
		        int n = sc.nextInt();
		        if (input.equals("celcius")) {
		            System.out.println("Temperature in Fahrenheit: " + TemperatureConverter.getFahrenheit(n));
		        }
		        if (input.equals("fahrenheit")) {
		            System.out.println("Temperature in Celsius: " + TemperatureConverter.getCelsius(n));
		        }
		    }
		}
class TemperatureConverter {
    // Static method to convert Celsius to Fahrenheit
    public static double getFahrenheit(int celcius) {
        return (celcius * (9.0/5) + 32);
    }
    // Static method to convert Fahrenheit to Celsius
    public static double getCelsius(int fahrenheit) {
        return ((fahrenheit - 32)* (5.0/9));
    }
}

		