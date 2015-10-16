import javax.swing.JOptionPane;
public class MyClockDriver
{
    public static void main (String[] args)
    {
        int hours = Integer.parseInt(JOptionPane.showInputDialog("whats the hour?"));
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("whats the minute?"));
        int seconds = Integer.parseInt(JOptionPane.showInputDialog("whats the second?"));
        
        MyClock MyKitchenClock = new MyClock();
        MyClock MyBedroomClock = new MyClock( hours, minutes, seconds );
        
        System.out.println(MyKitchenClock);
        System.out.println(MyBedroomClock);
    }// end main
}// end class