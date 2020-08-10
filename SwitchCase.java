package assignment;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) 
		{		
		
			case 1 : System.out.println("You said HI");
					break;
					
			case 2 : System.out.println("You said Hey");
					break;
					
			case 3 : System.out.println("You said Hello");
			       	break;
			       	
			default : System.out.println("Invalid choice");
			
		}
		
		sc.close();
		
	}
	
	
	
			
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
}


