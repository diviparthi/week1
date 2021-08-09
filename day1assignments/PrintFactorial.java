package week1.day1assignments;

public class PrintFactorial {
 //Goal is to find factorial of given number
	// If input is 5 then factorial is 5*4*3*2*1=120
	public static void main(String[] args) {
		
int input=5;
int fact=1;
for (int i = 1; i <= input; i++)   //1<=5 then fact =1*1 =1
{                                  //2<=5 then fact =1*2 =2
	fact=fact*i;                   //3<=5 then fact =2*3 =6
	                               //4<=5 then fact =6*4 =24
}                                  //5<=5 then fact =24*5 =120
System.out.println("Factorial of given input is " +fact);
	}

}
