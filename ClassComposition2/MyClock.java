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
    }// end zero argument constructor MySong

    public MyClock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    } // end 3 arg constructor 

    public int totalSeconds()
    {
        converted = ( this.hours*3600 ) + ( this.minutes*60 ) + (this.seconds);
        return converted;
    } // end converting to secs

    public String toString()
    {
        String output = new String();
        output = "The time is: " + hours + ":" + minutes + ":" + seconds + "\n" +
        "In seconds, that would be: " + converted + "and the index of the clock with the most seconds is : ";
        return output;
    } // end to string
} // end class