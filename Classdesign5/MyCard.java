public class MyCard
{
    private String cardnum;
    private String suits;
    
    public MyCard()
    {
        cardnum = "A";
        suits = "spades";
    }// end zero argument constructer MySong
    
    public MyCard(String cardnum, String suits)
    {
        this.cardnum = cardnum;
        this.suits = suits;
    } // end alternative three-arg constructer
    
    public String toString()
    {
        String output = new String();
        output = "The card is " + cardnum +" of " + suits;
        return output;
    } // end to string
} // end class