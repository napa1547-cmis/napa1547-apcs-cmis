import javax.swing.JOptionPane;
public class Fundamentals9
{
    public static void main ( String[] args )
    {
        String username = JOptionPane.showInputDialog( "Please give me the username" );
        String password = JOptionPane.showInputDialog( "Please enter the password" );
        double num = Double.parseDouble( password );
        if ( username.equals( "Napa" ) && num == 1547 )
            {
                System.out.println( "Login successful!" );
            } // end if 
        else 
            {
                System.out.println( "Login unsuccessful, please try again." );
            } // end else
        } // end main
    } // end class 
          