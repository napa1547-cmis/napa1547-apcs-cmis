public class MyArray2
{
    public static void main (String args[])
    {
        int[][] MyArray = new int[3][5];
        int sum = 0;
        for(int rows = 0; rows < MyArray.length; rows++)
        {
            for(int cols = 0; cols < MyArray[rows].length; cols++)
            {
                MyArray[rows][cols] = (int)((Math.random()*14)+1);
            } // end cols for
        }
        for (int[] rows : MyArray)
        {
            for(int number : rows)
            {
                System.out.print(number + " " );
            }
            System.out.println();
        } // end for-each loop
        for(int  rows = 0; rows < MyArray.length; rows++)
        {
            for(int cols = 0; cols < MyArray[rows].length; cols++)
            {
                sum += MyArray[rows][cols];
            } // end cols for
            System.out.println("sum: " + sum);
        }  
        for (int rows = 0; rows < MyArray.length;rows ++ )
        {
            int row = 0;
            for (int cols = 0; cols <MyArray[rows].length; cols++)
            {
                row += MyArray[rows][cols];
            }
            System.out.println("row = "+ row);
        }
        for (int cols=0; cols<MyArray[0].length;cols++ )
        {
            int col= 0;
            for (int rows=0; rows<MyArray.length; rows++)
            {
                col+= MyArray[rows][cols];
            }
            System.out.println("col = " + col);
        }
    } // end main
} // end class