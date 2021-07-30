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
    int lec = 20;
    int pez = 10;
    /**
     * Act - do whatever the puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Puntaje :" + puntos, 24, Color.PINK, Color.BLACK));
    }
    //Este código genera el contador de puntos del juego.
    public void agregarpuntospez()
    {
        puntos = puntos + pez;
    }
    //Este código permite agregar los puntos designados al actor "pez".
    public void agregarpuntoslec()
    {
        puntos = puntos + lec;
    }
    //Permite agregar los puntos designados al actor "leche".
}
