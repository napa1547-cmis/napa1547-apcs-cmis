import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main (String[] args)
    {
        String fname = JOptionPane.showInputDialog("whats your name?");
        String lname = JOptionPane.showInputDialog("whats your last name?");
        int grade = Integer.parseInt(JOptionPane.showInputDialog("what grade are you in?"));
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("what is your gpa?"));
        MyStudent senior001 = new MyStudent();
        MyStudent junior001 = new MyStudent( fname, lname, grade, gpa );
        
        System.out.println(senior001);
        System.out.println(junior001);
        JOptionPane.showMessageDialog( null, "" + junior001,
        "The Student", JOptionPane.INFORMATION_MESSAGE );
    }// end main
}// end class