import javax.swing.JOptionPane;

public class InputData
    {
        public static void main( String[] args )
            {
            int sum = 0;
            int sub = 0;
            int div = 0;
            int mult = 0;
            int moddiv = 0;
            
         
            String input = JOptionPane.showInputDialog( "Please give me a number" );
            
            System.out.println( input );
            
            int num = Integer.parseInt( input );
            
            String inpoo = JOptionPane.showInputDialog( "Please give me another number" );
            
            int nom = Integer.parseInt( inpoo );
            
            sum = nom + num;
            sub = num - nom;
            div = num / nom;
            mult = num * nom;
            moddiv = num % nom;
            
            
            System.out.println( sum );
            System.out.println( sub );
            System.out.println( div );
            System.out.println( mult );
            System.out.println( moddiv );
            
        } //end method main
    } //end class InputData
    