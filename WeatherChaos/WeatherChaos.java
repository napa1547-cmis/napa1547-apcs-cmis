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
        int chilly = new int[16];
        int comfortable = new int[31];
        int hot = new int[40];
        int min = -100;
        int max = 99;
        
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
            tswing = (Math.abs()*(randomtemps[i] - randomtemps[i+1]));
            output += tswing;
        }
        for ( int i = 0; i < randomtemps.length; i++ )
        {
            outputd = "Description"+ "\n" + "";
            thistemp = randomtemp[i];
            if (thistemp[i] < 0)
            {
            word = freezing;
        }
            if (thistemp[i] < chilly[])
            {
                word = chilly;
        }
            if (thistemp[i] < comfortable[])
            {
                word = comfortable;
        }
            if (thistemp[i] < hot[])
            {
                word = hot;
        }
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
            System.out.println(outputday + output + outputd);
            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
        }
    } // end
            