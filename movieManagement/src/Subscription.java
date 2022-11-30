
public class Subscription 
{
    private double monthlyPrice;
    private String plan; //basic, standard, and premium
    private int availableDownloads;
    private int supportedDevices;
    private static int numberOfSubs;
    
    @Override
    public String toString()
    {
    	return "Plan: "+plan+", Price: "+monthlyPrice+", Available Downloads: "+availableDownloads+", Supported Devices: "+supportedDevices;
    }
    Subscription()
    {
        this.plan = "basic";
        this.monthlyPrice = 0;
        this.availableDownloads = 0;
        this.supportedDevices = 0;
        numberOfSubs ++;
    }

    Subscription(String plan, double price, int downloads, int devices) throws InvalidCombinationException
    {
    	if(!((plan=="basic" && price==10 && downloads==1 && devices==1)||(plan=="standard" && price==15 && downloads==2 && devices==2)
    	||(plan=="premium" && price==20 && downloads==4 && devices==4) ))
    	{
    		throw new InvalidCombinationException();
    	}
        this.plan = plan;
        this.monthlyPrice = price;
        this.availableDownloads = downloads;
        this.supportedDevices = devices;
        numberOfSubs++;

    }

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
}

class InvalidCombinationException extends Exception
{
	public InvalidCombinationException()
	{
		super("This is not a valid plan combination");
	}
}