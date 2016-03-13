public class MyPhone extends MyDevice
{
    private String BrandName;
    public MyPhone()
    {
        super();
        this.BrandName = "Apple";
    }

    public MyPhone(int memory, String color, String BrandName)
    {
        super(memory, color);
        this.BrandName = BrandName;
    }

    public void setBrandName(String company)
    {
        this.BrandName = company;
    }

    public String getBrandName()
    {
        return BrandName;
    }

    public void connectToBluetooth()
    {
        System.out.println("connecting to bluetooth on your phone");
    } // end my bluetooth method
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() +
        "\nThe phone's brand is: " + BrandName;
        return output;
    }
}