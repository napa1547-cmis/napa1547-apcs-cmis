public class Roster
{
    private MyStudent[] students = new MyStudent[3];
    
    public Roster()
    {
        students[0] = new MyStudent ("Anne", "Apples", 10, 1.0, 1.0, 1.0, 2.0, 3.0);
        students[1] = new MyStudent ("Bobby", "Breadloaf", 11, 2.0, 2.0, 2.0, 3.0, 4.0);
        students[2] = new MyStudent ("Charlie", "Crumpet", 12, 3.0, 3.0, 3.0, 4.0, 4.0);
        
    } // end method
    
    public String findStudentWithMaxGPA()
    {
        MyStudent MaxGPA = new MyStudent();
        for (int index = 0; index < students.length; index++)
        {
            if (students[index].calcGPA() > MaxGPA.calcGPA())
            {
                MaxGPA = students[index];
            } // end if
        } // end forloop
        return MaxGPA.fname; 
    } // end maxgpa method
    
    public String toString()
    {
        String output = new String();
        for (MyStudent names: students)
        {
            System.out.println(names);
            output = "The student with the highest GPA is: " + findStudentWithMaxGPA();
        } // end for loooop
        return output; 
    } // end to string
} // end class
