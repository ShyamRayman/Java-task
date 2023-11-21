import java.util.*;

class pyramid{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Hey peoples lets start the pyramid game");
	System.out.println("Enter your number");
	long val = scan.nextLong();
	System.out.println("-------Here you go-------");
	System.out.println(" " + " " + " " + " " + val + " " + " " +" " );
	System.out.println(" " + " " + " " + val + val + val +" " +" " +" ");
	System.out.println(" " + " " + val + val + val + val + val +" " +" ");
        System.out.println(" " + val + val + val + val + val + val +val +" ");
	}
}
	