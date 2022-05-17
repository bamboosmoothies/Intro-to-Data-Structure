/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.codebrandon;

import java.util.Stack;

/**
 *
 * @author School
 */
public class WorkingWithStacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
           
        System.out.println(stack.peek());
        System.out.println(stack.size());   
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        
        
    }
    
}
