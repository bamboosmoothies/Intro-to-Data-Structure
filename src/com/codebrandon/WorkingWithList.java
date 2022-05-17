package com.codebrandon;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author School
 */
public class WorkingWithList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize and Declare List
        List<String> colors = new ArrayList<>();
        
        //Add items into List
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        
        //Print methods 
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);
        
        System.out.println("\n");
        //Loop #1
        for (String c : colors) {
            System.out.println(c);
        }
        
        System.out.println("\n");
        //Loop #2
        colors.forEach(System.out::println);
        
        System.out.println("\n");
        //Loop #3
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        
        List<String> colorsUnmodifiable = List.of(
            "blue",
            "yellow"
        );
        //Will not work due to unmutable List
        //colorsUnmodifiable.add("pink");
        
        
        
        
        
    }
    
}
