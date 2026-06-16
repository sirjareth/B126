/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22.dicsussion;

// class
// package-private -> default
public class A {
    
    
    String URL = "jdbc:mysql/localhost:4000/mydb";
    public int num = 1;
    
    void a(){
        System.out.println("Hello....");
    }
    
    public void accessThem() {
        System.out.println(num);
        a();
    }
    
}
