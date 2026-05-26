
package day6;

import java.util.Scanner; // import Scanner Class

public class IfStatement {
    // User Input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create an object of scanner
        System.out.println("* Login In *");
        String username = "winter";
        String password = "winter123";
        
        System.out.print("Enter username: ");
        String inputtedUsername = sc.nextLine(); // consume user input
        System.out.print("Enter password: ");
        String inputtedPassword = sc.nextLine();
        
        if (username.equals(inputtedUsername) && password.equals(inputtedPassword)) {
            System.out.println("Logged In Successfully!");
        } else {
            System.out.println("Logged In Failed");
        }
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
