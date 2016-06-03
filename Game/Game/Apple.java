import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Interactives implements Fall
{
        int speed = 3;
    
    public void act() 
    {
     
      fall(speed);  
    }    
    public void fall( int speed)
    { 
        setLocation(getX(),getY()+3);
        Actor mobil = getOneIntersectingObject(Pig.class);
        world = getWorld();
        if (isAtEdge()) 
        {
            getWorld().addObject(new Apple(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));
            world.removeObject(this);
        }
    }
}
