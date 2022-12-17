package application;


//import packages to read/write files
import java.io.FileWriter;
import java.io.IOException;




public class Manager {
	
	//variables: id(username);password, both stored in string type
	private String id;
	private String password;
	
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
	
	public String getId()
	{
		return this.id;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}

	

}
