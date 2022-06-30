import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulancia extends Actor
{
    /**
     * Act - do whatever the Ambulancia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(10));
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce bateu na ambulancia", 292, 300);
        }
    }
}
