import javax.swing.JOptionPane;

public class MyPassword
{
    public static void main (String[] args)
    {
        int symbolreq = 0;
        String password = new String (JOptionPane.showInputDialog("please enter a password with a length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.)"));
        for ( int i = 0; i < password.length(); i++ )
        {
            if (password.substring(i).equals("+")|| password.substring(i).equals("-")|| password.substring(i).equals("*")||password.substring(i).equals("/")||password.substring(i).equals("@"))
            {
                symbolreq =+ 1;
            }
            if (password.length() < 6 || symbolreq <=0)
            {
                System.out.println("Your password does not meet the requirements, please re-run the program and meet the reqs");
            }
            else
            {
                System.out.println("Thank you! your password has been set.");
            }
        }
    }
}