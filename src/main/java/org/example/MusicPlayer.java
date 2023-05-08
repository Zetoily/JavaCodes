package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(Janres janres){
        Random random = new Random();
        int randNum = random.nextInt(3);
        if (janres == Janres.ROCK){
            System.out.println(rockMusic.getSong().get(randNum));
        }else{
            System.out.println(classicalMusic.getSong().get(randNum));
        }
    }

    //    public String playMusic(){
//        return "Playing: " + music.getSong();
//
//    }

}
