import java.util.Scanner;

class Scann{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your name : ");
	String email = scan.nextLine();
	System.out.println("enter your roll : ");
	int roll = scan.nextInt();
	System.out.println("enter your float : ");
	float deci = scan.nextFloat();
	System.out.println("---------------------");
 	System.out.println("Student details");
	System.out.println("your mail is" +email);
	System.out.println("your roll is" +roll);
	System.out.println("your deci is" +deci);
	}
}
	
	
	
	
		