public class UnderGrad extends Student
{
    private String firstName;
    private String major;
    private int units;
    public UnderGrad(String firstName, String major, int units)
    {
        super(firstName, major, units);
    } // end single arg constructor
    
    public int calculateTuition(int units)
    {
        return units * 250; 
    } // end my calctuition method
    
    public String toString()
    {
        return super.toString();
        
    } // end to string
} // end class undergrad