/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;


public class ShapeCalculator {
    // Method Overloading
    
    // Area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Area of rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Area of triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();
        System.out.println("Circle Area: " + calc.calculateArea(5));   
        System.out.println("Rectangle Area: " + calc.calculateArea(4, 6));
        System.out.println("Triangle Area: " + calc.calculateArea(3, 7, true));
    }
}
