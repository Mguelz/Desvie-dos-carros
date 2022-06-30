import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Car extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        ativarTeclas();
        irAteMetadeDaTela();
    }
    
    public void ativarTeclas() {
        if (Greenfoot.isKeyDown("d")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 5);
        }
    }
    
    public void irAteMetadeDaTela() {
        if (getY() == 100){
            setLocation(getX(), getY() + 6);
        }
        if (getY() == 330) {
            setLocation(getX(), getY() + 5);
        }
    }
}
