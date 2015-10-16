public class MyCar
{
    private String carname;
    private String carbrand;
    private String color; 
    private double price;
    
    public MyCar()
    {
        carname = new String ("Porsche");
        carbrand = new String ("Volkswagon");
        color = new String ("white");
        price = 3.99;
    }// end zero argument constructer MySong
    
    public MyCar(String carname, String carbrand, String color, double price)
    {
        this.carname = carname;
        this.carbrand = carbrand;
        this.color = color;
        this.price = price;
    } // end alternative three-arg constructer
    
    public String toString()
    {
        String output = new String();
        output = "The car's name is " + carname + "\t" + "From the company: " + carbrand + "\n" +
                 "Color : " + color + "\n" + "with a price of:" +"\n" + price + "million dollars";
        return output;
    } // end to string
} // end class