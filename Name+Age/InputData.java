import javax.swing.JOptionPane;

public class InputData
    {
    public static void main( String[] args )
        {
        
        String input = JOptionPane.showInputDialog( "What is your name?" );
        System.out.println( "Hello," +input );
        String poo = JOptionPane.showInputDialog( "What is your age?" );
        System.out.println( "You are,"  +poo +"years old");
    } // end method main
    
} // end class Input Data