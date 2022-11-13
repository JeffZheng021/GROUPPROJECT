public class User 
{
    //Constructor
    private int userIndex;
    private boolean [] personalities;
    private int [] ratings;

    User(int i)
    {
        this.userIndex = i;
        this.personalities = new boolean[50];
        this.ratings = new int[500];
    }

    boolean [] getUserPersonalities()
    {
        return this.personalities;
    }

    int [] getUserRatings()
    {
        return this.ratings;
    }

    
}
