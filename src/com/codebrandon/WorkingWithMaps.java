/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.codebrandon;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author School
 */
public class WorkingWithMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * A map cannot contain duplicate keys.
         * Each key can map to at most one value.
         */
        
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        //Loop
        map.entrySet().forEach(System.out::println);
        
        //loop 2
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());

    }
    
    record Person(String name){}
    
}
