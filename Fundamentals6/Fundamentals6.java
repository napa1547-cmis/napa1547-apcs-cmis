import javax.swing.JOptionPane;

public class Fundamentals6
{
    public static void main (String[] args )
    {
        int[] array = new int[50];
        for ( int i = 0; i < array.length; i++ )
        {
            array[i] = ((int)(100 * Math.random()));
        }// end for loop
        for ( int i = 0; i < array.length; i++ )
        {
            System.out.print (array[i] + " ");
        } // end for loop
    } // end system main
} // end class
        //when you want to set how many indexes are in an array you must use the command 'new'