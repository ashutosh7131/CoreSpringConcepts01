package com.learnspringconcepts.Core.Spring.Concepts.game;


import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements GamingConsole{

    public void up(){

        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go inside a hole");

    }

    public void left(){

        System.out.println("Go left");
    }

    public void right(){

        System.out.println("Go right");
    }


}
