import javax.swing.JOptionPane;
public class MyPasswordCreator
{
    public static void main(String [] args)
    {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        int compare = 0;
        String lastNameLowerCase = lastName.toLowerCase();
        String passwordLowerCase = password.toLowerCase();
        while(compare >=0)
        {
            compare = passwordLowerCase.indexOf(lastNameLowerCase);
            if(compare >= 0)
            {
                passwordLowerCase = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
            }
            else
            {
                System.out.print("You are logged in!");
            }
        }
    }
}