package week1.day2;

public class LargestOf3NumbersButNotInArray
{
	static int a=45;
	static int b=34;
	static int c=89;
	public static void largestnumber() 
	{
		if(a>=b&a>=c) 
		{
			System.out.println("A value is largest value");
		}
		if(b>=a&b>=c)
		{
			System.out.println("B value is largest value");
		}
		if(c>=a&c>=b)
		{
			System.out.println("C value is largest value");
		}	
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	largestnumber();
}
}