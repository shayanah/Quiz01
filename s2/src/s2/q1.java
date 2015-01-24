package s2;
//version 222
import java.util.Scanner;

public class q1 {

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Username: ");
		String username = in.next();
	
		
		System.out.print("Enter your Password: ");
		String password = in.next();
		
		
		System.out.println("Hello " +  username +"," + 
		"Welcome to CSC200 class! and Your password is " + password);
		
	}
}