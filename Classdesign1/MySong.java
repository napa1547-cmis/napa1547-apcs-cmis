public class MySong
{
    private String title;
    private int stanzas;
    private boolean IsItGood; 
    
    public MySong()
    {
        title = new String ("CmisSong");
        stanzas = 2;
        IsItGood = true;
    }// end constructer MySong
    
    public MySong(String title, int stanzas, boolean IsItGood)
    {
        this.title = title;
        this.stanzas = stanzas;
        this.IsItGood = IsItGood;
    } // end alternative constructer
    
    public String toString()
    {
        String output = new String();
        output = "Title of Song is: " + title + "\n" +
                 "Number of stanzas are: " + stanzas + "\n" +
                 "Is the Song Good? " + IsItGood;
        return output;
    } // end to string
} // end class