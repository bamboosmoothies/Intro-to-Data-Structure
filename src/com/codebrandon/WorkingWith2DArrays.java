/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.codebrandon;

import java.util.Arrays;

/**
 *
 * @author School
 */
public class WorkingWith2DArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initalize and Declare 2D Arrays
        char[][] board = new char[3][3];
        
        //Nested for-loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        //Print for 2D Arrays
        System.out.println(Arrays.deepToString(board));
        
        //Board2 different coding method/style
        char[][] board2 = new char[][] {
            new char[]{'0', '-', '-'},
            new char[]{'0', '-', '-'},
            new char[]{'0', '-', '-'}
        };
        System.out.println(Arrays.deepToString(board2));
        
    }
    
}
