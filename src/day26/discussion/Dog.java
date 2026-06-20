/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion;


public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Arf arf");
    }
    
}


//public class Dog extends Animal{
//    @Override
//    public void makeSound(){
//        System.out.println("Arf arf");
//    }
//    @Override
//    public void eat(String food) {
//        System.out.println("The dog is eating " + food);
//    }
//}
