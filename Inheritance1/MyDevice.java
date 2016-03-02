public class MyDevice
{
    private int memory;
    private String color;
    public MyDevice()
    {
        this.memory = 13;
        this.color = new String("Blue");
    }

    public MyDevice(int memory, String color)
    {
        this.memory = memory;
        this.color = color;
    }

    public String toString()
    {
        String output = new String("");
        output = "Memory in GB: " + memory +
        "\nColor is: " + color;
        return output;
    }
}