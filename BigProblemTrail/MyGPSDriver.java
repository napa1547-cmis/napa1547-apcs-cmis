import java.util.ArrayList;
public class MyGPSDriver
{
    public static void main (String args[])
    {
        MyGPSSoftware trail = new MyGPSSoftware();
        System.out.println("\nTrail A");
        System.out.println(trail);
        System.out.println("length " + trail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.MyTrail.size()-1));
        System.out.println("level " + trail.Level(0, trail.MyTrail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));
        trail.addMarker(new MyMarker(13,100) );
        System.out.println("\nTrail B");
        System.out.println(trail);
        System.out.println("length " + trail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.MyTrail.size()-1));
        System.out.println("level " + trail.Level(0, trail.MyTrail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));
        ArrayList<MyMarker> randomMarkers = new ArrayList<MyMarker>();
        randomMarkers.add(new MyMarker(0,10));
        randomMarkers.add(new MyMarker(1,10));
        randomMarkers.add(new MyMarker(2,10));
        randomMarkers.add(new MyMarker(3,10));
        randomMarkers.add(new MyMarker(4,10));
        randomMarkers.add(new MyMarker(5,10));
        randomMarkers.add(new MyMarker(6,10));
        randomMarkers.add(new MyMarker(7,10));
        randomMarkers.add(new MyMarker(8,10));
        MyGPSSoftware PlainTrail = new MyGPSSoftware(randomMarkers);
        System.out.println("\nPlainTrail");
        System.out.println(PlainTrail);
        System.out.println("length " + PlainTrail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.MyTrail.size()-1));
        System.out.println("level " + trail.Level(0, trail.MyTrail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));
        ArrayList<MyMarker> newMarkers = new ArrayList<MyMarker>();
        newMarkers.add(new MyMarker(0,100));
        newMarkers.add(new MyMarker(1,200));
        newMarkers.add(new MyMarker(2,300));
        newMarkers.add(new MyMarker(3,400));
        newMarkers.add(new MyMarker(4,500));
        newMarkers.add(new MyMarker(5,600));
        newMarkers.add(new MyMarker(6,700));
        newMarkers.add(new MyMarker(7,800));
        newMarkers.add(new MyMarker(8,900));
        MyGPSSoftware MountainTrail = new MyGPSSoftware(newMarkers);
        System.out.println("\nMountainTrail");
        System.out.println(MountainTrail);
        System.out.println("length " + MountainTrail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.MyTrail.size()-1));
        System.out.println("level " + trail.Level(0, trail.MyTrail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));
    }
}