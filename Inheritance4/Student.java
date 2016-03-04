public abstract class Student
{
    private String firstName;
    private String major;
    private int units;
    public Student(String firstName, String major, int units)
    {
        this.firstName = firstName;
        this.major = major;
        this.units = units;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    } // end method setSuitColor
    public String getFirstName()
    {
        return firstName;
    } // end method getSuitColor
    public void setMajor(String major)
    {
        this.major = major;
    } // end method setSuitColor
    public String getMajor()
    {
        return major;
    } // end method getSuitColor
    public void setUnits(int units)
    {
        this.units = units;
    } // end method setSuitColor
    public int getUnits()
    {
        return units;
    } // end method getSuitColor
    public abstract int calculateTuition(int units);

    public String toString()
    {
        String output = new String("");
        output = "First name: " + firstName +
        " Major: " + major +
        " Units: " + units;
        return output;
    }
}