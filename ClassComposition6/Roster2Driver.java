public class Roster2Driver
{
    public static void main ( String args[] )
    {
        apComputerScience apComputerScience = new apComputerScience();
        apComputerScience.addStudent(new MyStudent("Anne", "Apples", 10, 1.0, 1.0, 1.0, 2.0, 3.0));
        apComputerScience.addStudent(new MyStudent("Bobby", "Breadloaf", 11, 2.0, 2.0, 2.0, 3.0, 4.0));
        apComputerScience.addStudent(new MyStudent("Charlie", "Crumpet", 12, 3.0, 3.0, 3.0, 4.0, 4.0));
        
        System.out.println("Period1: \t" + apComputerScience);
        apComputerScience.dropStudent("Breadloaf");
        System.out.println("\t" + apComputerScience);
    }
}// end class