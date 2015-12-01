import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main(String[] args)
    {

        MyStudent student = new MyStudent("Joe","Senior", 12, 4.0,4.0,4.0,4.0,4.0);
        System.out.println(student);

        student.setGPA(1.0,2.0,3.0,4.0,4.0);
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver