public class MyStudent
{
    private String fname;
    private String lname;
    private int grade; 
    private double gpa;
    
    public MyStudent()
    {
        fname = new String ("Napa");
        lname = new String ("Vananupong");
        grade = 12;
        gpa = 1.00;
    }// end zero argument constructer MySong
    
    public MyStudent(String fname, String lname, int grade, double gpa)
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        this.gpa = gpa;
    } // end alternative three-arg constructer
    
    public String toString()
    {
        String output = new String();
        output = "The student is: " + fname + "\t" + lname + "\n" +
                 "Who is in grade : " + grade + "\n" + "with a gpa of:" +"\n" + gpa;
        return output;
    } // end to string
} // end class