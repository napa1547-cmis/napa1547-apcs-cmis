import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Interactives implements Fall
{
    int speed = 3;
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall(speed );
    }    
    
    public void fall(int speed)
    { 
        setLocation(getX(),getY()+speed);
        Actor mobil = getOneIntersectingObject(Pig.class);
        world = getWorld();
        if (isAtEdge()) 
        {
            getWorld().addObject(new Fire(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));
            world.removeObject(this);
        }
    }
    public void increaseSpeed(int num)
    {
        speed+= num;
    }
}
