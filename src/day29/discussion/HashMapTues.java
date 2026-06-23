/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day29.discussion;

import java.util.HashMap;
import java.util.Map;


public class HashMapTues {
    
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Winter", 90);
        grades.put("Summer", 58);
        grades.put("Sharmaine", 98);
        
        System.out.println("Sharmaine grade: " + grades.get("Sharmaine"));
        
        grades.remove("Sharmaine");
        System.out.println(grades.containsKey("Sharmaine"));
        System.out.println(grades.containsValue(98));
        System.out.println(grades.size());
        System.out.println(grades);
        grades.clear();
        System.out.println(grades);
        
    }
}
