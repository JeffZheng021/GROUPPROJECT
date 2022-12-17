package application;

//import all needed packages
import java.io.FileWriter;
import java.io.IOException;

public class Subscription 
{
    //all types of variables: monthlyprice,plan,downloads,devices,number of subcriptions
    private double monthlyPrice;
    private String plan; //basic, standard, and premium
    private int availableDownloads;
    private int supportedDevices;
    private static int numberOfSubs;
    
    //no-args constructor
    Subscription()
    {
        this.plan = "basic";
        this.monthlyPrice = 0;
        this.availableDownloads = 0;
        this.supportedDevices = 0;
        numberOfSubs ++;
    }

    //args constructor but it will check for the created invalid plan exception, if it does, it will not run
    Subscription(String plan) throws InvalidPlanException
    {
    	if(!((plan=="basic")||(plan=="standard")
    	||(plan=="premium") ))
    	{
    		throw new InvalidPlanException();
    	}
    	
    	else
    	{
	    	if(plan.equals("basic"))
	    	{
	    		this.plan = "basic";
	            this.monthlyPrice = 10;
	            this.availableDownloads = 1;
	            this.supportedDevices = 1;
	            numberOfSubs++;
	    	}
	    	
	    	else if(plan.equals("standard"))
	    	{
	    		this.plan = "standard";
	            this.monthlyPrice = 15;
	            this.availableDownloads = 2;
	            this.supportedDevices = 2;
	            numberOfSubs++;
	    	}
	    	
	    	else if(plan.equals("premium"))
	    	{
	    		this.plan = "premium";
	            this.monthlyPrice = 20;
	            this.availableDownloads = 4;
	            this.supportedDevices = 4;
	            numberOfSubs++;
	    	}
    	}
     

    }
   
    
    @Override
    public String toString()
    {
    	return "Plan: "+plan+", Price: "+monthlyPrice+", Available Downloads: "+availableDownloads+", Supported Devices: "+supportedDevices;
    }

    //getters and setters
    public double getMonthlyPrice()
    {
        return this.monthlyPrice;
    }

    public double getAnnualPrice()
    {
        return (this.monthlyPrice * 12);
    }
    
    public int getNumberOfSubs()
    {
    	return numberOfSubs;
    }
    
    public String getPlan()
    {
        return this.plan;
    }
    
    public int getAvailableDownloads()
    {
        return this.availableDownloads;
    }

    public int getSupportedDevices()
    {
        return this.supportedDevices;
    }

    //cancelSubscription method, will initialze everything back to free and 0 dollar per month
    public void cancelSubscription()
    {
        this.plan = "free";
        this.monthlyPrice = 0;
    }

    private void setMonthlyPrice(double price)
    {
        this.monthlyPrice = price;
    }

    private void setPlan(String plan)
    {
        this.plan=plan;
    }

    private void setAvailableDownloads(int downloads)
    {
        
    	this.availableDownloads = downloads;
        
    }

     private void setSupportedDevice(int devices)
     {
        this.supportedDevices=devices;
     }
     
     //method storeUserData will store all of the ones created in the txt file
     public void storeUserData()
     {
    	 try
    	 {
    	 FileWriter writer = new FileWriter("user_data.txt", true);
    	 writer.append("");
    	 }
    	 catch(IOException e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}

    //create own exception invalid plan exception
class InvalidPlanException extends Exception
{
	public InvalidPlanException()
	{
		super("This is not a valid plan combination");
	}
}