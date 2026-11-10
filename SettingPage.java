import greenfoot.*;

public class SettingPage extends World
{
    public SettingPage()
    {    
        super(770, 600, 1);

        GreenfootImage bg = getBackground();

        // 1. Berikan warna latar belakang dulu agar kontras (misal: Hitam)
        bg.setColor(greenfoot.Color.WHITE);
        bg.fill(); // Mengisi seluruh background dengan warna hitam

        // 2. Atur warna teks menjadi PUTIH agar terlihat di atas background hitam
        bg.setColor(greenfoot.Color.BLACK);

        // 3. Atur font
        bg.setFont(new greenfoot.Font("Arial", true, false, 24));

        // 4. Gambar teks di posisi tengah atas yang pasti terlihat
        bg.drawString("SETTING", 335, 50);
        bg.drawString("Volume", 80, 120);
        bg.drawString("BGM", 80, 170);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        btnBack btnBack = new btnBack();
        addObject(btnBack,346,204);
        btnBack.setLocation(472,370);
        btnBack.setLocation(506,371);
        btnBack.setLocation(695,577);
        btnBack.setLocation(676,577);
        btnBack.setLocation(665,569);
        btnBack.setLocation(680,573);
    }
}