import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(8));
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce bateu no carro", 292, 300);
        }
    }
}
