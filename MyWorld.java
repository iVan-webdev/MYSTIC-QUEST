import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private GreenfootSound bgm = new GreenfootSound("Prelude_MainMenuSong.mp3");

    public MyWorld() {    
        super(770, 600, 1);
        // JANGAN letakkan bgm.playLoop() di sini!
        prepare();
    }

    // Akan otomatis berjalan HANYA KETIKA tombol RUN diklik
    public void started() {
        bgm.playLoop();
    }

    // Akan otomatis berhenti KETIKA tombol PAUSE atau RESET diklik
    public void stopped() {
        bgm.pause(); // Atau bgm.stop()
    }
    // Panggil method untuk menyiapkan objek di dalam world
    
    private void prepare()
    {
        // 1. Buat objek baru dari btnPlay
        btnPlay playButton = new btnPlay();

        // 2. Masukkan ke dalam world pada koordinat x dan y tertentu (misal: 300, 200)
        addObject(playButton, 380, 412);
        btnPlay btnPlay = new btnPlay();
        addObject(btnPlay,388,418);
        btnPlay.setLocation(385,410);
        btnPlay.setLocation(381,410);
        btnQuit btnQuit = new btnQuit();
        addObject(btnQuit,356,516);
        btnQuit.setLocation(364,513);
        btnQuit.setLocation(364,513);
        btnQuit.setLocation(374,515);
        btnSetting btnSetting = new btnSetting();
        addObject(btnSetting,397,459);
        btnSetting.setLocation(387,463);
        btnSetting.setLocation(382,463);
        btnPlay.setLocation(433,408);
        btnPlay.setLocation(389,412);
        btnPlay.setLocation(381,412);
    }
}
