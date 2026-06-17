/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion;

// this -> current class object
// super -> parent class object
public class Developer extends Employee{
    
    String programmingLanguage;

    // Contructor
    public Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
    
    void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}


// Employee, Manager, Developer