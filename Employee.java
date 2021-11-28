package Hires;

public class Employee {
	
	public String firstName;
	public String lastName;
	
	//parameterised constructor
		public Employee(String firstName, String lastName)
		{
			this.firstName 	= firstName;
			this.lastName 	= lastName;
		}
		
	//update first name using getter and setter
		public String getFirstName() 
		{
			return this.firstName;
		}
		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		
	//update last name using getter and setter
		public String getLastName() 
		{
			return this.lastName;
		}
		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		
		

}
