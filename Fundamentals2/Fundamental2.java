import javax.swing.JOptionPane;

public class Fundamental2
    {
        public static void main( String[] args )
            {
                double a = 0;
                double b = 0;
                
                String input = JOptionPane.showInputDialog( "Give me the value for a" );
                
                double numa = Double.parseDouble( input );
                
                String inpoo = JOptionPane.showInputDialog( " Give me the value for b" );
                
                double numb = Double.parseDouble( inpoo );
                
                if( numa > numb ) // boolean statemnet
                    {
                        System.out.println( "The value of A is " +numa  +" and the value of B is " +numb +" So A is greater than B" );
                    } // end if 
                if(numb > numa) // boolean statement
                    {
                        System.out.println( "The value of B is " +numb +" and the value of A is" +numa +" So B is greater than A" );
                    } // end if 
                else 
                    
                    {
                        System.out.println( "The value of A is equal to the value of B" );
                        
                   } // end method main
} // end class 
}                 
                
                
      