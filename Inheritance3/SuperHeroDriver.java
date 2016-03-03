import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        AsteroidMan MrAsteroid = new AsteroidMan();
        FriedEggMan MrFriedEgg = new FriedEggMan();
        Chanipoo Nam = new Chanipoo();
        
        MrAsteroid.setSuitColor("Silver");
        MrFriedEgg.setSuitColor("Yellow");
        Nam.setSuitColor("Scarlet");
        
        MrAsteroid.setCape(true);
        MrFriedEgg.setCape(true);
        Nam.setCape(false);
        
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(MrAsteroid);
        heroes.add(MrFriedEgg);
        heroes.add(Nam);
        
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int i = 0;
        System.out.println("\nThis is the original set of ArrayList heroes...");
        for(SuperHero Hero: heroes)
        {
            System.out.println(Hero);
        }
        
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < heroes.size())
                {
                    if(heroes.get(i).isCaped() == true)
                    {
                        capedHeroes[row][col] = heroes.get(i);
                        heroes.remove(heroes.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }

        System.out.println("\nPrinting contents of capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(capedHeroes[row][col] != null)
                {
                    System.out.println(capedHeroes[row][col].getClass() + "\t");
                    i++;
                }
            }
            System.out.println();
        }

        System.out.println("\n The remaining set of ArrayList heroes...");
        for(SuperHero Hero: heroes)
        {
            System.out.println(Hero);
        }
    }
}