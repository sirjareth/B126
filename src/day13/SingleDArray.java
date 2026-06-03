/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class SingleDArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[3];
        
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
        }
        
        System.out.println("\nPrinting all the names:");
        for (String name : names) {
            System.out.println(name);
        }
        
        
        
        
        //Scanner sc = new Scanner(System.in); // instantiation
        // syntax of declaring a variable
        int num = 1;
        
        // age: 20, 22, 25, 26, 30, 300
        // syntax of creating an array
        // indices:   0    1   2   3   4   5          
        int[] ages = {20, 22, 25, 26, 30, 50};
        
        
        // Traversing an array using for loop
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
        
        // Traversing an array using enhanced for loop / for-each loop
//        for (int age : ages) {
//            System.out.println(age);
//        }
        
        
//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
        
        //System.out.println(numbers[numbers.length -1]);
        
        /*
            Different types of error/exception
            Syntax Error / Compilation Error / Compile Time Error
            Runtime Exception
        */
        
       // String[] names = {"Winter", "Summer", "Fall", "Spring"};
        
        //float[] temperature = {35.5f, 36.8f, 35f};
        
    }
}
