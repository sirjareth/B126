/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18;

// - a method to get the area of a circle using the given radius
public class Exercise12_Ronquillo {
    
    public static void main(String[] args) {
        Exercise12_Ronquillo obj = new Exercise12_Ronquillo();
        System.out.println(obj.getAreaOfCircle(5));
    }
    
    public double getAreaOfCircle(double radius) {
        return (Math.PI * radius * radius);
    }
    
}
