package Hires;
import java.util.*;


public class Main {
	
	static Employee e = new Employee("harshit","choudhary");
	static CredentialService c = new CredentialService();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str = c.generateEmailAddress();
		/*
		System.out.println("Enter your FirstName");
		 e.setFirstName (scanner.next());
		
		
		System.out.println("Enter your LastName");
		e.setLastName(scanner.next());
	
		*/
		
		
		System.out.println("Please enter the department from the following");
		System.out.println(" 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
		int choice = scanner.nextInt();
		
			switch(choice)  	
			{
				case 1: 
					System.out.println("Email -->" +e.firstName +e.lastName+"@tech"+ str);
					break;
			
				case 2:
					System.out.println("Email -->" +e.firstName +e.lastName+"@admin"+str);
					break;
			
				case 3:
					System.out.println("Email -->" +e.firstName +e.lastName+"@hr"+str);
					break;
			
				case 4:
					System.out.println("Email -->" +e.firstName +e.lastName+"@legal"+str);
					break;
			
			}
			
			
	c.showCredentials();

	}

}
