package multilevelinheritence;

public class Audi extends Car {

	public void audi()
	{
		System.out.println("The Class name is audi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Audi object = new Audi();
	
		object.car();
		object.audi();
		object.vehicle();
		object.brake();
		
	}
}
