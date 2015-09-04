import javax.swing.JOptionPane;
public class Test1
{
    public static void main (String[] args)
    {
        String input = JOptionPane.showInputDialog("Give me an integer");
        int inpoo = Integer.parseInt(input);
        int[] array = new int [inpoo];
        for (int i = 0; i < array.length; i++ )
        {
            array[i] = ((int)(Math.random()*50));
        } // end for
        for ( int i = 0; i < array.length; i++ )
        {
            System.out.println(array[i] + "[" +i+ "]");
        } // end for
        for ( int i = 0; i < array.length; i-- )
        {
            System.out.println("[" +i+ "]");
            int j = array[i];
            if ( j % 2 == 0 )
                {
                    int numnum = j * 1;
                    int[] arrayt = {numnum};
                    for (int t = 0; t < arrayt.length; t++)
                    {
                        System.out.print("E");
                    } //end for
                    System.out.print(array[i]);
                } // end if
            if (j % 2 == 1 )
                {
                    int numbum = j * 1;
                    int[] arrayf = {numbum};
                    for (int t = 0; t < arrayf.length; t++)
                    {
                        System.out.print("O");
                    } //end for
                    System.out.print(array[i]);
                } // end if
        } // end for
    } // end main
} // end class