public class Carddrive
{
    public static void main ( String[] argv )
    {
        MyCard Myhand[] = new MyCard[3];
        String cardnum[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String suits[] = {"clubs", "diamonds", "hearts", "spades"};
        for ( int i = 0; i < 3; i++ )
        {
            Myhand[i] = new MyCard(cardnum[(int)(Math.random()*13)],suits[(int)(Math.random()*4)]);
            System.out.println(Myhand[i] );
       
        }
    }
}