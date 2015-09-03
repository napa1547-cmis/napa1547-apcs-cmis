import javax.swing.JOptionPane;

public class Fundamental1
    {
        public static void main( String[] args )
        {
            String favf = JOptionPane.showInputDialog( "Please give me your favorite food" );
            
            System.out.println( "your favorite food is:" +favf );
            
            String favc = JOptionPane.showInputDialog( "Please give me your favorite color" );
            
            System.out.println( "your favorite color is:" +favc );
            
            String favm = JOptionPane.showInputDialog( "Please give me your favorite movie" );
            
            System.out.println( "your favorite movie is:"  +favm );
            
            String favmusic = JOptionPane.showInputDialog( "Please give me your favorite music group" );
            
            System.out.println( "your favorite band/artist is:" +favmusic );
            
        } // end method main
    } // end class InputData