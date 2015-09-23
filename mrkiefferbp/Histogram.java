import javax.swing.JOptionPane;
public class Histogram
{
    public static void main ( String[] argv )
    {
        int input = 50;//Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        
        int[] numbers = new int[input];
        int[] counts = new int[100];
        int thisNumber;
        int thisCount;
        String hashes;
        int min = 99;
        int max = 0;
        int sum = 0;
        int mode = 0;
        
        for ( int i = 0; i < input; i++ )
        {
            thisNumber = (int) (Math.random() * 100);
            numbers[i] = thisNumber;
            counts[thisNumber]++;
            
            if ( thisNumber < min )
            {
                min = thisNumber;
            }
            
            if ( thisNumber > max )
            {
                max = thisNumber;
            }
            
            sum += thisNumber;
            
        }
        
        for ( thisNumber = 0; thisNumber < counts.length; thisNumber++ )
        {
            thisCount = counts[thisNumber];
            if ( thisCount > counts[mode] )
            {
                mode = thisNumber;
            }
        }
        
        for ( int i = 0; i < counts.length; i++ ) 
        {
            hashes = i+": ";
            thisCount = counts[i];
            
            while ( thisCount > 0 ) 
            {
                hashes += "#";
                thisCount--;
            }
            System.out.println(hashes);
        }
        
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
        System.out.println("SUM: " + sum);   
        System.out.println("AVG: " + (double) sum / (double) input);
        System.out.println("MODE: " + mode);
    }
}