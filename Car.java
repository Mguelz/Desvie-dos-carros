import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
        if (getY() == 100){
            setLocation(getX(), getY() + 6);
        }
        //fazer quando o carro chegar no final da tela 
        //ele nao consiga ultrapassar
        if (getY() == 330) {
            setLocation(getX(), getY() + 5);
        }
    }
}
