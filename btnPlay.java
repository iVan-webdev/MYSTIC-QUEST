import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnPlay extends Actor
{   
    public btnPlay()
    {
        GreenfootImage image = getImage();
        image.scale(285, 80);
        setImage(image);
    }

    /**
     * Act - do whatever the btnPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Mengecek apakah tombol ini diklik dengan mouse
        if (Greenfoot.mouseClicked(this))
        {
            // Pindah ke world baru (Ganti 'MyWorld' dengan nama kelas World tujuan Anda)
            Greenfoot.setWorld(new StartingWorld());
        }
    }
}
