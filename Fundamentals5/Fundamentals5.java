import javax.swing.JOptionPane;

public class Fundamentals5
{
    public static void main ( String[] args )
    {
        String[] movies = { "Harry Potter" , "Walk to Remember" , "Up" };
        String[] songs = { "Talk" , "Canon" , "Intro" };
            for ( int i = 0; i < movies.length ; i++ )
            {
                System.out.println ("\n");
                System.out.println ( "your favorite movies are: " + movies[i] );
                System.out.println ( "\n" + "\n" );
            }// end for
            int n = 0;
            System.out.print ( "your favorite songs are: " );
            while ( n < songs.length - 1)
            {
                
                System.out.print ( songs[n] + "," );
                n ++;
            } // end while
            System.out.println(songs[songs.length-1]);
        } // end method main
    } // end class fundamentals5
            
        