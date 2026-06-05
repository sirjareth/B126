
package day15;

import java.util.Scanner;


public class StringClass {
    
    public static void main(String[] args) {
        // instantiate
        // Building building1 = new Building();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Deleting an account....");
//        System.out.print("Type Y to proceed: ");
//        String choice = scanner.nextLine();
//        
//        if (choice.equalsIgnoreCase("Y")) {
//            System.out.println("Account Deleted.");
//        }
        
        
        
        
        System.out.println(" [3] Exit");
        System.out.print("Type Exit to proceed: ");
        String conf = scanner.nextLine();
        
        if (conf.equalsIgnoreCase("EXIT")) {
            System.out.println("Exiting...." + "Thank You!");
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // charAt()
        /*
        String middleName = "Bulawit";
        char middleInitial = middleName.charAt(0);
        System.out.println(middleInitial);
        */
        
        /*
        // length()
        String word = "Java Programming";
        System.out.println(word.length());   
        
        
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        */
    }
}
