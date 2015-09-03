public class Fundamentals8
{
    public static void main ( String[] args )
    {
        String[] artists = { "Coldplay" , "Arctic Monkeys" , "The Script" };
        for ( int i = 0; i < artists.length; i++ )
        {
            System.out.println( "Your favorite artists are: " + artists[i] );
        } // end for
        
        int thingy = (int)(Math.random() * 3);
        artists[thingy] = "Michael Jackson";
        for ( int t = 0; t < artists.length; t++ )
            {
                System.out.println( artists[t] );
            } // end for
        
        for ( int t = 0; t < artists.length; t++ )
        {
            if ( artists[t].equals("Michael Jackson"))
                {
                    System.out.println( "We found michael[" +t+ "]");
                }
            else
                {
                    System.out.println( "No Michael in artists[" +t + "]" );
                }
            
        
        }// end for
} // end main
} // end class
            