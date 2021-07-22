import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mover extends Actor
{
    /**
     * Act - do whatever the mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void deslizar()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")) 
        {
            setLocation(x + 4, y);
            if(paredes())
            {
                setLocation(x - 4, y);
            }
        }
        if(Greenfoot.isKeyDown("left")) 
        {
            setLocation(x - 4, y);
            if(paredes())
            {
                setLocation(x + 4, y);
            }
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            setLocation(x, y - 4);
            if(paredes())
            {
                setLocation(x, y + 4);
            }
        }
        if(Greenfoot.isKeyDown("down")) 
        {
            setLocation(x, y + 4);
            if(paredes())
            {
                setLocation(x, y - 4);
            }
        }
    }
    public void mover()
    {
        
      if(Greenfoot.isKeyDown("right")) 
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left")) 
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down")) 
        {
            setRotation(90);
            move(4);
        }  
    }
    public boolean paredes()
    {
        if (isTouching(Bloque.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void eat()
    {
        Actor Naranja;
        Naranja = getOneObjectAtOffset(0,0, Naranja.class);
        if (Naranja != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Naranja);
        }
        Actor Arandano;
        Arandano = getOneObjectAtOffset(0,0, Arándano.class);
        if (Arandano != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Arandano);
        }
        Actor Cereza;
        Cereza = getOneObjectAtOffset(0,0, Cereza.class);
        if (Cereza != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Cereza);
        }
        }
}


