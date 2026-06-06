/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16;

import java.util.Random;


public class MathClass {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        System.out.println("Lotto Simulator"); 
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(75) + 1;
            System.out.println("[" + (i + 1) + "]: " + randomNumber);
        }
        
        
//        System.out.println("Lotto Simulator"); 
//        for (int i = 0; i < 6; i++) {
//            int randomNumber = (int)(Math.random() * 55) + 1;
//            System.out.println("[" + (i + 1) + "]: " + randomNumber);
//        }
        
        
        //System.out.println("BINGO SIMULATOR");
        // 1 - 75 : 
        /*
            B: 1 - 15
            I: 16 - 30
            N: 31 - 45
            G: 46 - 60
            O: 61 - 75
        */
        String letter = "";
        
        int roll = (int)(Math.random() * 75) + 1;
        
        if (roll <= 15) {
            letter = "B";
        } else if (roll <= 30) {
            letter = "I";
        } else if (roll <= 45) {
            letter = "N";
        } else if(roll <= 60) {
            letter = "G";
        } else {
            letter = "O";
        }
        
       //System.out.println("Sa letra ng " + letter + " : " + roll);
    }
}


/*
        int maxNum = Math.max(5, 10);
        System.out.println(maxNum);
        
        int minNum = Math.min(5, 10);
        System.out.println(minNum);
        
        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);
        
        double absNum = Math.abs(-100);
        System.out.println(absNum);   
        
        double powerExp = Math.pow(2, 4);
        
        System.out.println(powerExp);
        
        double roundedNum = Math.round(90.4);
        System.out.println(roundedNum);
*/