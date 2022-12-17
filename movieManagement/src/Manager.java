package application;


//import packages to read/write files
import java.io.FileWriter;
import java.io.IOException;




public class Manager {
	
	//variables: id(username);password, both stored in string type
	String id;
	String password;
	
	//no-args constructor
	Manager()
	{
		
	}
	//two args constructor, it will throw exceptions if it have seen io exception(checked) and the line of the code by printstacktrace()
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

	

}
