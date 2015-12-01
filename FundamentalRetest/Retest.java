import javax.swing.JOptionPane;
public class Retest
{
    public static void main ( String[] argv )
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        int[] these = new int [n];
        int thisNumber;
        int lengthofthose = n/2;
        int[] those = new int [lengthofthose];
        String symbol = ""; 
        String symbol2 = "";
        String output;
        for ( int i = 0; i < these.length; i++ )
        {
            these[i] = (int)(Math.random() * 10) - n;
        }
        for ( int i = 0; i < these.length; i++ )
        {
            System.out.println(i+": "+these[i]);
        }
        for ( int i = 0; i < these.length; i ++ )
        {
            if ((these[i] > these[(n-1) - i]))
            {
                those[i] = these[i];
            }
            else if ((these[i] < these[(n-1) - i]))
            {
                those[i] = these[(n-1) - i];
            }
            else 
            {
                those[i] = -1;
            }
            System.out.print(i+": ");
            thisNumber = (int) those[i];
            output = "";
            if ( thisNumber >= 0 )
            {
                symbol = "<";
                symbol2 = ">";
            }
            else
            {
                symbol = "ERROR";
            }
            while ( thisNumber >= -1 )
            {
                output += symbol;
                thisNumber--;
            }
            while ( thisNumber >= these.length )
            {
                output += symbol2;
                thisNumber--;
            }
            System.out.println(output+those[i]);
        }
    }
}