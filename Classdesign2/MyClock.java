public class MyClock
{
    private int hours;
    private int minutes;
    private int seconds; 
    
    public MyClock()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }// end zero argument constructer MySong
    
    public MyClock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    } // end alternative three-arg constructer
    
    public String toString()
    {
        String output = new String();
        output = "The time is: " + hours + ":" + minutes + ":" + seconds;
        return output;
    } // end to string
} // end class