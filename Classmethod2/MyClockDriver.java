import javax.swing.JOptionPane;
public class MyClockDriver
{
    public static void main (String[] args)
    {
        int hours = Integer.parseInt(JOptionPane.showInputDialog("whats the hour?"));
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("whats the minute?"));
        int seconds = Integer.parseInt(JOptionPane.showInputDialog("whats the second?"));
        
        Myclock.Time = new Time();
        Myclock.convertToSec();
        System.out.println(clock);
        
        Myclock.setTime(3,33,33);
        Myclock.convertToSec();
        System.out.println(clock);
        
        Myclock.convertDayLightSavings(1);
        Myclock.coonvertToSec();
        System.out.println(clock);
       
    }// end main
}// end class