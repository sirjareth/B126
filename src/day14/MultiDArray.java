/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day14;

import java.util.Scanner;


public class MultiDArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();
        String[][] planets = new String[row][columns];
        
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter planet[" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }
        
        
        // Traversing a multi dimensional array using for each loop
        for (String[] planet : planets) {
            for (String element : planet) {
                System.out.println(element);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        // int [][]numbers = { {2,4,6,8,10}, {1,3,5,7,9}, {1,2} };
        
//        String[][] planets = {
//            // 0        1           2       3
//            {"Mercury", "Venus", "Earth", "Mars"}, // 0
//            {"Jupiter", "Saturn", "Uranus"}, // 1
//            {"Pluto", "Namek", "Vegeta"} // 2
//        };
        
        
        // Traversing a multi dimensional array using nested for loop
        
//        for (int rows = 0; rows < planets.length; rows++) {
//            for (int column = 0; column < planets[rows].length; column++) {
//                System.out.println(planets[rows][column]);
//            }
//        }
        
        
        
        
        
        
        //System.out.println(planets[2][0]);
        
//        System.out.println(planets.length);
//        System.out.println(planets[2].length);
        
        
        
        
    }
    
}
