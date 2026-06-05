
package day6;

import java.util.Scanner; // import Scanner Class

public class LoginProgram {
    // User Input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create an object of scanner
        System.out.println("* Login In *");
        String email = "winter@gmail.com";
        String password = "winter123";
        
        boolean isLoggedIn = false;
        while(!isLoggedIn){
            System.out.print("\n\nEnter email: ");
            String inputtedEmail = scanner.nextLine().trim(); // consume user name
            System.out.print("Enter password: ");
            String inputtedPassword = scanner.nextLine().trim(); // consume user password
            
            // Eary Exit
            if (inputtedEmail.isEmpty() || inputtedPassword.isEmpty()) {
                return; // exit
            }
            
            if (email.equals(inputtedEmail) && password.equals(inputtedPassword)) {
                System.out.println("Logged In Successfully!");
                // Main Menu / Home
                isLoggedIn = true;
            } else {
                System.out.println("Logged In Failed");
            }
        }
        
        scanner.close(); // close the scanner
        
        
        // For Loop / While Loop / Do While Loop
    }
}

/*
    // Relational Operator: Comparison and Equality
        if(x < y){
            System.out.println("X is less than Y");
        } else { 
            System.out.println("X is not less than Y");
        }
        
        // If-else statement
        String gender = "Female";
        
        if (gender == "Male") {
            System.out.println("I am handsome.");
        } else {
            System.out.println("I am beautiful.");
        }

        
        
        // If-else-if ladder statement
        String city = "Grand Canal";
        
        if (city == "Manila") {
            System.out.println("City is Manila");
        } else if (city == "Quezon City") {
            System.out.println("City is Quezon City");
        } else if (city == "Davao City") {
            System.out.println("City is Davao City");
        } else {
            System.out.println("Invalid City");
        }
*/
