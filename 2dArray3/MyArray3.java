import javax.swing.JOptionPane;

public class MyArray3
{
    public static void main (String[] args)
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        int[][] table = new int[r][c];

        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                table[row][col] = row * col;
                table[row][0] = row;
                table[0][col] = col;
            }
        }
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                System.out.print( table[row][col] + "\t");
            }
            System.out.print("\n");

        }
    }

}
