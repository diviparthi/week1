package week1.day2assignments;

public class Calculator {

	public int add(int num1, int num2, int num3) {          //int is given instead of void as it 
		int sum = num1 + num2 + num3;                       // returns the value as int
		System.out.println("Sum of these numbers " + sum);
		return sum;
	}

	public int sub(int num1, int num2) {             //Same way int is given as it returns value
		int sub = num1 - num2;
		System.out.println("Sum of these numbers " + sub);
		return sub;
	}

	public double mul(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println("Multiplication of the numbers " + mul);
		return mul;
	}

	public float divide(float num1, float num2) {
		float divide = num1 / num2;
		System.out.println("Division of the numbers " + divide);
		return divide;
	}

	public static void main(String[] args) {
		Calculator calObj = new Calculator();
		calObj.add(60, 30, 100);
		calObj.sub(1000, 450);
		calObj.mul(2563.25, 59862.442);
		calObj.divide(5.96f, 2.65f);
	}

}
