import java.util.ArrayList;
public class Swapper
{
    public static void main (String args[])
    {
        int bigRowProduct = 0;
        int bigColProduct = 0;
        int bigRow = 0;
        int bigCol =0; 
        int [][] newGrid; 
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};

        for (int rows = 0; rows < grid.length;rows ++ )
        {
            for (int cols = 0; cols <grid[rows].length; cols++)
            {
                int rowProduct = 0;
                if ( grid[rows][cols] == 0)
                {
                    grid[rows][cols] = 1;
                } // end if
                grid[rows][cols] = rows * cols;
                grid[rows][0] = rows;
                grid[0][cols] = cols;
                rowProduct = rows * cols ;
                if (rowProduct > bigRowProduct)
                {
                    bigRowProduct = rowProduct;
                    bigRow = grid[rows][cols];
                } 

            }
        }
        System.out.println("The product of the biggest row = "+ bigRowProduct + "and is in row" + bigRow);

        for (int cols = 0; cols < grid.length;cols ++ )
        {
            for (int rows = 0; rows <grid[cols].length; rows++)
            {
                int colProduct = 0;
                if ( grid[rows][cols] == 0)
                {
                    grid[rows][cols] = 1;
                } // end if
                colProduct = rows * cols ;
                if (colProduct > bigColProduct)
                {
                    bigColProduct = colProduct;
                    bigCol = grid[rows][cols];
                } 

            }
        }
        System.out.println("The product of the biggest col = "+ bigColProduct + "and is in col" + bigCol);

        newGrid[rows][cols] = grid[bigRow][bigCol];
        int Number = gridIntersection;
        for (int rows = 0; rows < grid.length; rows ++)
        {
            for(int cols =0; cols <grid[rows].length; cols++)
            {
                if (grid[rows][cols] == 0)
                {
                    grid[rows][cols] = Number;
                } // 
                if (grid[rows][cols] == newGrid[rows][cols])
                {
                    grid[rows][cols] = 0;
                } // 
            } // 
        }
        for (int rows = 0; rows < grid.length; rows ++)
        {
            for(int cols =0; cols <grid[rows].length; cols++)
            {
                System.out.print( grid[rows][cols] + "\t");
            } // 
            System.out.print("/n");
        }
    }
} // end