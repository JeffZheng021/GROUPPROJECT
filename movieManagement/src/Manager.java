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
			writer.append("\n"+this.id+", "+this.password);
			writer.close();
			
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
