package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

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
