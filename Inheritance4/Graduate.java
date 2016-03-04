public class Graduate extends Student
{
    private String firstName;
    private String major;
    private int units;
    public Graduate(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition(int units)
    {
        return units * 500; // in dollars
    }

    public String toString()
    {
        return super.toString();
    }
}
