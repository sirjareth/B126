/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;

// Hierarchical Inheritance
public class Dog extends Animal{
    
    @Override
    public void sound() {
        System.out.println("arf arf");
    }
    
    @Override
    public void eat() {
        System.out.println("The dog is eating...");
    }
}
