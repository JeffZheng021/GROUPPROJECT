public class User 
{
    //Constructor
    private int userIndex;
    private String name;

    User()
    {

    }
    User(int i, String n)
    {
        this.userIndex = i;
        this.name = n;
    }

    public String getUserName()
    {
        return this.name;
    }

    public int getUserIndex()
    {
        return this.userIndex;
    }

    public void setUserIndex(int i)
    {
        this.userIndex = i;
    }
    
    public void setUserName(String n)
    {
        this.name = n;
    }
    
}
