package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 4321;  //Defining input number
int sum = 0;        //Declaring total with the name as sum
int quotient = 1;   //To satisfy the while condition, declaring quotient value as 1
int remainder;
while(quotient != 0) //while loop will process until the quotient becomes 0
{
	
	remainder = number%10;                            //4321%10=1
	System.out.println("Remainder is " + remainder);  //Print the remainder
	sum = sum + remainder;                            //sum=0+1 = 1
	System.out.println("Sum is " + sum);               //Print the sum
	quotient = number/10;                             //4321/10=432
	System.out.println("Quotient is " +quotient);      //Print the quotient
	number = quotient;                                //number =432
}
System.out.println("Sum of all the digits :" + sum);
	}

}
