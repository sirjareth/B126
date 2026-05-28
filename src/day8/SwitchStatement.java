/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Enter Day: ");
        String day = scanner.nextLine();

        // syntax
        switch (day) {
            case "Monday":
                result = "First";
                break; // break the switch statement
            case "Tuesday":
                result = "Second";
                break;
            case "Wednesday":
                result = "Third";
                break;
            default:
                System.out.println("Invalid Day!");
                break;
        }
        System.out.println(result + " Day of the Week!");
    }
}
