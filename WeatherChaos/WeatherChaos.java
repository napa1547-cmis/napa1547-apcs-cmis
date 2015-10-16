import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String[] args )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type an integer between 1-31: "));
        int[] randomtemps = new int[input];
        int[] days = new int[input];
        int randomtemp;
        int thisDay = 0;
        String output;
        String outputd;
        String outputday;
        String word;
        String tempd;
        int min = -100;
        int max = 99;
        int sum = 0;
    if( input < 32 && input > 0 )
    { 
       for ( int i = 0; i < randomtemps.length; i++ )
        {
            randomtemp = (int)(Math.random() * 200) - 100;
            randomtemps[i] = randomtemp;
            days[randomtemp]++;
            outputday = "Day" + "\n" + days;
        }
       for ( int i = 0; i < randomtemps.length; i++ )
        {
            output = "Temperature Swing"+ "\n" + "";
            tswing = (Math.abs()*(randomtemps[i-1] - randomtemps[i]));
            output += tswing;
        }
       for ( int i = 0; i < randomtemps.length; i++ )
        {
            outputd = "Description: "+ "";
            thistemp = randomtemp[i];
            if(thistemp[i]<=0)
                    {
                        outputd += "\t"+ "Freezing"  + "\n"; 
                    }
            if(thistemp[i]>0 && thisNum <=15 )
                    {
                        outputd += "\t"+ "Chilly"  + "\n"; 
                    }
            if(thistemp[i]>=16 && thisNum <=30 )
                    {
                        outputd += "\t"+ "Comfortable"  + "\n"; 
                    }
            if(thistemp[i]>=31 && thisNum <45 )
                    {
                        outputd += "\t"+ "Hot"  + "\n"; 
                    }
            if(thistemp[i]>=45)
                    {
                        outpudt += "\t"+ "ARDGDGD!"  + "\n"; 
                    }
                }
       if (thistemp[i] <= min)
            {
                min = thistemp;
        }
       if (thistemp[i] >= max)
            {
                max = thistemp;
        }
        System.out.println(outputd);
    }
    else
    {
            if (thistemp[i] <= min)
            {
                min = thistemp;
        }
            if (thistemp[i] >= max)
            {
                max = thistemp;
        }
        
        outputd += word;
    }
}
            System.out.println(outputday + output + outputd);
            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
            System.out.println("AVG: " + "I would use (double) sum / (double) input but IM OUT OF TIME NOOOO i didnt get to make my sum T_T");
            System.out.println("SWING: " + tswing);
            System.out.println("SWINGDAYS: " + days "and day" + days);
        }