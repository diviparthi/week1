package week1.day1assignments;

public class PrimeNumber {

	public static void main(String[] args) {
	int input=13;
	boolean flag= false;
	int remainder;
	for (int i = 2; i < input/2; i++)           //Primenumber is number divided by themselves and 1
	{                                           //Primenumber will get remainder if divided by 2
		remainder=input%i;
		System.out.println("Remainder for each loop is " +remainder);
		if (remainder==0) 
		{
			flag=true;
		}
	}
if(flag==false)
{ 
	System.out.println("It is a prime number");
	}
else
	System.out.println("It is not a prime number");
	}

}
