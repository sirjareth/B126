/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;

// Single Level Inheritance
public class Cat extends Animal{
    
    @Override
    public void sound(){
        System.out.println("meow meow");
    }
    
    @Override
    public void eat() {
        System.out.println("The cat is eating....");
    }
}
