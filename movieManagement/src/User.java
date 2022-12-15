package application;

import java.io.FileWriter;
import java.io.IOException;

public class User 
{
    //fields

    private String name;
    private String password;
    private String email;
    private String plan;
    private Subscription sub;

    
    
    //constructors
    
    User()
    {

    }
    
    User(String name, String password, String email, String plan, boolean writeData)
    {

        this.name = name;
        this.email = email;
        this.password=password;
        
        try
        {
	        this.sub= new Subscription(plan);
	        if(writeData = true)
	        {
	        	storeUserData();
	        }
        }
        catch(InvalidPlanException e)
        {

        }
        
        
    }
    
    User(String name, String password, String email, String plan)
    {
    	this.name = name;
        this.email = email;
        this.password=password;
        this.plan = plan;
    	
    }
    

    //getters
    public String getName()
    {
        return this.name;
    }
    
    public String getPlan()
    {
    	return this.plan;
    }
    
    public String getEmail()
    {
    	return this.email;
    }
    
    public String getPassword()
    {
    	return this.password;
    }
    
    



    
    public void storeUserData()
    {
   	 try
   	 {
   	 FileWriter writer = new FileWriter("user_data.txt", true);
   	 writer.append(this.name+","+this.password+","+this.email+","+this.plan+"\n");
   	 writer.close();
   	 }
   	 catch(IOException e)
   	 {
   		 e.printStackTrace();
   	 }
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPlan(String plan)
    {
    	this.plan = plan;
    }
    
    public void setEmail(String email)
    {
    	this.email = email;
    }
    
    public void setPassword(String password)
    {
    	this.password = password;
    }
    
}