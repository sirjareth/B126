/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

public class PrimeNumbers {
    public static void main(String[] args) {
            
        for (int i = 2; i < 10; i++) {
            if(i % 2 != 0 || i == 2){
                System.out.println(i);
            }
        }
    }
    
}
