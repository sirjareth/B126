/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day29.discussion;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListTues {
    // color game: 3 roll dice: [] [] []
    public static void main(String[] args) {
        ArrayList<String> rollDice = new ArrayList<>();
        rollDice.add("Red"); 
        rollDice.add("Blue"); 
        rollDice.add("Green"); 
        rollDice.add("Yellow");
        rollDice.add("Pink");
        rollDice.add("White");
        rollDice.add("Yellow");
          
        
        Collections.shuffle(rollDice);
        System.out.println("Dice 1: " + rollDice.get(0));
        Collections.shuffle(rollDice);
        System.out.println("Dice 2: " + rollDice.get(0));
        Collections.shuffle(rollDice);
        System.out.println("Dice 3: " + rollDice.get(0));
        
        
        
//        System.out.println(rollDice.lastIndexOf("Yellow")); 
//        ArrayList<String> rollDice2 = new ArrayList<>();
//        rollDice2.addAll(rollDice);
//        Collections.shuffle(rollDice2);
//        System.out.println("Dice 2: " + rollDice2.get(0));
//        
//        ArrayList<String> rollDice3 = new ArrayList<>(rollDice);
//        Collections.shuffle(rollDice3);
//        System.out.println("Dice 3: " + rollDice3.get(0));
        
        
        
        
        
        
        
        // addAll()
        
        
        
        
        
        //Collections.sort(rollDice);
        // Traversing an ArrayList using for-loop
//        for (int i = 0; i < rollDice.size(); i++) {
//            System.out.println(rollDice.get(i));   
//        }
        
        // Traversing an ArrayList using for-each loop
//        for (String color : rollDice) {
//            System.out.println(color);
//        }
        
        //rollDice.forEach(System.out::println);
    }
}
