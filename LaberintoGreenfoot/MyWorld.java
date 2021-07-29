import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    puntos puntos = new puntos();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 650, 1); 
        prepare();
    }

    public puntos getPuntos()
    {
        return puntos; 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(puntos, 250, 35);
        Bloque bloque = new Bloque();
        addObject(bloque,0*50,0*50);
        Bloque bloque2 = new Bloque();
        addObject(bloque2,2*50,0*50);
        bloque2.setLocation(2*50,0*50);
        Bloque bloque3 = new Bloque();
        addObject(bloque3,2*50,0*50);
        Bloque bloque4 = new Bloque();
        addObject(bloque4,1*50,0*50);
        Bloque bloque5 = new Bloque();
        addObject(bloque5,3*50,0*50);
        Bloque bloque6 = new Bloque();
        addObject(bloque6,4*50,0*50);
        Bloque bloque7 = new Bloque();
        addObject(bloque7,5*50,0*50);
        Bloque bloque8 = new Bloque();
        addObject(bloque8,6*50,0*50);
        Bloque bloque9 = new Bloque();
        addObject(bloque9,7*50,0*50);
        Bloque bloque10 = new Bloque();
        addObject(bloque10,8*50,0*50);
        Bloque bloque11 = new Bloque();
        addObject(bloque11,9*50,0*50);
        Bloque bloque12 = new Bloque();
        addObject(bloque12,10*50,0*50);
        Bloque bloque13 = new Bloque();
        addObject(bloque13,11*50,0*50);
        Bloque bloque14 = new Bloque();
        addObject(bloque14,12*50,0*50);
        Bloque bloque15 = new Bloque();
        addObject(bloque15,13*50,0*50);
        Bloque bloque16 = new Bloque();
        addObject(bloque16,0*50,1*50);
        Bloque bloque17 = new Bloque();
        addObject(bloque17,1*50,1*50);
        Bloque bloque18 = new Bloque();
        addObject(bloque18,2*50,1*50);
        Bloque bloque19 = new Bloque();
        addObject(bloque19,8*50,1*50);
        Bloque bloque20 = new Bloque();
        addObject(bloque20,9*50,1*50);
        Bloque bloque21 = new Bloque();
        addObject(bloque21,11*50,1*50);
        Bloque bloque22 = new Bloque();
        addObject(bloque22,12*50,1*50);
        Bloque bloque23 = new Bloque();
        addObject(bloque23,13*50,1*50);
        Bloque bloque24 = new Bloque();
        addObject(bloque24,4*50,2*50);
        Bloque bloque25 = new Bloque();
        addObject(bloque25,5*50,2*50);
        Bloque bloque26 = new Bloque();
        addObject(bloque26,6*50,2*50);
        Bloque bloque27 = new Bloque();
        addObject(bloque27,8*50,2*50);
        Bloque bloque28 = new Bloque();
        addObject(bloque28,11*50,2*50);
        Bloque bloque29 = new Bloque();
        addObject(bloque29,13*50,2*50);
        Bloque bloque30 = new Bloque();
        addObject(bloque30,0*50,3*50);
        Bloque bloque31 = new Bloque();
        addObject(bloque31,2*50,3*50);
        Bloque bloque32 = new Bloque();
        addObject(bloque32,3*50,3*50);
        Bloque bloque33 = new Bloque();
        addObject(bloque33,5*50,3*50);
        Bloque bloque34 = new Bloque();
        addObject(bloque34,8*50,3*50);
        Bloque bloque35 = new Bloque();
        addObject(bloque35,10*50,3*50);
        Bloque bloque36 = new Bloque();
        addObject(bloque36,11*50,3*50);
        Bloque bloque37 = new Bloque();
        addObject(bloque37,13*50,3*50);
        Bloque bloque38 = new Bloque();
        addObject(bloque38,0*50,4*50);
        Bloque bloque39 = new Bloque();
        addObject(bloque39,5*50,4*50);
        Bloque bloque40 = new Bloque();
        addObject(bloque40,7*50,4*50);
        Bloque bloque41 = new Bloque();
        addObject(bloque41,13*50,4*50);
        Bloque bloque42 = new Bloque();
        addObject(bloque42,0*50,5*50);
        Bloque bloque43 = new Bloque();
        addObject(bloque43,1*50,5*50);
        Bloque bloque44 = new Bloque();
        addObject(bloque44,3*50,5*50);
        Bloque bloque45 = new Bloque();
        addObject(bloque45,4*50,5*50);
        Bloque bloque46 = new Bloque();
        addObject(bloque46,7*50,5*50);
        Bloque bloque47 = new Bloque();
        addObject(bloque47,8*50,5*50);
        Bloque bloque48 = new Bloque();
        addObject(bloque48,9*50,5*50);
        Bloque bloque49 = new Bloque();
        addObject(bloque49,11*50,5*50);
        Bloque bloque50 = new Bloque();
        addObject(bloque50,12*50,5*50);
        Bloque bloque51 = new Bloque();
        addObject(bloque51,13*50,5*50);
        Bloque bloque52 = new Bloque();
        addObject(bloque52,0*50,6*50);
        Bloque bloque53 = new Bloque();
        addObject(bloque53,3*50,6*50);
        Bloque bloque54 = new Bloque();
        addObject(bloque54,4*50,6*50);
        Bloque bloque55 = new Bloque();
        addObject(bloque55,6*50,6*50);
        Bloque bloque56 = new Bloque();
        addObject(bloque56,13*50,6*50);
        Bloque bloque57 = new Bloque();
        addObject(bloque57,0*50,7*50);
        Bloque bloque58 = new Bloque();
        addObject(bloque58,2*50,7*50);
        Bloque bloque59 = new Bloque();
        addObject(bloque59,4*50,7*50);
        bloque59.setLocation(6*50,7*50);
        Bloque bloque60 = new Bloque();
        addObject(bloque60,6*50,7*50);
        bloque59.setLocation(6*50,7*50);
        Bloque bloque61 = new Bloque();
        addObject(bloque61,6*50,7*50);
        Bloque bloque62 = new Bloque();
        addObject(bloque62,4*50,7*50);
        Bloque bloque63 = new Bloque();
        addObject(bloque63,8*50,7*50);
        Bloque bloque64 = new Bloque();
        addObject(bloque64,9*50,7*50);
        Bloque bloque65 = new Bloque();
        addObject(bloque65,10*50,7*50);
        Bloque bloque66 = new Bloque();
        addObject(bloque66,11*50,7*50);
        Bloque bloque67 = new Bloque();
        addObject(bloque67,13*50,7*50);
        Bloque bloque68 = new Bloque();
        addObject(bloque68,0*50,8*50);
        Bloque bloque69 = new Bloque();
        addObject(bloque69,1*50,8*50);
        Bloque bloque70 = new Bloque();
        addObject(bloque70,6*50,8*50);
        Bloque bloque71 = new Bloque();
        addObject(bloque71,13*50,8*50);
        Bloque bloque72 = new Bloque();
        addObject(bloque72,0*50,9*50);
        Bloque bloque73 = new Bloque();
        addObject(bloque73,1*50,9*50);
        Bloque bloque74 = new Bloque();
        addObject(bloque74,3*50,9*50);
        Bloque bloque75 = new Bloque();
        addObject(bloque75,4*50,9*50);
        Bloque bloque76 = new Bloque();
        addObject(bloque76,5*50,9*50);
        Bloque bloque77 = new Bloque();
        addObject(bloque77,6*50,9*50);
        Bloque bloque78 = new Bloque();
        addObject(bloque78,7*50,9*50);
        Bloque bloque79 = new Bloque();
        addObject(bloque79,9*50,9*50);
        Bloque bloque80 = new Bloque();
        addObject(bloque80,11*50,9*50);
        Bloque bloque81 = new Bloque();
        addObject(bloque81,12*50,9*50);
        Bloque bloque82 = new Bloque();
        addObject(bloque82,13*50,9*50);
        Bloque bloque83 = new Bloque();
        addObject(bloque83,0*50,10*50);
        Bloque bloque84 = new Bloque();
        addObject(bloque84,1*50,10*50);
        Bloque bloque85 = new Bloque();
        addObject(bloque85,4*50,10*50);
        Bloque bloque86 = new Bloque();
        addObject(bloque86,10*50,10*50);
        Bloque bloque87 = new Bloque();
        addObject(bloque87,0*50,11*50);
        Bloque bloque88 = new Bloque();
        addObject(bloque88,2*50,11*50);
        Bloque bloque89 = new Bloque();
        addObject(bloque89,4*50,11*50);
        Bloque bloque90 = new Bloque();
        addObject(bloque90,6*50,11*50);
        Bloque bloque91 = new Bloque();
        addObject(bloque91,7*50,11*50);
        Bloque bloque92 = new Bloque();
        addObject(bloque92,9*50,11*50);
        Bloque bloque93 = new Bloque();
        addObject(bloque93,10*50,11*50);
        Bloque bloque94 = new Bloque();
        addObject(bloque94,12*50,11*50);
        Bloque bloque95 = new Bloque();
        addObject(bloque95,13*50,11*50);
        Bloque bloque96 = new Bloque();
        addObject(bloque96,0*50,12*50);
        Bloque bloque97 = new Bloque();
        addObject(bloque97,0*50,13*50);
        Bloque bloque98 = new Bloque();
        addObject(bloque98,6*50,12*50);
        Bloque bloque99 = new Bloque();
        addObject(bloque99,13*50,12*50);
        Bloque bloque100 = new Bloque();
        addObject(bloque100,2*50,13*50);
        bloque100.setLocation(2*50,13*50);
        Bloque bloque101 = new Bloque();
        addObject(bloque101,2*50,13*50);
        Bloque bloque102 = new Bloque();
        addObject(bloque102,1*50,13*50);
        Bloque bloque103 = new Bloque();
        addObject(bloque103,3*50,13*50);
        Bloque bloque104 = new Bloque();
        addObject(bloque104,4*50,13*50);
        Bloque bloque105 = new Bloque();
        addObject(bloque105,5*50,13*50);
        Bloque bloque106 = new Bloque();
        addObject(bloque106,6*50,13*50);
        Bloque bloque107 = new Bloque();
        addObject(bloque107,7*50,13*50);
        Bloque bloque108 = new Bloque();
        addObject(bloque108,8*50,13*50);
        Bloque bloque109 = new Bloque();
        addObject(bloque109,10*50,13*50);
        Bloque bloque110 = new Bloque();
        addObject(bloque110,9*50,13*50);
        Bloque bloque111 = new Bloque();
        addObject(bloque111,11*50,13*50);
        Bloque bloque112 = new Bloque();
        addObject(bloque112,12*50,13*50);
        Bloque bloque113 = new Bloque();
        addObject(bloque113,13*50,13*50);
        Arándano arándano = new Arándano();
        addObject(arándano,3*50,1*50);
        Arándano arándano2 = new Arándano();
        addObject(arándano2,10*50,1*50);
        Arándano arándano3 = new Arándano();
        addObject(arándano3,3*50,7*50);
        Arándano arándano4 = new Arándano();
        addObject(arándano4,1*50,12*50);
        Arándano arándano5 = new Arándano();
        addObject(arándano5,12*50,8*50);
        Cereza cereza = new Cereza();
        addObject(cereza,13*50,10*50);
        Cereza cereza2 = new Cereza();
        addObject(cereza2,12*50,2*50);
        Cereza cereza3 = new Cereza();
        addObject(cereza3,10*50,12*50);
        Cereza cereza4 = new Cereza();
        addObject(cereza4,4*50,3*50);

        cereza.setLocation(619,510);
        cereza.setLocation(627,512);
        cereza.setLocation(629,509);
        cereza.setLocation(628,489);
        cereza.setLocation(622,497);
        removeObject(cereza4);
        removeObject(cereza2);
        removeObject(cereza3);
        Naranja naranja = new Naranja();
        addObject(naranja,199,150);
        Naranja naranja2 = new Naranja();
        addObject(naranja2,54,302);
        Naranja naranja3 = new Naranja();
        addObject(naranja3,594,192);
        Naranja naranja4 = new Naranja();
        addObject(naranja4,355,396);
        Naranja naranja5 = new Naranja();
        addObject(naranja5,397,594);
        Naranja naranja6 = new Naranja();
        addObject(naranja6,145,503);
        bloque16.setLocation(13,70);
        removeObject(bloque16);
        removeObject(bloque17);
        removeObject(bloque30);
        Bloque bloque114 = new Bloque();
        addObject(bloque114,50,50);
        Bloque bloque115 = new Bloque();
        addObject(bloque115,0,50);
        Bloque bloque116 = new Bloque();
        addObject(bloque116,0,149);
        Mochi mochi = new Mochi();
        addObject(mochi,19,98);
    
    }
}
