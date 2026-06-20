/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion;


public interface Animal {
    
    // static constant
    // default: public, static, final
    double PI = 3.14;
    
    // abstract method
    // default: public, abstract
    void eat();
    
    void makeSound();
}
















//// concrete class / abstract class
//public abstract class Animal {
//    
//    static final double PI = 3.14;
//    
//    
//    public Animal() {
//        
//    }
//    
//    public static final void jump(){
//        
//    }
//    
//    public static void eat(String food, double time){
//        
//    }
//    
//    public final void eat(String food, double time, String style){
//        
//    }
//    
//    // non-abstract method
//    public void eat(){
//        
//    }
//    
//    // abstract method
//    public abstract void makeSound();
//    
//    public abstract void eat(String food);
//    
////    public final abstract void walk();
////    public static abstract void run();
//}


// Modifiers / non-access modifiers: final, static, abstract