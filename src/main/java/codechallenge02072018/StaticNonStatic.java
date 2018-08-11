package codechallenge02072018;

public class StaticNonStatic {
	
	public static String word1 = "Hello";
	public static String word2 = "World";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nonstatic(word1, word2);
		staticmethod(word1, word2);
		
	}
		public static void nonstatic(String name, String desc) {
			
			System.out.print(name + " ");
			System.out.println(desc);
			
		}
		
	public static void staticmethod(String name, String desc) {
			
			System.out.print(name + " ");
			System.out.println(desc);
			
		}
		
	}

