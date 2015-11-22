public class MySong
{
    private String title;
    private int stanzas;
    private boolean IsItGood; 
    private int yearReleased;
    private int length;
    public MySong()
    {
        title = new String ("CmisSong");
        stanzas = 2;
        IsItGood = true;
        yearReleased = 2015;
        length = 343;
    }// end constructer MySong
    
    public int getyearReleased()
    {
        return yearReleased;
    } // end get constructer
    
    public void setyearReleased(int year)
    {
        this.yearReleased = year;
    } // end method set year released 
    
    public String convertToMinSec()
    {
        converted = ( this.length / 60 ) + "." + ( this.length % 60 );
        return converted;
    } // end convert method
    
    public MySong(String title, int stanzas, boolean IsItGood)
    {
        this.title = title;
        this.stanzas = stanzas;
        this.IsItGood = IsItGood;
        this.yearReleased = yearReleased;
        this.length = length;
    } // end alternative constructer
    
    public String toString()
    {
        String output = new String();
        output = "Title of Song is: " + title + "\n" +
                 "Number of stanzas are: " + stanzas + "\n" +
                 "Is the Song Good? " + IsItGood + "\n" +
                 "Song Length: " + converted + "\n" + 
                 "Year released: " + yearReleased;
        return output;
    } // end to string
} // end class