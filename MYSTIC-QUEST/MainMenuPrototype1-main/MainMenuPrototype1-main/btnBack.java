import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnBack extends Actor
{   
    public btnBack()
    {
        GreenfootImage image = getImage();
        image.scale(224, 64);
        setImage(image);
    }
    
    /**
     * Act - do whatever the btnBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            // Pindah ke world baru (Ganti 'MyWorld' dengan nama kelas World tujuan Anda)
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
