package DailyChallenge28;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String to Reverse \n");
		name = scr.nextLine();
		System.out.println();
		System.out.println("***The Reverse of the String***");
		System.out.println();
		System.out.println(reverse(name));
		
	}
	
		public static String reverse(String name)
		{
			String rev = "";
			int length = name.length() - 1;
			for(int i = length; i>=0; i--)
			{
				rev = rev + name.charAt(i);
		}
			return rev;
	}

}
