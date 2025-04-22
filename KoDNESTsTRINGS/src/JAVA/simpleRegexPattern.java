package JAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simpleRegexPattern {
	    public static void main(String[] args) {
	        // Example string
	        String text = "Hello123, this is a sample text with 5 apples.";

	        // Anchors (start and end of line)
	        System.out.println("Anchors:");
	        matchPattern("^Hello", text); // ^ matches the start of the string
	        matchPattern("apples\\.$", text); // $ matches the end of the string

	        // Quantifiers (*, +, ?)
	        System.out.println("\nQuantifiers:");
	        matchPattern("\\d+", text); // + matches one or more digits

	        // Character classes ([abc], [^abc], [a-zA-Z])
	        System.out.println("\nCharacter Classes:");
	        matchPattern("[a-zA-Z]+", text); // Matches any sequence of letters

	        // Predefined character classes (\d, \w, \s)
	        System.out.println("\nPredefined Character Classes:");
	        matchPattern("\\d", text); // \d matches any digit
	        matchPattern("\\w+", text); // \w matches any word character (letters, digits, underscores)

	        // Groups and Ranges ((...), [a-z])
	        System.out.println("\nGroups and Ranges:");
	        matchPattern("(\\w+)(\\d+)", text); // Matches words followed by digits (like Hello123)

	        // Boundary matches (\b)
	        System.out.println("\nBoundary Matches:");
	        matchPattern("\\bis\\b", text); // Matches the word "is" at word boundaries

	        // Lookahead (?=...) and Lookbehind (?<=...)
	        System.out.println("\nLookahead and Lookbehind:");
	        matchPattern("\\d(?= apples)", text); // Lookahead: Matches the digit before "apples"
	        matchPattern("(?<=Hello)\\d+", text); // Lookbehind: Matches digits that come after "Hello"
	    }

	    // Method to match and print patterns
	    public static void matchPattern(String regex, String text) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }
	    }
	}



