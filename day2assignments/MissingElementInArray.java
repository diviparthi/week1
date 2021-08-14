package week1.day2assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arrNum = {1,2,3,4,7,6,8};
		Arrays.sort(arrNum);
		for (int i = 0; i <= arrNum.length-1; i++) {
			int x=i+1;
			if(x!=arrNum[i]) 
			{
				System.out.println("The missing element in array is " +x);
			break;
			}
		}
		

	}

}
