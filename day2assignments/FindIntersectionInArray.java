package week1.day2assignments;

public class FindIntersectionInArray {

	public static void main(String[] args) 
	{
		int[] arrNum = { 3, 2, 11, 4, 6, 7 };
		int[] arrNum2 = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i < arrNum.length; i++) 
		{
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
			for (int j = 0; j < arrNum2.length; j++)
			{
				System.out.println("arrNum2[" + j + "] = " + arrNum2[j]);
				if (arrNum[i] == arrNum2[j])
				{
					System.out.println("Intersected elements are " + arrNum[i]);

				}

			}
		}

	}

}
