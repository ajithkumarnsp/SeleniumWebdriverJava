package week1.day2;

public class LearningBitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb1 = 5;
		int numb2 = 10;
		
		LearningBitwiseOperators bitwise = new LearningBitwiseOperators();
		bitwise.or(numb1, numb2);
		bitwise.and(numb1, numb2);
		bitwise.power(numb1, numb2);
		bitwise.tilt(numb1, numb2);
		bitwise.leftshift(numb1, numb2);
		bitwise.rightshift(numb1, numb2);
		bitwise.rightshift1(numb1, numb2);
	}

	public void or(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb1 | numb2));
	}
	public void and(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb1 & numb2));
	}
	public void power(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb2 ^ numb1));
	}
	public void tilt(int numb1, int numb2)
	{
		System.out.println("The Result is " + ( ~ numb1));
	}
	public void leftshift(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb1 << numb2));
	}
	public void rightshift(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb1 >> numb2));
	}
	public void rightshift1(int numb1, int numb2)
	{
		System.out.println("The Result is " + (numb1 >>> numb2));
	}
}
