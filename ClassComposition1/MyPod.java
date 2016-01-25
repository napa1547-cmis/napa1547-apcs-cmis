public class MyPod
{
    private String color;
    private double memory;
    private String[] songLibrary;
    private String song1;
    private String song2;
    private String song3;
    public MyPod()
    {
        color = new String ("blue");
        memory = 3.3;
        songLibrary = new String[3];
    } // end zero arg constructor
    
    public MyPod(String color, double memory, String song1, String song2, String song3)
    {
        this.color = color;
        this.memory = memory;
        this.songLibrary = new String[3]; 
        this.songLibrary[0] = song1;
        this.songLibrary[1] = song2;
        this.songLibrary[2] = song3;
    } // end multiple arg constructor
    
    public String toString()
    {
        String output = new String();
        System.out.println("Now printing using for-each loop:");
        for (String song : songLibrary)
        {
            output += song;
        } // end for each loop
        output = "The Pod color is: " + color + " with a memory capacity of: " + memory + "GB" + " and contains 3 songs, called: " 
        + songLibrary[0] + "" + songLibrary[1] + ""  + songLibrary[2];
        return output;
    } // end toString() method
} // end class
        