/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27.discussion;

// Hybrid Inheritance: combination of hierarchical + multiple inheritance
public class Dog extends Animal implements Pet{
    
    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }
    
    public void eat(){
        System.out.println("Dog is eating...");
    }
    
    public void bark(){
        System.out.println("arf arf");
    }
}


// OOP's Concept is used strategically, not constantly.