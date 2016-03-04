import java.util.ArrayList;
public class StudentDriver
{
    public static void main(String[] args)
    {
        UnderGrad underGrad1 = new UnderGrad("Tin", "Computer Science", 10);
        UnderGrad underGrad2 = new UnderGrad("Pawat", "Mathematics", 5);
        Graduate graduate1 = new Graduate("Sara", "Biology", 8);
        Graduate graduate2 = new Graduate("Nam", "Web Design", 1);
        PostGraduate postGrad1 = new PostGraduate("Tadpole", "Engineering", 3);
        PostGraduate postGrad2 = new PostGraduate("Woody", "Business", 9);
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(postGrad1);
        allStudents.add(postGrad2);
        allStudents.add(graduate1);
        allStudents.add(graduate2);
        allStudents.add(underGrad1);
        allStudents.add(underGrad2);
        Student[][] studentBody = new Student[3][2];
        int i = 0;
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                studentBody[row][col] = allStudents.get(i);
                i++;
            }
        }
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                System.out.print(studentBody[row][col] + "\t\t" );
            }
            System.out.println();
        }
    }
}