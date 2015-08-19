import javax.swing.JOptionPane;

public class InputData
    {
        public static void main( String[] args )
            {
            double sum = 0;
            double sub = 0;
            double div = 0;
            double mult = 0;
            double moddiv = 0;
            
         
            String input = JOptionPane.showInputDialog( "Please give me a number" );
            
            System.out.println( input );
            
            double num = Double.parseDouble( input );
            
            String inpoo = JOptionPane.showInputDialog( "Please give me another number" );
            
            double nom = Double.parseDouble( inpoo );
            
            sum = nom + num;
            sub = num - nom;
            div = num / nom;
            mult = num * nom;
            moddiv = num % nom;
            
            
            System.out.println( input + "+" +inpoo + "=" +sum );
            System.out.println( input + "-" +inpoo + "=" +sub );
            System.out.println( input + "*" +inpoo + "=" +mult );
            System.out.println( input + "/" +inpoo + "=" +div );
            System.out.println( input + "%" +inpoo + "=" +moddiv );
            
        } //end method main
    } //end class InputData
    