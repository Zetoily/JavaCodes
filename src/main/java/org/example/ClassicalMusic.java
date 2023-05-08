package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing initialization...");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destroy...");
    }
    List<String> songs = new ArrayList<>(Arrays.asList("Psy","Nervi","ShadowRaze"));
    public List<String> getSong() {
        return songs;
    }

}
