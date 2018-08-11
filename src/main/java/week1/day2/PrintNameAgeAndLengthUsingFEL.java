package week1.day2;

public class PrintNameAgeAndLengthUsingFEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentslist = {"Ajith", "Nachiappan", "Mahendran", "NAwin", "Kannan"};
		int[] studentsage = {29,27,35,36,37};
		char[][] grade = {{'A','B','C','D','E'},{'B','C','D','D','A'},{'B','A','A','A','B'},
				{'A','B', 'C','D','E'},{'A','B', 'C','D','E'}};

		/*System.out.println("Which students age do you want");
		Scanner out = new Scanner(System.in);
		int index =  out.nextInt();

		index = index - 1;
		 */
		System.out.println("**********The Length of the Names***********");
		for (String namelength : studentslist)
		{
			System.out.println("The Length of the Name " + namelength + " is " + namelength.length());

		}
		System.out.println();
		System.out.println("**********The Ages of the Students***********");
		for (int age : studentsage)
		{
			System.out.println("The age of the student is " + age );
		}
		System.out.println();
		System.out.println("**********The Name of the Students***********");
		for (String name : studentslist)	
		{

			System.out.println("The Name of the student is " + name);
		}
		
	}

}
