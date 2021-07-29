import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puntos extends Actor
{
    int puntos = 0;
    int nar = 20;
    int ara = 10;
    /**
     * Act - do whatever the puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Puntaje :" + puntos, 24, Color.PINK, Color.BLACK));
    }
    public void agregarpuntosnar()
    {
        puntos = puntos + nar;
    }
    public void agregarpuntosara()
    {
        puntos = puntos + ara;
    }
}
