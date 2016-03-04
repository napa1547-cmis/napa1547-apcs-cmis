public class PostGraduate extends Student
{
    private String firstName;
    private String major;
    private int units;
    public PostGraduate(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition(int units)
    {
        return units * 750; // in dollars
    }

    public String toString()
    {
        return super.toString();
    }
}
