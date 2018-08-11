package week1.day2;

public class GetAllTheStudentsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentslist = {"Ajith", "Nachiappan", "Mahendran", "NAwin", "Kannan"};
		int[] studentsage = {29,27,35, 36, 37};
		char[][] grade = {{'A','B','C','D','E'},{'B','C','D','D','A'},{'B','A','A','A','B'},
				{'A','B', 'C','D','E'},{'A','B', 'C','D','E'}};

		/*System.out.println("Whose grade you want?");
		Scanner output = new Scanner(System.in);
		int index = output.nextInt();*/
		
		
		for(int i=0; i<=4; i++)
		{
			System.out.println(studentslist[i] + " "  +  "Who is " + studentsage[i] + " years old and scored "
					+	grade[i][0] + "," + grade[i][1] + "," + grade[i][2] + "," + grade[i][3] + ","
					+ grade[i][4]	);



		}


	}

}
