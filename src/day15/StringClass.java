
package day15;

import java.util.Scanner;


public class StringClass {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deleting an account....");
        System.out.print("Type Y to proceed: ");
        char choice = scanner.nextLine().charAt(0);
        
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Account Deleted.");
        }
        
        
        
        // isEmpty()
       // String country = "Mexico";
        
        
        
        //indexOf()
//        Scanner input = new Scanner(System.in);
//        String country = "america";
//        
//        System.out.print("Enter letter: ");
//        String letterToFind = input.nextLine();
//        System.out.println(country.indexOf(letterToFind, country.indexOf(letterToFind) +1));
        
        
        
        
        
        // endsWith() startsWith()
//        String position = "Mid Developer";
        
//        System.out.println(position.startsWith("Junior"));
        
//        if (position.startsWith("Junior")) {
//            System.out.println("You need guidance from Senior Developer.");
//        }
        
        
        
        // contains()
//        String address = "Saviorville Parola Cainta Rizal";
//        
//        boolean isContains = address.contains("Cainta");
//        
//        if (isContains) {
//            System.out.println("You are from the municipality of Cainta!");
//        }
        
        //System.out.println(isContains);
        

        
        // instantiate
        // Building building1 = new Building();

        
        
        
        
//        System.out.println(" [3] Exit");
//        System.out.print("Type Exit to proceed: ");
//        String conf = scanner.nextLine();
//        
//        if (conf.equalsIgnoreCase("EXIT")) {
//            System.out.println("Exiting...." + "Thank You!");
//        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
