package codechallenge02072018;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Password");
		String password = scr.nextLine();
		String specialcharacters = "!@#$%^&*()_+{}[]<>?/|=~`.,";
		int stringlength = password.length();
		checklength(stringlength, specialcharacters);
		
	}
		
	public static boolean checklength(int stringlength, String password  )
	{
		int digitcount = 0;
		int alphabetcount = 0;
		int uppercasecount = 0;
		if(stringlength < 10 )
		{
			System.err.println("The Password must have at least ten Characters");
			return false;
		}
		else
		for(int i = 0; i<stringlength;i++ )
		{
			if(!Character.isLetterOrDigit(password.charAt(i)))
			{
				
				System.err.println("The Password must have only alphabets and digits");
				return false;
			}
			if (Character.isDigit(password.charAt(i))) {  
				digitcount++; 
			}
			else
			if(digitcount < 2)
			{
				System.out.println("The password must contains 2 digits");
				return false;
			}
		else if(Character.isUpperCase(password.charAt(i))){
            	uppercasecount++;
            }
            if(uppercasecount < 1)
			{
				System.out.println("The password must contains atleast 1  Special character");
				return false;
			}
            else
            if(alphabetcount < 2)
			{
				System.out.println("The password must contains atleast 2  alpahabets");
				return false;
			}
		

}
		return true;
	}
}
	
