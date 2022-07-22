import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Person extends Actor
{
    public void act()
    {
        mover();
        tocarNoCarro();
        voltarAoTopoDaTela();
    }
    
    public void mover(){
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(4));    
    }
    
    public void tocarNoCarro() {
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce Atropelou uma pessoa", 292, 300);
        }
    }
    
    public void voltarAoTopoDaTela() {
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
    }
}
