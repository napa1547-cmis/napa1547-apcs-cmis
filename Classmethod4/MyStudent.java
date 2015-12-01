public class MyStudent
{
    private String fname;
    private String lname;
    private int grade;
    private double gpa;
    private double[] classGrades;
    private double gradeEnglish;
    private double gradeMath;
    private double gradeScience;
    private double gradeFineArts;
    private double gradeSocialScience;
    private double total;
    private String totalgrade;

    public MyStudent()
    {
        fname = new String ("Napa");
        lname = new String ("Vananupong");
        grade = 12;
        gpa = 1.00;
        classGrades = new double[5];

    }// end zero argument constructer Mystudents

    public MyStudent(String fname, String lname, int grade, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience, String totalgrade)

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
        this.totalgrade = totalgrade;
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

    
    public void getGrade()
    {
        if( total >= 4.0 )
        {
            totalgrade="A";
        }
        else if( total < 4.0 && total > 3.0 )
        {
            totalgrade="B";
        }
        else if( total < 3.0 && total > 2.0  )
        {
            totalgrade="C";
        }
        else if( total < 2.0 && total > 1.0 )
        {
            totalgrade="D";
        }
        else if( total <= 1.0 )
        {
            totalgrade= "F";
        }
    }
    
    public void setGPA( double GradeEnglish, double GradeMath, double GradeScience, double GradeFineArts, double GradeSocialScience, String totalgrade )
    {
        this.fname = fname;
        this.lname = lname;
        this.gradeEnglish=gradeEnglish;
        this.gradeMath=gradeMath;
        this.gradeScience=gradeScience;
        this.gradeFineArts=gradeFineArts;
        this.gradeSocialScience=gradeSocialScience;
        this.totalgrade = totalgrade;
    }

    public String toString()
    {
        String output = new String();
        output = "The student's Name is: " + fname + "\t" + lname + "\n" +
        "Who is in grade : " + grade + "\n" + "with an average gpa of:" +"\n" + calcGPA() + "\n" + fname + "'s grade is: " + totalgrade
        + "\n" + classGrades[0] + "" + classGrades[1] + "" + classGrades[2] + "" + classGrades[3] + "" + classGrades[4];
        return output;
    } // end to string
} // end class