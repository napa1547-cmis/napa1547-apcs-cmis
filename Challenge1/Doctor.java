
public class Doctor extends PersonApp
{
    private String name;
    private int yob;
    private int mob;
    private int dob;
    private int salary;
    
    public Doctor(String name, int yob, int mob, int dob, int salary)
    {
        this.name = name;
        this.yob = yob;
        this.mob = mob;
        this.dob = dob;
        this.salary = salary;
    }

    public String toString()
    {
        return String.format("Name: %s\nDOB: %s", name, yob, mob, dob, salary);
    }

}