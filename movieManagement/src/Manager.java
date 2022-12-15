package application;

import java.io.FileWriter;
import java.io.IOException;




public class Manager {
	
	
	String id;
	String password;
	
	Manager()
	{
		
	}
	
	Manager(String id, String password)
	{
		this.id = id;
		this.password=password;
		try
		{
			FileWriter writer = new FileWriter("manager_data.txt", true);
			writer.append(this.id+","+this.password+"\n");
			writer.close();
			
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main (String [] args)
	{
		
		


		
	}
	

}
