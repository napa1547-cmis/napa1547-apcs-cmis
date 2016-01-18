public class MyPodDriver
{
    public static void main(String[] args)
    {
        String[] songLibrary = {"Atlantis", "High Hopes", "I Found"};
        
        System.out.println("Now printing using for-each loop:");
        for (String song : songLibrary)
        {
            System.out.println(song);
        } // end for each loop
        MyPod carpod = new MyPod("pink", 3.7, songLibrary[0], songLibrary[1], songLibrary[2] );
        System.out.println(carpod);
        
    } // end method main
} // end class