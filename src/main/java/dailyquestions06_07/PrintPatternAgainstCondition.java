package dailyquestions06_07;

import java.util.Scanner;

public class PrintPatternAgainstCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		a = scr.nextInt();
		b = scr.nextInt();
		String res = "";
		if(a<b)
		{
		for(int i=a; i<=b; i++)
		{
			res = res + calculate(i);
			System.out.println(res);
		}
		}
		else if(a>b)
{
for(int i=a; i>=b; i--)
{
	res = res + calculate(i);
}
}
else
	res = res + calculate(a);

	}
	public static  String calculate(int i)
	{
		String result;
		if((i%3 ==0 && i%5 ==0))
		{
			result = "FIZZBUZZ ";

		}
		else if(i%3 == 0)

			{
			result ="FIZZ ";
			}
			else if(i%5 == 0)
				{
				result ="BUZZ ";
				}
			else
				{
				result = i + " ";
				}
		return result;
	}


}
