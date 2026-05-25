/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author Yuno
 */
public class LogicalOperator {
  
    public static void main(String[] args) {
        int age = 18;
        
        // Logical && -> both
        // Logical || -> either
        boolean isValidAge = age > 0 || age < 100 || age == 100;
        System.out.println(isValidAge);
        
        
        // Check if age is greater than 0 and less than 100
        
        // Valid Age -> 18+
        // Invalid Age -> 17-
    }
}
// Boolean