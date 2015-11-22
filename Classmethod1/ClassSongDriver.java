public class ClassSongDriver
{
    public static void main (String[] args)
    {
        MySong MyOtherSong = new MySong();
        MySong MyOwnSong = new MySong("Napa", 3, true);
        
        System.out.println(MyOwnSong);
        System.out.println(MyOtherSong);
        
        System.out.println("\n\n");
        System.out.println( MyOtherSong.getyearReleased() );
        MyOtherSong.setyearReleased(2019);
        System.out.println( MyOtherSong.getyearReleased() );
    }// end main
}// end class