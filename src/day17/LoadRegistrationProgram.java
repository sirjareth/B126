/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17;

import java.util.Scanner;

public class LoadRegistrationProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void validateUssdCode() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        if (!ussdCode.equals("*143#")) {
            return; // return statement is used to terminate a method
        }
    }

    public static void mainMenu() {
        System.out.println("\n\n\n* Load Registration *");

        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Unli Call N Text");
        System.out.print("Enter choice: ");
        int mainMenuChoice = scanner.nextInt();

        switch (mainMenuChoice) {
            case 1:
                unliTextPromo();
            case 2:
                unliCallPromo();

        }
    }

    public static void unliTextPromo() {
        System.out.println("\n\n\n *** Enjoy Unli Text ***");
        System.out.println("    [1] 1 Day for P10");
        System.out.println("    [2] 3 Days for P30");
        System.out.println("    [3] 5 Days for P50");
        System.out.print("Enter choice: ");
        int subMenuChoice = scanner.nextInt();

        switch (subMenuChoice) {
            case 1:
                 subscriptionConfirmation("Unli Text Promo", 1, 10);
            case 2:
                // subscriptionConfirmation()
        }
    }
    
    public static void unliCallPromo() {
        System.out.println("\n\n\n *** Enjoy Unli Text ***");
        System.out.println("    [1] 1 Day for P10");
        System.out.println("    [2] 3 Days for P30");
        System.out.println("    [3] 5 Days for P50");
        System.out.print("Enter choice: ");
        int subMenuChoice = scanner.nextInt();

        switch (subMenuChoice) {
            case 1:
                // subscriptionConfirmation()
            case 2:
                // subscriptionConfirmation()
        }
    }

    public static void subscriptionConfirmation(String promo, int days, int price) {
        System.out.println("\n\n\n-> Get " + promo + " good for " +  days + " Day/s for only P" + price);
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter choice: ");
        int confirmationChoice = scanner.nextInt();

        if (confirmationChoice == 1) {
            System.out.println("\n\n\nCongratulations you are subscribe to " + promo + " for " + days + " Day/days.");

        } else if (confirmationChoice == 2) {
            //
        } else {
            exitConfirmation();
        }
    }
    
    public static void exitConfirmation() {
        
        System.out.println("Are you sure you really want to exit? ");
        System.out.print("Type Y to proceed: ");
        char choice = scanner.nextLine().trim().charAt(0);
        
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Exiting.....");
            System.exit(0);
        } else {
            // 
        }
    }

}
