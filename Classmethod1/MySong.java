import javax.swing.JOptionPane;
public class MySong
{
    private String title;
    private int stanzas;
    private boolean IsItGood; 
    private int yearReleased;
    private int length;
    private String converted;
    String user = JOptionPane.showInputDialog("whats the username?");
    int pass = Integer.parseInt(JOptionPane.showInputDialog("whats the pass?"));
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
    
    public void setReleaseYear(int year)
    {
        if (user.equals("napa") && pass == (13))
        {
            this.yearReleased = year;
        }
    }
    
    public String toString()
    {
        String output = new String();
        output = "Title of Song is: " + title + "\n" +
                 "Number of stanzas are: " + stanzas + "\n" +
                 "Is the Song Good? " + IsItGood + "\n" + 
                 "Year released: " + yearReleased;
        return output;
    } // end to string
} // end class