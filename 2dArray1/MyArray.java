public class MyArray
{
    public static void main (String args[])
    {
        int[][] MyArray = new int[3][4];
        for( int rows = 0; rows < MyArray.length; rows++)
        {
            for(int cols = 0; cols < MyArray[rows].length; cols++)
            {
                MyArray[rows][cols] = (int)(Math.random()*9);
            }
        } // end for
        for( int rows = 0; rows < MyArray.length; rows++)
        {
            for(int cols = 0; cols < MyArray[rows].length; cols++)
            {
                System.out.print(MyArray[rows][cols] + " " );
            }
            System.out.println();
        } // end for
        for( int rows = 0; rows < MyArray.length; rows++)
        {
            for(int cols = 0; cols < MyArray[rows].length; cols++)
            {
                if(MyArray[rows][cols] == 5)
                {
                    System.out.println("rows: " + rows + "coloumns: " + cols);
                } // end if
            }
        } // end for
    }   // end main
}// end class