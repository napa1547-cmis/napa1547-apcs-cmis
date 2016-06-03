import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Interactives extends Actor
{
    World world;

    public void act()
    {
       
    }
    

    public void eat()
    {
        Actor Apple = getOneIntersectingObject(Pig.class);    

        if(Apple != null)
        {
            getWorld().removeObject(this);
            getWorld().addObject(new Apple(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));
        }

    }

    public void LoseLife()
    {
        Actor Fire = getOneIntersectingObject(Pig.class);    

        if(Fire != null)
        {
            getWorld().removeObject(this);
            getWorld().addObject(new Fire(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));
        }

    }
}
