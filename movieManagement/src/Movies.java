public class Movies
{
    final private int score;
    final private int views;
    final private boolean [] categories;

    Movies(int r, int c, int v)
    {
        this.categories = new boolean [10];
        this.score = r;
        this.views = v;
        this.categories[c-1] = true;

    }
    
    //getter
    //setter
}
