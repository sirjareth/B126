/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day19;

/**
 *
 * @author Yuno
 */
public class ExceptionsHandling {
    
    public static void main(String[] args) {
        int[] evenNumbers = {2,4,5,6,8};
        
        

        
        try {
            System.out.println(evenNumbers[8]);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Hello");
        
    }
}
