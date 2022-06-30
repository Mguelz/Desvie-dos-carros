import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ambulancia extends Actor
{
    public void act()
    {
        movimentação();
        aoTocarBorda();
        tocarNoCarro();
    }
    
    public void movimentação() {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(10));
    }
    
    public void aoTocarBorda() {
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
    }
    
    public void tocarNoCarro() {
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce bateu na ambulancia", 292, 300);
        }
    }
}
