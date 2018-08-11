package week1.day2;
import java.util.Scanner;
public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0,1,2,3,4
		String[] studentslist = {"Ajith", "Nachiappan", "Mahendran", "NAwin", "Kannan"};
		int[] studentsage = {29,27,35, 36, 37};
		char[][] grade = {{'A','B','C','D','E'},{'B','C','D','D','A'},{'B','A','A','A','B'},
				{'A','B', 'C','D','E'},{'A','B', 'C','D','E'}};
/*q//A B C D E
1//B C D D A
2//C C C C C
3//B C D D E
4//A A A A A
*/		
		System.out.println("Whose greade you want?");
		Scanner output = new Scanner(System.in);
		int i = output.nextInt();// int i = 4
		

		i = i -1;//4 - 1 = 3

		System.out.println(studentslist[i]  +  " Who is " + studentsage[i] + " years old and scored "
				+	grade[i][0] + "," + grade[i][1] + "," + grade[i][2] + "," + grade[i][3] + ","
				+ grade[i][4]	);



	}

}


