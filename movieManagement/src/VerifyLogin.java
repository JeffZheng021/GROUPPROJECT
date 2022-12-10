package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class VerifyLogin {
	
	String filePath;
	String inputUsername;
	String inputPassword;
	

	public static boolean verify(String inputUsername, String inputPassword, String filePath)
	{
		boolean found = false;
		String tempUsername = "";
		String tempPassword = "";
		
		try
		{	File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter("[,\n]");
			while(scanner.hasNext() && !found)
			{
				tempUsername = scanner.next();
				tempPassword = scanner.next();
				
				if(tempUsername.equals(inputUsername) && tempPassword.equals(inputPassword))
				{
					found = true;
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return found;
	}

}

