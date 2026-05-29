/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;


public class Looping {
    
    public static void main(String[] args) {
        
        // syntax
        // For Loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        
        // While Loop
        // Infinite Loop
//        int i = 1;
//        while(i > -5) {
//            System.out.println(i);
//            i++;
//        }

        // Flag
        String color = "black";

        while (color.equals("white")) {
            System.out.println("white");
        }
        

        // Do While Loop
        
        do {
            System.out.println(color);
        } while(color.equals("white"));
        
        
        
        
        
        
        
        
        
//        int countOfEvenNumbers = 0; 
//               // 7
//        for (int i = 1; i <= 20; ++i) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                countOfEvenNumbers++; // 3
//            }
//            
//            if (countOfEvenNumbers == 5) {
//                break; // break the loop prematurely
//            }
//        }
        
        
        
        // syntax
        
        // Print numbers from 1 - 5
        // Print numbers from 10 to 1
        
//        for (int i = 1; i <= 10; i++) {
//            if  (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i * 2);
//        }
//        
//        for(int i = 2; i <= 10; i+=2){
//            System.out.print(i + " ");
//            System.out.println("");
//        }    
        
    }
}        
        
        
    
    

            
        
        // Short Exercise: Print first five even numbers 
        
        // Expected Output: 
        /*
            2 4 6 8 10
        
        OR
        
            2
            4
            6
            8
            10
        */
        


/*
    int i = 0;
        System.out.println(i++);
        System.out.println(i);
*/