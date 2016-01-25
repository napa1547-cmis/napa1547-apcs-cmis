public class ClockStore
{
    private MyClock clocksInStock[];
    private int clock1;
    private int clock2;
    private int clock3;
    private int bigClock;

    public ClockStore()
    {
        clocksInStock = new MyClock[3];
        clocksInStock[0] = new MyClock (7,13,27);
        clocksInStock[1] = new MyClock (8,14,28);
        clocksInStock[2] = new MyClock (9,15,29);
    }// end zero argument constructer MySong

    public int mostSeconds()
    {
        for (int i = 0; i< clocksInStock.length; i++)
        {
            if (clocksInStock[i].totalSeconds() > bigClock)
            {
                bigClock = i;
            }
        } // end for loop
        return bigClock;
    }// end totalsecs method

    public String toString()
    {
        String output = new String();
        for (MyClock clock : clocksInStock)
        {
            output = "and the index of the clock with the most seconds is:" + bigClock;
        } // end for each loop
        return output; 
    } // end to string
} // end class