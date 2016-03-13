public class Pod extends MyDevice
{

    public Pod()
    {
        super();
    }

    public Pod(int memory, String color)
    {
        super(memory, color);
    }

     public void connectToBluetooth()
    {
       System.out.println("Connecting to bluetooth, pod");
    }
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() ;

        return output;
    }
}