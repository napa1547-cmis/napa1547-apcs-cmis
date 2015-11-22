public class MyClock
{
    private int hours;
    private int minutes;
    private int seconds; 
    private int Time; 
    private int Springingforward;
    private int Fallingback;
    private int converted;
    
    public MyClock()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
        Time = hours+minutes+seconds;
    }// end zero argument constructer MySong
    
    public int getTime()
    {
        return Time;
    } // end get constructor 
    
    public void setTime(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    } // end method set year released 
    
    public int convertDaylightSaving(int hours)
    {
        this.Time = this.Time + hours;
        return Time;
    } // end convert method
    
    public int convertToSec()
    {
        converted = ( this.hours*60 ) + ( this.minutes*60 ) + (this.seconds);
        return converted;
    } // end converting to secs
    
    public MyClock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    } // end alternative three-arg constructer
    
    public String toString()
    {
        String output = new String();
        output = "The time is: " + hours + ":" + minutes + ":" + seconds + "\n" +
                 "In seconds, that would be: " + converted;
        return output;
    } // end to string
} // end class