public class Cubiverse
{
    private int w;
    private int h;
    private int d; 
    private double x;
    private double y;
    private double z;
    private String name;
    public Cubiverse()
    {
        w = 1;
        h = 1;
        d = 1;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        name = new String ("Default Cubiverse");
    }// end zero argument constructer MySong
    
    public Cubiverse(int w, int h, int d, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        this.name = name;
    } // end this thing
    
    public Cubiverse(double x, double y, double z, String name)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name + w*Math.random() + "\n" +
                 "w:" + w + "\n" +
                 "h:" + h + "\n" +
                 "d:" + d + "\n" + 
                 "volume:" + w*h*d + "\n" +
                 "x:" + x + "\n" +
                 "y:" + y + "\n" +
                 "z:" + z + "\n" +
                 "distance from left:" + 0.5*w + "\n" +
                 "distance from bottom:" + 0.5*h + "\n" +
                 "distance from back:" + 0.5*d;
        return output;
    } // end to string
} // end class