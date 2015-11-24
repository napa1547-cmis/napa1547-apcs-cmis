public class ClassSongDriver
{
    public static void main (String[] args)
    {
        MySong MyOtherSong = new MySong();


        System.out.println(MyOtherSong);
        MyOtherSong.setyearReleased(2019);
        System.out.println(MyOtherSong);
        System.out.println("The song length is:" + MyOtherSong.convertToMinSec());
    }// end main
}// end class