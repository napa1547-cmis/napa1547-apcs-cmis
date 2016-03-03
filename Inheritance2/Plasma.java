public class Plasma extends Television
{
    private String model;
    private double price;
    public Plasma()
    {
        this.model = "Plasma Bronze";
        this.price = 699.99;
    } // end zero arg constructor
    public Plasma( String model, double price)
    {
        this.model = model;
        this.price = price;
    } // end two argument constructor
    public String toString()
    {
        String output = new String ("");
        output = "The Model of this TV is: " + this.model + "\tPrice:" + "$" + this.price;
        return output;
    } // end to string
} // end class plasma