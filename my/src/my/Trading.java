package my;
public class Trading  {

    // Method to calculate Fibonacci retracement levels
    public static void calculateRetracementLevels(double high, double low) {
        // Fibonacci ratios
        double[] ratios = {23.6, 38.2, 50.0, 61.8, 76.4};

        // Calculate the difference between high and low prices
        double difference = high - low;

        // Print out the retracement levels
        System.out.println("Fibonacci Retracement Levels:");
        for (double ratio : ratios) {
            double level = high - (difference * (ratio / 100));
            System.out.printf("Level at %.1f%%: %.2f\n", ratio, level);
        }
    }

    public static void main(String[] args) {
        // Example high and low prices
        double highPrice = 230.43; // Example high price
        double lowPrice = 229.80;  // Example low price

        // Calculate and display Fibonacci retracement levels
        calculateRetracementLevels(highPrice, lowPrice);
    }
}

