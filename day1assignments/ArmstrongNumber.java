package week1.day1assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int input=153;                             //input = 153 -- Output-(1*1*1)+(5*5*5)+(3*3*3)
	int calculated=0;
	int remainder;
	int original;
	int quotient;
	original=input;
	while(input>0)
	{
	remainder=input%10;           //remainder=153%10=3  //remainder=15%10=5 //remainder=1%10=1
	quotient=input/10;            //quotient=153/10=15  //quotient=15/10=1  //quotient=1/10=0
	input=quotient;               //input=15            //input=1           //input=0
    calculated=calculated+(remainder * remainder * remainder);
    
	}
	if (calculated==original) 
	{
		System.out.println("It is armstrong number");
	} else
	{
System.out.println("It is not armstrong number");
	}
	}
}
