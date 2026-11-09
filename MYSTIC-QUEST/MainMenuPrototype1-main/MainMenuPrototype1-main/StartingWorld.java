import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingWorld extends World
{

    /**
     * Constructor for objects of class StartingWorld.
     * 
     */
    public StartingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(770, 600, 1);
        
        prepare();
    }
    
    private void prepare()
    {
        // 1. Buat objek baru dari btnPlay
        btnQuit btnQuit = new btnQuit();
        
        // 2. Masukkan ke dalam world pada koordinat x dan y tertentu (misal: 300, 200)
        addObject(btnQuit, 284, 50);
    }
}
