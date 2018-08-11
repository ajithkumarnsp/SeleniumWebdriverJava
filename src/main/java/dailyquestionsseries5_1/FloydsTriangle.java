package dailyquestionsseries5_1;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rat =1;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number of rows Size");
		int row = scr.nextInt();
		for (int i = 1; i <= row; i++)
		{
			for( int j=1; j<=i; j++)
			{
				System.out.print(rat + " ");
				rat++;
			}
			System.out.println();
		
		}
		
	}

}
