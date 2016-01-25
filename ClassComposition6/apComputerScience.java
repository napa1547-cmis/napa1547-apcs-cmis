import java.util.ArrayList;
public class apComputerScience
{
    private String color;
    private double memory;
    private ArrayList<MyStudent> students = new ArrayList<MyStudent>();
    public apComputerScience()
    {

    } // end zero arg constructor

    public void addStudent (MyStudent newStudent)
    {
        students.add(newStudent); 
    } // end multiple arg constructor

    public void dropStudent (String lastName)
    {
        for(int index = 0; index < students.size(); index++)
        {
            if(students.get(index).lname.equals(lastName))
            {
                students.remove(students.get(index));
            } // end if 
        } // end for loop
    } // end drop method

    public String toString()
    {
        String output = new String();
        for (MyStudent names: students)
        {
            output += "These are the students in the class" + "\n" + names;
        } // end for loooop
        return output; 
    } // end to string
} // end class
