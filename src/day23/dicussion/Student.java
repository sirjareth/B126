/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.dicussion;

/* Encapsulated Class
    1. make all the data members private -> data hiding
    2. use setter and getter methods -> data validation
*/
public class Student {
    
    private int id; // 1
    private String name; // Manuel Pogi
    private int gradeLevel;
    private String course;
    private String contactNumber;
    private boolean isNewStudent;
    
    // setter constructor
    public Student(int id, String name, int gradeLevel, 
            String course, String contactNumber, boolean isNewStudent) {
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.course = course;
        this.contactNumber = contactNumber;
        this.isNewStudent = isNewStudent;
    }
    

    
    // accessor / getter method
    public int getId() {
        return id;
    }
    
    // mutator / setter method
    public void setId (int id) {
        // member = param
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getGradeLevel () {
        return gradeLevel;
    }
    
    public void setGradeLevel (int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    
}
// this keyword -> is used to immediately 
    //              refers to the current class object