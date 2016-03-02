public class MyComputer extends MyDevice
{
    private int weight;
    public MyComputer()
    {
        super();
        this.weight = 12;
    }

    public MyComputer(int memory, String color, int weight)
    {
        super(memory, color);
        this.weight = weight;
    }

    public void setweight(int number)
    {
        this.weight = number;
    }

    public int getweight()
    {
        return weight;
    }

    public String toString()
    {
        String output = new String("");
        output = super.toString() +
        "\nThe computer weights (in grams): " + weight;
        return output;
    }
}