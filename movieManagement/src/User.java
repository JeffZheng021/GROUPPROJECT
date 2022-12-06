import java.io.FileWriter;
import java.io.IOException;

public class User 
{
    //Constructor
    private int userIndex;
    private String name;
    private String password;
    private Subscription subsription;

    
    
 
    User()
    {

    }
    User(int userIndex, String name, String password, String plan)
    {
        this.userIndex = userIndex;
        this.name = name;
        this.password=password;
        
        try
        {
        this.subsription= new Subscription(plan);
        storeUserData();
        }
        catch(InvalidPlanException e)
        {

        }
        
        
    }
    

    
    public String getUserName()
    {
        return this.name;
    }

    public int getUserIndex()
    {
        return this.userIndex;
    }

    public void setUserIndex(int userIndex)
    {
        this.userIndex = userIndex;
    }
    
    public void storeUserData()
    {
   	 try
   	 {
   	 FileWriter writer = new FileWriter("user_data.txt", true);
   	 writer.append("\n"+this.userIndex+", "+this.name+", "+this.password+", "+this.subsription.getPlan());
   	 writer.close();
   	 }
   	 catch(IOException e)
   	 {
   		 e.printStackTrace();
   	 }
    }
    
    public void setUserName(String n)
    {
        this.name = n;
    }
    
}
