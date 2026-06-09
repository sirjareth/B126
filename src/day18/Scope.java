/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18;

// non-access modifier
public class Scope {
    
    static String middleInitial = "H"; // static variable / global variable
    
    String lastName = "Ronquillo"; // instance variable

    // static method
    public static void greet() {
        
        
    }
    
    // instance method
    public void printName(){
        greet();
    }
    
    /*                          Result (Direct/Instantiate)
        static to static        Direct
        static to instance      Direct
        instance to static      Instantiate
        instance to instance    Direct
    */
    
    
    
    public static void main(String[] args) {
        String firstName = "Winter"; // local variable
        Scope obj = new Scope();
        
        // 
        System.out.println(firstName + " " + middleInitial + ". " + obj.lastName);
        
        
    }
    
    
 
}
