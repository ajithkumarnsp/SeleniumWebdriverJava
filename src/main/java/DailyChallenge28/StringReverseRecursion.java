package DailyChallenge28;

import java.util.Scanner;

public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		String name = scr.nextLine();
		System.out.println("The Reverse of your name is " + reversestring(name));
	}

	public static String reversestring(String name)
	{
		String reverse = "";
		int length = name.length()-1;
		if (name.length() == 0)
			return name;
		{
			reverse = reverse + name.charAt(length) + 
					reversestring(name.substring(0, length));
		}
		return reverse;
	}

}
