public class Fundamentals7
{
    public static void main ( String[] args )
    {
        int[] array = new int[10];
        int neg = 0;
        int pos = 0;
        for (int i = 0; i < array.length; i++ )
        {
            int j = 0;
            j = ((int)(100 * Math.random()));
            if ( j % 2 == 0 )
            {
                array[i] = ((int)(100 * (-1) * Math.random()));
                neg++;
            } // end if
            if (j % 2 == 1 )
            {
                array[i] = ((int)(100 * Math.random()));
                pos++;
            } // end if 
        } // end for loop
        int i = 0;
        while ( i < array.length )
        {
            System.out.println(array[i]);
            i++;
        }// end while
        System.out.println("The number of positive integers is: " + pos + " The number of negative integers is: " + neg );
    } // end main 
} // end class
            
        