package week1.day2;
public class LargestNumberForEach {

	
	public static int max1(int[] num)
	{
		
		int largest = num[0]; // temp = 22, 32, 42

		for (int no : num) // 22, 32, 42, -22, -9
		{
			if(no > largest ) //22 > 22, 32 > 22, 42 > 32 , -22 > 42 , - 9 > 42
			{
				largest = no; //32, 42
			}
		}
		return largest; 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {22,32,42,-22,-9};
		System.out.println("The largest number is " + max1(numbers));



	}

}

