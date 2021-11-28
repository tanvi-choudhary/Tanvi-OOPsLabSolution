package Hires;
import java.util.*;

public class CredentialService {
	
	
	public char[] generatePassword(int length)
	{
		
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String specialChar = "@!#$()*-_";
		
		String Combine = capitalLetter+lowerLetter+number+specialChar;
		
		Random random = new Random();
		char[] password = new char[length];
		
		password[0] = lowerLetter.charAt(random.nextInt(lowerLetter.length()));
		password[1] = number.charAt(random.nextInt(number.length()));
		password[2] = specialChar.charAt(random.nextInt(specialChar.length()));
		password[3] = capitalLetter.charAt(random.nextInt(capitalLetter.length()));
		
		for (int i = 4; i<length;i++)
		{
			password[i] = Combine.charAt(random.nextInt(Combine.length()));
		}
		
		return password;
	}
	
	
	public String generateEmailAddress()
	{
		return ".gl.com";
	}
	
	public void showCredentials ()
	{
		String s = String.valueOf(generatePassword(8));
		System.out.println("Password-->" +s);
	}

}
