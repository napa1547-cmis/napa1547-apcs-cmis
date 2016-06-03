import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    World world;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 0;
    private int direction = 1;
    int score = 1;
    private boolean jumping;
    private int jumpStrength = 15;
    MyWorld w = (MyWorld)getWorld();
    Fire f = w.getFire();
    private int eatenfire;
    private int livesleft;
    private GreenfootImage run1r = new GreenfootImage("PigRight1.png");
    private GreenfootImage run2r = new GreenfootImage("PigRight2.png");
    private GreenfootImage run3r = new GreenfootImage("PigRight3.png");
    private GreenfootImage run4r = new GreenfootImage("PigRight4.png");
    private GreenfootImage run1rs = new GreenfootImage("PigRightStill.png");
    private GreenfootImage run1l = new GreenfootImage("PigLeft1.png");
    private GreenfootImage run2l = new GreenfootImage("PigLeft2.png");
    private GreenfootImage run3l = new GreenfootImage("PigLeft3.png");
    private GreenfootImage run4l = new GreenfootImage("PigLeft4.png");
    private GreenfootImage run1ls = new GreenfootImage("PigLeftStill.png");
    private int frame = 0;
    private int animationCounter = 0;

    public void act() 
    {
        moving();  
        eat();
        eatfire1();
        Increase();

    }    

    public void moving()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            speed = -4;
            moveLeft();
        }

        if(Greenfoot.isKeyDown("Right"))
        {
            speed = 4;
            moveRight();
        }
    }

    public void moveLeft()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 5 == 0)
        {
            animateLeft();
        }
        else
        {
            setImage(run1ls);
        }
    }

    public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 5 == 0)
        {
            animateRight();
        }
        else
        {
            setImage(run1rs);
        }
    }

    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(run1ls);
        }
        else if(frame == 4)
        {
            setImage(run1l);
        }
        else if(frame == 7)
        {
            setImage(run2l);
        }
        else if(frame == 10)
        {
            setImage(run3l);            
        }
        else if(frame == 13)
        {
            setImage(run4l);
            frame = 0;
            return;
        }
        frame++;
    }

    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(run1rs);
        }
        else if(frame == 4)
        {
            setImage(run1r);
        }
        else if(frame == 7)
        {
            setImage(run2r);
        }
        else if(frame == 10)
        {
            setImage(run3r);            
        }
        else if(frame == 13)
        {
            setImage(run4r);
            frame = 0;
            return;
        }
        frame++;
    }

    public void eat()
    {
        Actor Apple;
        Apple = getOneObjectAtOffset(0,0,Apple.class);

        if( Apple != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Apple); 
            score = score + 1;

            getWorld().addObject(new Apple(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));

        }  

    }

    public void eatfire1()
    {
        Actor eatingFire;
        eatingFire = getOneObjectAtOffset(0,0,Fire.class);

        if( eatingFire != null)
        {
            World world;
            world = getWorld();
            world.removeObject(eatingFire);     
            getWorld().removeObjects(getWorld().getObjects(Heart3.class));
            getWorld().addObject(new Fire(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                Greenfoot.getRandomNumber(getWorld().getHeight()-490));
            eatenfire += 1;
            System.out.println(eatenfire);
            System.out.println(eatingFire);
            if (eatenfire == 2 && eatingFire != null)
            {
                int counter=eatenfire;
                getWorld().removeObjects(getWorld().getObjects(Heart2.class));
                for ( int j = 0; j <= 2; j++)
                {
                    Die death = new Die();
                    World myWorld = getWorld();
                    myWorld.addObject(death, myWorld.getWidth()/2, myWorld.getHeight()/2);
                    System.out.println(j);
                }
                while (counter > 0) 
                {
                    Warning warn = new Warning();
                    World myWorld = getWorld();
                    myWorld.addObject(warn, myWorld.getWidth()/4, myWorld.getHeight()/4);
                    System.out.println();
                    counter--;
                }
            }
            if (eatenfire == 3 && eatingFire != null)
            {
                getWorld().removeObjects(getWorld().getObjects(Heart1.class));
                livesleft = 0;
                GameOver gameover= new GameOver();
                World myWorld = getWorld();
                myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
                Greenfoot.stop();
            }
        }  

    }

    public void Increase()
    {

        if(score % 10 ==0)
        {
            MyWorld.getFire().increaseSpeed(10);
            Actor mobil = getOneIntersectingObject(Pig.class);
            world = getWorld();
            if (isAtEdge()) 
            {
                getWorld().addObject(new Fire(), Greenfoot.getRandomNumber(getWorld().getWidth()),
                    Greenfoot.getRandomNumber(getWorld().getHeight()-490));
            }
        }

    }

    public void Die()
    {
        for ( int j = 0; j == 3; j++)
        {
            Die death = new Die();
            World myWorld = getWorld();
            myWorld.addObject(death, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    }

    public int getScore()
    {    
        return score;
    }  

}
