package com.codebrandon;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author School
 */
public class WorkingWithQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * FIFO(First in First Out) 
         * A collection designed for holding elements prior to processing.
         */
        
        //Initalize and Declare Queue
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));
        
        //Print size
        System.out.println(supermarket.size());
        //Display queue
        System.out.println(supermarket.peek());
        //Remove from queue
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        
 
        
       
    }
    static record Person(String name, int age){}
}
