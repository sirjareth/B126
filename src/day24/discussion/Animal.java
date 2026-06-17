/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion;

// SRP -> Single Responsibility Principle 
// Super Class / Parent Class / Base Class
public class Animal {
    
    protected String breed;
    protected String color;
    
    protected void eat() {
        System.out.println("This animal eats food.");
    }
}
