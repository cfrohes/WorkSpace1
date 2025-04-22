package my;
import java.util.Arrays;
public class SortingArray {
	public static void main(String[] args) {
	        int[] arr = {5, 3, 8, 4, 2, 7};

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Print the sorted array
	        System.out.println("Sorted array: " + (arr[arr.length-2]));
	    }
	}


//import java.util.LinkedHashSet;
//import java.util.Set;
//
//public class RemoveDuplicateWords {
//    public static String removeDuplicates(String sentence) {
//        // Split the sentence into words
//        String[] words = sentence.split("\\s+");
//
//        // Use LinkedHashSet to maintain insertion order
//        Set<String> uniqueWords = new LinkedHashSet<>();
//
//        // Add words to the Set
//        for (String word : words) {
//            uniqueWords.add(word);
//        }
//
//        // Join the words back into a sentence
//        return String.join(" ", uniqueWords);
//    }
//
//    public static void main(String[] args) {
//        String sentence = "This is is a a test test sentence";
//        String result = removeDuplicates(sentence);
//        System.out.println("Original: " + sentence);
//        System.out.println("Without duplicates: " + result);
//    }
//}
