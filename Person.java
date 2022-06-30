import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(4));
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce Atropelou uma pessoa", 292, 300);
        }
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
    }
}
