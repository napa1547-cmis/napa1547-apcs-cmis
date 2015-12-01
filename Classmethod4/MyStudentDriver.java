import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main(String[] args)
    {

        MyStudent student = new MyStudent("Joe","Senior",12,4.0,4.0,4.0,4.0,4.0,"A");
        MyStudent student1 = new MyStudent("Bob","Junior", 11,3.0,3.0,1.0,4.0,4.0,"B");
        System.out.println(student);
        System.out.println(student1);

        student.setGPA(4.0,4.0,4.0,4.0,4.0,"A");
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver