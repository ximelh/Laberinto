import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mover extends Actor
//Esta clase permite que el actor principal del laberinto, en este caso "Chococat", pueda moverse e interactuar con los demás actores sin problema.
{
    /**
     * Act - do whatever the mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
    }
    public void deslizar()
    //Este método permite que el personaje se mueva sin cambiar de dirección o rotar.
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
    //Este método permite que el personaje se mueva, sin emargo, la imagen rota con cada movimiento
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
    //Este método tiene como función identificar si el actor principal se encuentra en contacto con las paredes del laberinto o no. De esta manera en otro
    //método(deslizar), se puede evitar que el personaje camine sobre las paredes.
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
    //Este método permite al actor principal interactuar con 
    {
        Actor Pez;
        Pez = getOneObjectAtOffset(0,0, Pez.class);
        if (Pez != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Pez);
            Greenfoot.playSound("Miau.wav");
            MyWorld MyWorld = (MyWorld)world;
            puntos puntos = MyWorld.getPuntos();
            puntos.agregarpuntospez();
        }
        Actor leche;
        leche = getOneObjectAtOffset(0,0, leche.class);
        if (leche != null)
        {
            World world;
            world = getWorld();
            world.removeObject(leche);
            Greenfoot.playSound("Miau.wav");
            MyWorld MyWorld = (MyWorld)world;
            puntos puntos = MyWorld.getPuntos();
            puntos.agregarpuntoslec();
        }
        }
    public void Ganar()
    {
        if(isTouching(Macaroon.class))
        {
            World myWorld = getWorld();
            Ganaste ganaste = new Ganaste();
            myWorld.addObject(ganaste, 325, 350);
            myWorld.removeObject(this);   
        }
        }
    }
    


