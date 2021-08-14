package week1.day2assignments;

public class CharacterOccurence {

	public static void main(String[] args) 
	{
		String string1 = "I am a superman i am a beautiful boy";
		int count=0;
		char [] charArray = string1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Character array of the string is " + charArray[i]);
		}
		int lengthchar = charArray.length;
		System.out.println("Length of the array is " +lengthchar);
		for (int i = 0; i < charArray.length; i++) 
		{
		 if (charArray[i]=='a')
		 {
			count++;
		}
		}
		System.out.println("The number of occurences of character 'a' is " +count);
	}

}
