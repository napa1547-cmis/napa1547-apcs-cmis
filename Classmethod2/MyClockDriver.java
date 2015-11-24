import javax.swing.JOptionPane;
public class MyClockDriver
{
    public static void main (String[] args)
    {
        int hours = Integer.parseInt(JOptionPane.showInputDialog("whats the hour?"));
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("whats the minute?"));
        int seconds = Integer.parseInt(JOptionPane.showInputDialog("whats the second?"));
        
        MyClock clock1 = new MyClock();
        clock1.setTime(13, 23, 33);
        clock1.convertToSec();
        System.out.println(clock1);
        
        clock1.setTime(3,33,33);
        clock1.convertToSec();
        System.out.println(clock1);
        
        clock1.convertDaylightSaving(1);
        clock1.convertToSec();
        System.out.println(clock1);
       
    }// end main
}// end class