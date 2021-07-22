import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mochi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mochi extends mover
{
    /**
     * Act - do whatever the Mochi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        deslizar();
        eat();
        }        
}
