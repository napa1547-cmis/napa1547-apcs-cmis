import java.util.ArrayList;
public class MyGPSSoftware
{
    public ArrayList<MyMarker> MyTrail= new ArrayList<MyMarker>();
    public MyGPSSoftware()
    {
        MyTrail.add(new MyMarker(0,100));
        MyTrail.add(new MyMarker(1,150));
        MyTrail.add(new MyMarker(2,105));
        MyTrail.add(new MyMarker(3,120));
        MyTrail.add(new MyMarker(4,90));
        MyTrail.add(new MyMarker(5,80));
        MyTrail.add(new MyMarker(6,50));
        MyTrail.add(new MyMarker(7,75));
        MyTrail.add(new MyMarker(8,75));
        MyTrail.add(new MyMarker(9,70));
        MyTrail.add(new MyMarker(10,80));
        MyTrail.add(new MyMarker(11,90));
        MyTrail.add(new MyMarker(12,100));
    }

    public int getLength()
    {
        int length=0;
        for (int i=0; i<MyTrail.size(); i++)
        {
            length+= MyTrail.get(i).getB();
        }
        return length;
    }

    public boolean Level(int start, int finish)
    {
        boolean level=true;
        for( int i = start; i < finish; i++)
        {
            if( i > start && Math.abs(MyTrail.get(i).getB() - MyTrail.get(i).getB()) > 10)
            {
                level = false;
            }
        }
        if( MyTrail.get(start) == MyTrail.get(finish) && level == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Difficulty(int start, int finish)
    {
        int Uphill = 0;
        for(int i = 0; i < MyTrail.size(); i++)
        {
            if(i > 0 && MyTrail.get(i).getB() - MyTrail.get(i-1).getB() > 0)
            {
                Uphill += MyTrail.get(i).getB();
            }
        }
        if(Uphill > 100 && !Level(start, finish))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public MyGPSSoftware(ArrayList<MyMarker> Trail)
    {
        this.MyTrail=Trail;
    }

    public void addMarker ( MyMarker newMarker )
    {
        MyTrail.add(newMarker);
    }

    public String toString()
    {
        String output = "";
        for (MyMarker marker : MyTrail)
        {
            output+= marker;
        }
        return output;
    }//toString
}