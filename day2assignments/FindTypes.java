package week1.day2assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Character array of the string is " + charArray[i]);
			if (Character.isLetter(charArray[i])) {
				letter=letter+1;
			} else if (Character.isDigit(charArray[i])) {
				num=num+1;
			} else if (Character.isSpaceChar(charArray[i])) {
				space=space+1;
			} else {
				specialChar=specialChar+1;
			}
		}
		System.out.println("Letter :" + letter);
		System.out.println("Numbers :" + num);
		System.out.println("Space :" + space);
		System.out.println("SpecialChar :" + specialChar);
	}
}
