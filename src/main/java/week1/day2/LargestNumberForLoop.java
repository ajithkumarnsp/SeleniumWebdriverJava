package week1.day2;

public class LargestNumberForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {22,32,42,-22,-9};
		int largest = max(numbers);
		System.out.println("The Largest number is " + largest);
	}
	public static int max(int[] num)
	{
		int temp = num[0];

		for(int i=0; i<=4; i++)
		{
			if(num[i] > temp)
			{
				temp = num[i];
			}
		}
		return temp;
	}
}


