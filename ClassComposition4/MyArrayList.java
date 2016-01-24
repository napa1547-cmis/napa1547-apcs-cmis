import java.util.ArrayList;
public class MyArrayList
{
    public static void main (String[] args)
    {
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("My Dad: Sumetha");
        myFamily.add("My Mom: Nuchnard");
        myFamily.add("MyBiggestBrother: Namo");
        myFamily.add("MyBigBrother: Napon");
        myFamily.add("Meeee: Napa");
        
        System.out.println(" There are " + myFamily.size() + "people in my family");
        System.out.println("They are:" + "\n");
        for(int index = 0; index< myFamily.size(); index++)
        {
            System.out.println(myFamily.get(index));
        } // end for 
        System.out.println("Now printing with for-each loop...:" + "\n");
        for(String name: myFamily)
        {
            System.out.println(name);
        } // end for-each loop
    } // end method
}

