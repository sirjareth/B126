/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.Scanner;

public class Exercise4_Sentes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Validation
        // 0 - 100
        if (age >= 0 && age <= 100) { // outer if 
            if (age >= 0 && age <= 2) { // inner if
                System.out.println("Category: Baby");
            } else if (age >= 3 && age <= 12) {
                System.out.println("Category: Child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Category: Teenager");
            } else if (age >= 20 && age <= 29) {
                System.out.println("Category: Young Adult");
            } else if (age >= 30 && age <= 59) {
                System.out.println("Category: Adult");
            } else if (age >= 60 && age <= 100) {
                System.out.println("Category: Senior");
            }
        } else {
            System.out.println("Invalid Age. Age must be greater than 0.");
        }

    }
}
