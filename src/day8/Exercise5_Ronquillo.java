/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

// Code Progression
// Method of Java
public class Exercise5_Ronquillo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();
        
        if (!ussdCode.equals("*143#")) {
            return; // return statement is used to terminate a method
        }
        
        // Main Menu
        //System.out.println(""); // new line 
        System.out.println("\n\n\n* Load Registration *");
        
        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Unli Call N Text");
        System.out.print("Enter choice: ");
        int mainMenuChoice = scanner.nextInt();
        
        switch(mainMenuChoice) {
            case 1:
                // Sub-Menu for Unli Text
                System.out.println("\n\n\n *** Enjoy Unli Text ***");
                System.out.println("    [1] 1 Day for P10");
                System.out.println("    [2] 3 Days for P30");
                System.out.println("    [3] 5 Days for P50");
                System.out.print("Enter choice: ");
                int subMenuChoice = scanner.nextInt();
                switch(subMenuChoice) {
                    case 1:
                        System.out.println("\n\n\n-> Get Unli Text good for 1 Day for only P10");
                        System.out.println("    [1] Subscribe");
                        System.out.println("    [2] Back");
                        System.out.println("    [3] Exit");
                        System.out.print("Enter choice: ");
                        int confirmationChoice = scanner.nextInt();
                        
                        if (confirmationChoice == 1) {
                            System.out.println("\n\n\nCongratulations you are subscribe to Unli Text for 1 Day.");
                            
                        } else if (confirmationChoice == 2){
                            // back
                        } else {
                            System.out.println("Thank You!");
                            return;
                        }
                        
                        break;

                    case 2:
                        // Sub-Menu for Unli Call
                        System.out.println("    [1] 1 Day for P30");
                        System.out.println("    [2] 3 Days for P50");
                        System.out.println("    [3] 5 Days for P70");
                            break;
                        
                }
                // block of code for unli text
                break;
            case 2:
                // block of code for unli call
                break;
        }
    }
}
//
