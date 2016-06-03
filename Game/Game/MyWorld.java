import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Fire fire = new Fire();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig = new Pig();
        addObject(pig,201,444);
        pig.setLocation(196,441);
        pig.setLocation(194,434);
        Apple apple = new Apple();
        addObject(apple,278,37);
        Score score = new Score();
        addObject(score,339,26);
        addObject(fire,63,27);
        fire.setLocation(155,23);
        Heart1 heart = new Heart1();
        addObject(heart,32,32);
        heart.setLocation(27,28);
        Heart2 heart2 = new Heart2();
        addObject(heart2,75,35);
        heart2.setLocation(67,28);
        Heart3 heart3 = new Heart3();
        addObject(heart3,113,34);
        heart3.setLocation(110,27);
        heart2.setLocation(64,28);
        heart3.setLocation(101,28);
    }

    public static Fire getFire()
    {
        return fire;
    }
    
}
