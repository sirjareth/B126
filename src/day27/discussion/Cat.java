/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27.discussion;

// Subclass
public class Cat extends Animal implements Pet{
    
//    private Animal animal;
//
//    public Ca7"
 //   Animal animal) {
//        this.animal = animal;
//    }
    
    
    @Override
    public void eat(){
        System.out.println("Cat is eating...");
    }
    
    public void play(){
        System.out.println("Cat plays with yarn.");
    }
    
    public void makeSound() {
        System.out.println("meow meow");
    }
    
}
