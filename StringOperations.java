package Arrays;

public class StringOperations {

	public static void main(String[] args) {
		 String originalString = "Welcome to Java World";

	        // Returns the character at 5th position and display it
	        char fifthChar = originalString.charAt(4);
	        System.out.println("Character at 5th position: " + fifthChar);

	        // Compares the original string with "Welcome" lexicographically ignoring case differences
	        int comparisonResult = originalString.compareToIgnoreCase("Welcome");
	        System.out.println("Comparison result with 'Welcome': " + comparisonResult);

	        // Concatenates "- Let us learn" to the original string
	        String concatenatedString = originalString.concat("- Let us learn");
	        System.out.println("Concatenated string: " + concatenatedString);

	        // Returns the position of the first occurrence of character 'a'
	        int indexOfA = originalString.indexOf('a');
	        System.out.println("Index of 'a': " + indexOfA);

	        // Replaces all occurrences of 'a' with 'e'
	        String replacedString = originalString.replace('a', 'e');
	        System.out.println("Replaced string: " + replacedString);

	        // Returns string between 4th position and 10th position
	        String substring = originalString.substring(3, 10);
	        System.out.println("Substring between 4th and 10th position: " + substring);

	        // Returns the lowercase of the string
	        String lowercaseString = originalString.toLowerCase();
	        System.out.println("Lowercase string: " + lowercaseString);

	}

}
