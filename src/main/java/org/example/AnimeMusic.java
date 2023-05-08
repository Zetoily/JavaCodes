package org.example;

import java.util.List;

public class AnimeMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing initialization...");
    }
    public void doMyDestroy(){
        System.out.println("Doing destroy...");
    }

    @Override
    public List<String> getSong() {
        return null;
    }

}
