/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18;


public class Main {
    
    public static void main(String[] args) {
        Laptop laptop = new Laptop();    // Instantiation
        laptop.brand = "HP";
        laptop.color = "Gray";
        laptop.ramInGb = 16;
        laptop.cpu = "i5";
        
        laptop.createProgram();
        laptop.playMusic();
        laptop.watchVideos();
        
        
        Laptop laptop2 = new Laptop();
        laptop2.brand = "Acer";
        laptop2.color = "White";
        laptop2.cpu = "Ryzen 5";
        laptop2.ramInGb = 8;
        
        laptop2.playMusic();
        laptop2.watchVideos();
        
        Laptop laptop3 = new Laptop();
        laptop3.brand = "Predator";
        laptop3.color = "Black";
        laptop3.cpu = "Ryzen 9";
        laptop3.ramInGb = 48;
        
        laptop3.playMusic();
        laptop3.watchVideos();
        laptop3.createProgram();
        
    }
}
