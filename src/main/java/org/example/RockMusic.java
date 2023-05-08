package org.example;

import org.springframework.stereotype.Component;

import java.util.*;


public class RockMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing initialization...");
    }
    public void doMyDestroy(){
        System.out.println("Doing destroy...");
    }
    List<String> songs = new ArrayList<>(Arrays.asList("Psy","Nervi","ShadowRaze"));
    public List<String> getSong() {
        return songs;
    }
}
