import java.util.ArrayList;
public class MyPod2
{
    private String color;
    private double memory;
    private ArrayList<String> songLibrary = new ArrayList<String>();
    public MyPod2()
    {
        color = new String ("blue");
        memory = 3.3;
        songLibrary.add("Atlantis");
        songLibrary.add("High Hopes");
        songLibrary.add("I Found");
    } // end zero arg constructor

    public MyPod2(String color, double memory, ArrayList<String> songLibrary)
    {
        this.color = color;
        this.memory = memory;
        this.songLibrary = songLibrary;
    } // end multiple arg constructor

    public String toString()
    {
        String output = new String();
        output = "The Pod color is: " + color + " with a memory capacity of: " + memory + "GB" + " and contains " + songLibrary.size() +  " songs, called: "; 
        for (String song : songLibrary)
        {
            System.out.println(song);
        } // end for each loop
        return output;
    } // end toString() method
} // end class
