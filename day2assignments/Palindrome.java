package week1.day2assignments;

public class Palindrome {

	public static void main(String[] args) {

		String string1 = "civic";
		String reverseString = "";
		for (int i = string1.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string1.charAt(i);
		}
		System.out.println("Reversed string is " + reverseString);
		if (string1.equalsIgnoreCase(reverseString)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
