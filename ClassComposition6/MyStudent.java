public class MyStudent
{
    public String fname;
    public String lname;
    private int grade; 
    private double gpa;
    private double[] classGrades;
    private double gradeEnglish;
    private double gradeMath;
    private double gradeScience;
    private double gradeFineArts;
    private double gradeSocialScience;
    
    public MyStudent()
    {
        fname = new String ("Napa");
        lname = new String ("Vananupong");
        grade = 12;
        gpa = 1.00;
        classGrades = new double[5];

    }// end zero argument constructer Mystudents
    
    public MyStudent(String fname, String lname, int grade, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience)
    
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        this.gpa = gpa;
        this.classGrades = new double[5]; // creates empty array we can then begin to fill
        this.classGrades[0] = gradeEnglish;
        this.classGrades[1] = gradeMath;
        this.classGrades[2] = gradeScience;
        this.classGrades[3] = gradeFineArts;
        this.classGrades[4] = gradeSocialScience;
        
    } // end alternative three-arg constructer
    
    public double calcGPA()
    {
        double total = 0.0;
        
        for(int index = 0; index<classGrades.length; index++ )
        {
            total += classGrades[index];
        } // end for loop
        
        total /= classGrades.length;
        //total = total / classGrades.length;
        return total;
    } // end method
    
    public void setGPA( double GradeEnglish, double GradeMath, double GradeScience, double GradeFineArts, double GradeSocialScience)
    {
        this.fname = fname;
        this.lname = lname;
        this.classGrades[0] = GradeEnglish;
        this.classGrades[1] = GradeMath;
        this.classGrades[2] = GradeScience;
        this.classGrades[3] = GradeFineArts;
        this.classGrades[4] = GradeSocialScience;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The student is: " + fname + "\t" + lname + "\n" +
                 "Who is in grade : " + grade + "\n" + "with a gpa of:" +"\n" + calcGPA();
        return output;
    } // end to string
} // end class