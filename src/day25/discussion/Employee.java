/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;


public class Employee {
     
    int id;
    String name;
    double salary;
    String tinNumber;

    public Employee() {
    }

    // SETTER CONSTRUCTOR
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        
    }

    public Employee(int id, String name, double salary, String tinNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.tinNumber = tinNumber;
    }
    
    
    
    
    
    void work() {
        System.out.println(name + " is working");
    }
    
    void getDetails() {
        System.out.println("* Profile *");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
