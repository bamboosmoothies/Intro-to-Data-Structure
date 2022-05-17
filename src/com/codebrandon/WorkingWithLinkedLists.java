/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.codebrandon;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author School
 */
public class WorkingWithLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize & Declare LinkedList
        LinkedList<Person> linkedList = new LinkedList<>();
        
        //Add to LinkedList 
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        
        //Add to LinkedList at first index
        linkedList.addFirst(new Person("Ali", 18));
        
        //Initalize & Declare Iterator 
        ListIterator<Person> personListIterator = linkedList.listIterator();
        
        //Iteration
        while(personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("");
        
        //Reverse iteration 
        while(personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
        System.out.println("");
        
        
        
    }
    
    static record Person(String name, int age){}
    
}
