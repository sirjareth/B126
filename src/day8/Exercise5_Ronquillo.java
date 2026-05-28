/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class Exercise5_Ronquillo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();
        
        if (!ussdCode.equals("*143#")) {
            return; // return statement is used to terminate a method
        }
        
        System.out.println("* Load Registration *");
        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Unli Call N Text");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                // 3 days + 500mb
                // 5 days + 1gb
                // 7 days + 2gb
                choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        // 3 days + 500mb
                        break;
                        // // confirmation
                        // 1 subscribe
                        // 2 cancel
                        // 3 exit
//                        choice = scanner.nextInt();
//                        if (true) {
//                            
//                        } else {
//                        }
                    case 2:
                        // 5 days + 1gb
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
