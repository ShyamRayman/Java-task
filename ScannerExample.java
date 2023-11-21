import java.util.Scanner;
	
class ScannerExample{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter you email : " );
	String email = scan.nextLine();
	System.out.println("Enter your stupid phone number");
	long phoneNumber = scan.nextLong();
	System.out.println("----------------------");
	System.out.println("your mail is " +email);
	System.out.println("your phonenumber is " +phoneNumber);
}
}
	
		