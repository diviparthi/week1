package week1.day2assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arrNum = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int lengtharrNum = arrNum.length;
		System.out.println("Length of the array is " + lengtharrNum);
		int count;
		for (int i = 0; i <arrNum.length; i++) 
		{
			count = 0;
			for (int j = i+1; j < arrNum.length; j++)
			{
				if (arrNum[i]==arrNum[j]) 
				{
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Duplicates in the array is " + arrNum[i]);
			}
		}
	}

}
