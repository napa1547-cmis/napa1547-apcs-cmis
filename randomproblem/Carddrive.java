public class Carddrive
{
    public static void main ( String[] argv )
    {
        SimpleCard Myhand[] = new SimpleCard[52];
        String cardnum[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String suits[] = {"clubs", "diamonds", "hearts", "spades"};
        for ( int i = 0; i < 52; i++ )
        {
            Myhand[i] = new SimpleCard(cardnum[i+1],suits[i+1]);
            System.out.println(Myhand[i] );
        }
    }
}