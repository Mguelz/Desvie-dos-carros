import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * English Version
 * You aim to dodge the cars that are on the street
 * if you hit any car or person you will have lost the game
 * 
 * Versão em Português
 * Você tem como objetivo desviar dos carros que esta pela rua
 * caso acerte algum carro ou pessoa você terá perdido o jogo
 * 
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(585, 600, 1); 
        addObject(new Car(), Greenfoot.getRandomNumber(555), 550);
        addObject(new Enemy(), 59, Greenfoot.getRandomNumber(51)); // 50
        addObject(new Enemy(), 108, Greenfoot.getRandomNumber(201)); //y 200
        addObject(new Enemy(), 175, Greenfoot.getRandomNumber(221)); // 120
        addObject(new Enemy(), 227, Greenfoot.getRandomNumber(321)); // 320
        addObject(new Enemy(), 349, Greenfoot.getRandomNumber(131)); // 35
        addObject(new Enemy(), 400, Greenfoot.getRandomNumber(140)); //139
        addObject(new Enemy(), 467, Greenfoot.getRandomNumber(221)); // 220
        addObject(new Enemy(), 515, Greenfoot.getRandomNumber(118)); // 117
        addObject(new Ambulancia(), 295, Greenfoot.getRandomNumber(311)); // 201
        addObject(new Person(), 15, 301);
        addObject(new Person(), 15, 36);
        addObject(new Person(), 572, 202);
        addObject(new Person(), 572, 544);
    }
}
