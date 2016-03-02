public class MyTV extends MyDevice
{
    private int ScreenSize;
    public MyTV()
    {
        super();
        this.ScreenSize = 27;
    }

    public MyTV(int memory, String color, int ScreenSize)
    {
        super(memory, color);
        this.ScreenSize = ScreenSize;
    }

    public void setScreenSize(int inches)
    {
        this.ScreenSize = inches;
    }

    public int getScreenSize()
    {
        return ScreenSize;
    }

    public String toString()
    {
        String output = new String("");
        output = super.toString() +
        "\nThe TV's screen size in inches is : " + ScreenSize;
        return output;
    }
}