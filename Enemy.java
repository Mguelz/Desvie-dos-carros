import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    public void act()
    {
        movimentação();
        voltarAoInicioDaTela();
        baterNoCarro();
    }
    
    public void movimentação() {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(8));
    }
    
    public void voltarAoInicioDaTela() {
        if (isAtEdge()) {
            setLocation(getX(), 0);
        }
    }
    
    public void baterNoCarro() {
        if (isTouching(Car.class)) {
            removeTouching(Car.class);
            Greenfoot.stop();
            getWorld().showText("Voce bateu no carro", 292, 300);
        }
    }
}
