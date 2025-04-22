package leet;
import java.util.HashSet;
import java.util.Set;
public class ReverseString {
	    public String reverseVowels(String s) {
	        Set<Character> vowels = new HashSet<>();
	        vowels.add('a');
	        vowels.add('e');
	        vowels.add('i');
	        vowels.add('o');
	        vowels.add('u');
	        vowels.add('A');
	        vowels.add('E');
	        vowels.add('I');
	        vowels.add('O');
	        vowels.add('U');
	        
	        char[] strArray = s.toCharArray();
	        int left = 0, right = strArray.length - 1;
	        
	        while (left < right) {
	            // Move left pointer until a vowel is found to reverse vowels you have to 
	        	//remove ! symbol............
	            while (left < right && !vowels.contains(strArray[left])) {
	                left++;
	            }
	            // Move right pointer until a vowel is found
	            while (left < right && !vowels.contains(strArray[right])) {
	                right--;
	            }
	            // Swap the vowels
	            char temp = strArray[left];
	            strArray[left] = strArray[right];
	            strArray[right] = temp;
	            
	            left++;
	            right--;
	        }
	        
	        return new String(strArray);
	    }
	    
	    public static void main(String[] args) {
	    	ReverseString solution = new ReverseString();
	        
	        // Test case 1
	        String s1 = "hello";
	        System.out.println(solution.reverseVowels(s1)); // Output: "holle"
	        
	        // Test case 2
	        String s2 = "leetcode";
	        System.out.println(solution.reverseVowels(s2)); // Output: "leotcede"
	    }
	}

