package week1.day2assignments;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
	int [] arrNum = {562,90,200,46,450,700};
	Arrays.sort(arrNum);
	for (int i = 0; i < arrNum.length; i++) 
	{
		System.out.println("arrNum["+i+"] = " +arrNum[i]);
	}
System.out.println("The Second Largest element in array is " +arrNum[arrNum.length-2]);
	}

}
