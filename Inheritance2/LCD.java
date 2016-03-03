public class LCD extends Television
{
    private String model;
    private double price;
    public LCD()
    {
        this.model = "LCD Silver";
        this.price = 799.99;
    }

    public LCD(String model, double price)
    {
        this.model = model;
        this.price = price;
    }

    public String toString()
    {
        String output = new String("");
        output = "The Model of this tv is: " + this.model +"\tPrice: " + "$" + this.price;
        return output;
    }
}//