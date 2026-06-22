/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day28.discussion;

import java.util.ArrayList;


public class ArrayListMonday {
    
    public static void main(String[] args) {
        // syntax of ArrayList Instantiation
        ArrayList<String> cars = new ArrayList<>();
        
        // adding an item -> Create Operation
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Bugatti");
        cars.add("Mitsubishi");
        cars.add(2, "BYD");
        
        // accessing an item -> Read Operation
        cars.get(4);
        
        // changing an item -> Update Operation
        cars.set(0, "Isuzu");
        System.out.println("Before: " + cars);
        
        // removing an item -> Delete Operation
        cars.remove(3);
        cars.remove("Isuzu");
//        cars.removeAll(cars);
        cars.clear();
        
        System.out.println("After: " + cars);
        
        System.out.println(cars.size());
    }
}
