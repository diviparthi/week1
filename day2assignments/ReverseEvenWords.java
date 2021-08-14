package week1.day2assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String string1 = "I am a software tester";
		String [] splitstring1 = string1.split(" ");  //Syntax for splitstring with space
		for (int i = 0; i < splitstring1.length; i++) 
		{
			System.out.println("Splitted string is " +splitstring1[i]);
			if(i%2!=0)
			{
			String string2 = splitstring1[i];
			for (int j =string2.length()-1; j >= 0; j--) 
			{
				System.out.println(string2.charAt(j));
			}
		}
	

	}

}}
