package week1.day1;

public class ArithmeticOperations {
//Declaration of the Variables
	int numberOne = 100;
	int numberTwo = 7;

//Adding two numbers	
public void addition()
{
	System.out.println("The Addition of two Numbers is\n" +(numberOne+numberTwo));
}

//Subtracting Two Numbers
public int subtraction()
{
	int subtract;
subtract = numberOne - numberTwo; //100 - 7 = 93
return subtract;

}
//Multiplying two Numbers
public void multiplyNumberTwoNummberOne()
{
	System.out.println("The Multiplication of two Numbers is\n" + numberOne * numberTwo);
}
//Dividing Two Numbers
public float divideNumberOneNumberTwo(float divide)
{
	divide = numberOne/numberTwo;
	return divide;
}
public int reminderOfNumberOneNumberTwo(int reminder)
{
	reminder = numberOne%numberTwo;
	return reminder;
}
}
