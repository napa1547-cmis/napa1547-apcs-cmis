import java.util.ArrayList;
public class MyTelevisionDriver
{
    public static void main(String[] args)
    {
        LED LEDtv = new LED();
        DLP DLPtv = new DLP("DLP Diamond", 1999.99);
        Plasma Plasmatv = new Plasma();
        LCD LCDtv = new LCD("LCD Emerald", 888.88);
        ArrayList<Television> TVsInStore = new ArrayList<Television>();
        TVsInStore.add(LEDtv);
        TVsInStore.add(DLPtv);
        TVsInStore.add(Plasmatv);
        TVsInStore.add(LCDtv);
        System.out.print("TVs in the store:\n");
        for(Television TV: TVsInStore)
        {
            System.out.println(TV);
        }
    }
}