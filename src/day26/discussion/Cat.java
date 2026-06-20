/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion;

// implements
public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    
}

//// inheritance / polymorphism
//public class Cat extends Animal{
//    @Override
//    public void makeSound() {
//        System.out.println("Meow meow");
//    }
//    @Override
//    public void eat(String food) {
//        System.out.println("The cat is eating " + food);
//    }
//}
