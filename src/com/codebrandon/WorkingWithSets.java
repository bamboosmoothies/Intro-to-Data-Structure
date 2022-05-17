/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.codebrandon;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author School
 */
public class WorkingWithSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Sets:
         * A collection that contains no duplicate elements
         * 
         * More formally, sets contain no pair of elements e1 and e2 such that
         * e1.equals(e2), and at most one null element.
         * 
         * As implied by its name, this interface models 
         * the mathematical set abstraction.
         */
        
        //Initalize and Declare Set as new HashSet
        Set<Ball> balls = new HashSet<>();
        
        //Add to collection
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        
        
        //Print size 
        System.out.println(balls.size());
        
        //Iterate & print
        //Order is not guarentee & No duplication
        balls.forEach(System.out::println);
        
        
        
        
        
    }
//    record Ball(String color){}
    
    static class Ball {
        //Instance Variable
        String color;
        
        //Constructor
        public Ball(String color) {
            this.color = color;
        }
       
        
        //Methods
        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + "\'" +
            '}';
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 61 * hash + Objects.hashCode(this.color);
            return hash;
        }
        
        
    }
    

    
}
