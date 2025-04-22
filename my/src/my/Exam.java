package my;

public class Exam {

	public static void main(String[] args) {
		//given a list [1,6,10,15,9,18] find two numbers which adds up to target of 15
		
		        int[] numbers = {6,5,1,7,8};
		        int target = 12;

		        // Iterate over the list to find the pair
		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = i + 1; j < numbers.length; j++) {
		                // Check if the pair adds up to the target
		                if (numbers[i] + numbers[j] == target) {
		                    System.out.println("Pair found: " + numbers[i] + " and " + numbers[j]);
		                    return; // Exit after finding the first pair
		                }
		            }
		        }

		        // If no pair is found
		        System.out.println("No pair found that adds up to " + target);
		    }
		}


	