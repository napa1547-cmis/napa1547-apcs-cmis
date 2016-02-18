public class MyMarker
{
    private int a;
    private int b;
    public MyMarker( int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public int getA()
    {
        return a ;
    }

    public int getB()
    {
        return b;
    }

    public String toString()
    {
        String result = String.format(
                "\nx: %d " +
                "b: %d",
                a, b);
        return result;
    }
}