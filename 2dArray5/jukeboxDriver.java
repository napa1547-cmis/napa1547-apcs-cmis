public class jukeboxDriver
{
   public static void main (String[] args)
   {
       Jukebox favSongs = new Jukebox();
       System.out.println(favSongs);
       System.out.println("Here is a random song picked: " + favSongs.randomSong());
       System.out.println("Here are songs with the rating of 4: " + favSongs.playSongofRating(4));
    }
}