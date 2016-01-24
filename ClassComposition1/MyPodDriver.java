public class MyPodDriver
{
    public static void main(String[] args)
    {
        String[] songLibrary = {"Atlantis", "High Hopes", "I Found"};
        
        MyPod carpod = new MyPod("pink", 3.7, songLibrary[0], songLibrary[1], songLibrary[2] );
        System.out.println(carpod);
        
    } // end method main
} // end class