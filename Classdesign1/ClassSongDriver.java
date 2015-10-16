public class ClassSongDriver
{
    public static void main (String[] args)
    {
        MySong MyOtherSong = new MySong();
        MySong MyOwnSong = new MySong("Napa", 3, true);
        
        System.out.println(MyOwnSong);
        System.out.println(MyOtherSong);
    }// end main
}// end class