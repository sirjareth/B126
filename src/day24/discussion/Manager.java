/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion;

// DRY -> Don't Repeat Yourself
public class Manager extends Employee{
    
    String department;

    // Constructor
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
    
    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
