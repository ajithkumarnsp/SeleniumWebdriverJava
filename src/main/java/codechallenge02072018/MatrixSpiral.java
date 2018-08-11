package codechallenge02072018;

import java.util.Scanner;

public class MatrixSpiral {



			public static void main(String[] args) {
				
				Scanner scr = new Scanner(System.in);
				System.out.println("Enter the row and column");
				  
				int rowStart = 0;
				
				int colStart = 0;
				System.out.println("Enter the matrix");
				int [][] matrix = new int[rowStart][colStart];
				  int rowLength=matrix.length;
				   
				  
				  int colLength = matrix.length;
				  
				  printMatrixInSpiralWay(matrix, colLength, colLength, colLength, colLength);
				
				
}
			
			private static void printMatrixInSpiralWay(int[][] matrix, int rowStart,
					int rowLength, int colStart, int colLength){
				 
				  
				   
				  while(rowStart <= rowLength && colStart <= colLength){
				   
				   for (int i = rowStart; i <= colLength; i++) {
				    System.out.print(matrix[rowStart][i] + " ");
				   }
				 
				   for (int j = rowStart+1; j <= rowLength; j++) {
				    System.out.print(matrix[j][colLength] + " ");
				   }
				    
				   if(rowStart+1 <= rowLength){
				    for (int k = colLength-1; k >= colStart; k--) {
				     System.out.print(matrix[rowLength][k] + " ");
				    }
				   }
				   if(colStart+1 <= colLength){
				    for (int k = rowLength-1; k > rowStart; k--) {
				     System.out.print(matrix[k][colStart] + " ");
				    }
				   }
				    
				   rowStart++;
				   rowLength--;
				   colStart++;
				   colLength--;
				  }
				 }
				}	
			
			

