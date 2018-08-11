package week1.day2;

public class LearningArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 45;
		int num2 = 50;
		LearningArithmeticOperators call = new LearningArithmeticOperators();
		System.out.println(call.addition(num1, num2));
		System.out.println(call.subtraction(num1, num2));
		System.out.println(call.multiply(num1, num2));
		System.out.println(call.division(num1, num2));

	}
	public int addition(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	public int subtraction(int num1, int num2)
	{
		int sub = num2 - num1;
		return sub;
	}
	public int multiply(int num1, int num2)
	{
		int multiply = num2*num1;
		return multiply;
	}
	public int division(int num1, int num2)
	{
		int quotient = num2/num1;
		return quotient;
	}
}
