package week1.day1assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;                         //input : 0,1,1,2,3,5,8,13
		int firstNum=0; 
		int secondNum=1;
		int sum=0;
		
		System.out.println("The first number is " +firstNum);
		System.out.println("The Second number is " +secondNum);
		
		for (int i = 1; i < range; i++) 
		{
			sum = firstNum + secondNum;           //sum=0+1 =1  //sum=1+1=2   //sum=1+2=3
			firstNum=secondNum;                   //firstNum=1  //firstNum=1  //firstNum=2
			secondNum=sum;                        //secondNum=1 //secondNum=2 //secondNum=3
			System.out.println("The sum is " + sum);
		}
		
	}

}
