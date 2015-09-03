import javax.swing.JOptionPane;

public class Fundamental3
    {
        public static void main ( String[] args )
        {
            
            String input = JOptionPane.showInputDialog( "Give me a number!" );
            
            double num = Double.parseDouble( input );
            
            if( num % 2 == 0 ) // boolean statement
                {
                    System.out.println( "Your value is an even number" );
                } // end if 
            else
                {
                    System.out.println( "Your value is an odd number" );
                } // end method main
            } // end class
        }
            
            
            
            