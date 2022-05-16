
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author School
 */
public class WorkingWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize and Declare Array
        String[] colors = new String[5];
        //Add item to Array 
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";
        
        //Print Array
        System.out.println(Arrays.toString(colors));
        
        brake();
        
        //Another way of adding items to an array as bracket list
        int[] numbers = {100, 200};
        
        //Types of loops to print out all items in Array
        
        //Loop #1 "for-loop"
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        brake();
        
        //Loop #2 "Reverse for-loop"
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        brake();
        
        //Loop #3 
        Arrays.stream(colors).forEach(System.out::println);
        
        brake();
    }
    
    public static void brake() {
        System.out.println("\n");
}
    
}
