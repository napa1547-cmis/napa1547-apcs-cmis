public class DLP extends Television
{
    private String model;
    private double price;
    public DLP()
    {
        this.model = "DLP Rose Gold";
        this.price = 999.99;
    }

    public DLP(String model, double price)
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