
package day15;

import java.util.Scanner;


public class StringClass {
    
    public static void main(String[] args) {
        
        String word = "Hello";
        
        char[] arrayOfWords = word.toCharArray();
        
        for (int i = arrayOfWords.length -1; i > 0; i--) {
            System.out.print(arrayOfWords[i]);
        }
        
        // Casting
        
        // Number Class
        // upcasting
        // downcasting
        
        int num = 50;
        
        double newNum = num; // upcasting
        System.out.println(newNum);
        
        
        float temp = 39.9f;
        
        int newTemp = (int) temp; // downcasting
        System.out.println(newTemp);
        
        // double average = (double) sum / length;
        // byte hosrt int long float double
        // Parsing -> converts String to primitive data type or vice versa
        // valueOf()
//        int id = 1012026;
//
//        String newNum = String.valueOf(id);
//        String newId = newNum + "B126";
//        System.out.println(newId);
        
        
//        String num = "127";
//        
//        byte newNum = Byte.parseByte(num);
//        System.out.println(newNum);
        
        // replace()
//        String hero = "Superman";
//
//        char[] heroArray = hero.toCharArray();
//        
////        for (int i = 0; i < heroArray.length; i++) {
////            System.out.print(heroArray[i]);
////        }
//
//
//        for (int i = heroArray.length -1; i >= 0; i--) {
//            System.out.print(heroArray[i]);
//        }
//        System.out.println("");
        
        
//        String hero = "Superman";
//        String newHero = "Batman";
//        
//        System.out.println(hero.replace(hero, newHero));   
        
        
        
        
        
        
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Deleting an account....");
//        System.out.print("Type Y to proceed: ");
//        char choice = scanner.nextLine().trim().charAt(0);
//        
//        if (choice == 'Y' || choice == 'y') {
//            System.out.println("Account Deleted.");
//        }
        
        
        
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
