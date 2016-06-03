import greenfoot.*;
import java.awt.Color;

public class Score extends Actor
{
    int score = 0;
    int speed=0;
    public void act()   
    {    
        int score = ((Pig) getWorld().getObjects(Pig.class).get(0)).getScore();
        setImage(new GreenfootImage("Score: " + score +" ", 21, Color.white, Color.black));
    }
    
    
}