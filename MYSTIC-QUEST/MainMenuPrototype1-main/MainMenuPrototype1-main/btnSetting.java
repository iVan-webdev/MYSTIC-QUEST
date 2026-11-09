import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnSetting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnSetting extends Actor
{
    /**
     * Act - do whatever the btnSetting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            // Mengecek apakah tombol ini diklik dengan mouse
        if (Greenfoot.mouseClicked(this))
        {
            // Pindah ke world baru (Ganti 'MyWorld' dengan nama kelas World tujuan Anda)
            Greenfoot.setWorld(new SettingPage());
        }
    }
}
