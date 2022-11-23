public class Subscription 
{
    private double monthlyPrice;
    private String plan;
    private int availableDownloads;
    private int supportedDevices;
    private int numberOfSubs;

    Subscription()
    {
        this.plan = "free";
        this.monthlyPrice = 0;
        this.availableDownloads = 0;
        this.supportedDevices = 1;
        this.numberOfSubs = 5;
    }

    Subscription(String plan, double price, int downloads, int devices) //throws IllegalArgumentException(needs double checking)
    {
        this.plan = plan;
        this.monthlyPrice = price;
        this.availableDownloads = downloads;
        this.supportedDevices = devices;

    }

    public double getMonthlyPrice()
    {
        return this.monthlyPrice;
    }

    public double getAnnualPrice()
    {
        return (this.monthlyPrice * 12);
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

    private void setMonthlyPrice()
    {
        this.monthlyPrice = 15.99;
    }

    private void setPlan()
    {
        if(this.monthlyPrice == 0)
        {
            this.plan = "free";
        }
        else
        {
            this.plan = "paid";
        }
    }

    private void setAvailableDownloads()
    {
        if (this.plan == "free")
        {
            this.availableDownloads = 0;
        }
        else
        {
            this.availableDownloads = 5;
        }
    }

     private void setSupportedDevice()
     {
        if(this.plan == "free")
        {
            this.supportedDevices = 1;
        }
        else
        {
            this.supportedDevices = 3;
        }
     }
}
