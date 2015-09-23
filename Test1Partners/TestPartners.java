import javax.swing.JOptionPane;
public class TestPartners
{
    public static void main (String[] args)
    {
        String input = JOptionPane.showInputDialog("what is your number");
        int num1 = Integer.parseInt(input);
        double[] myarray = new double[num1];
        
        for (int index = 0; index < myarray.length; index ++ )
        {
            myarray[index] = (double)(Math.random()*51);
            System.out.println(" ["+index+"] " + myarray[index]);
        } // finished for loop
        int index2 = num1;
        while ( index2 > myarray.length )
        {
            System.out.println("["+index2+"]" + myarray[index2]);
            index2--;
        } // end while
        int mod = 0;
        int one = 1;
        
        
        for ( int index3 = 0; index3 < myarray.length; index3 ++)
        {
            mod = (int)(myarray[index3])%2;
            if (mod == 1)
            {
                System.out.println(myarray[index3] + "["+index3+"]");
            }// end if
            else 
            {
                System.out.println(myarray[index3] + "["+index3+"]");
            }// end else
            
    }
}
} //
    