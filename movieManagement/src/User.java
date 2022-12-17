package application;

import java.io.FileWriter;
import java.io.IOException;

public class User 
{
    //fields
    //all variables that is needed for a user: names, password, email, plan, and subcription class object sub
    private String name;
    private String password;
    private String email;
    private String plan;
    private Subscription sub;

    
    
    //constructors
    //no-args constructor
    User()
    {

    }
    //agrs constructor that can write/read from txt file, with checked exceptions
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
    //args constructor that will set a user object with arguments's values
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
    
    



    //storeUserData method, and also catch exceptions
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
    
    //setters
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