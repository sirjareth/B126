
package day7;


public class AgeCategorizer {
    // Nested If Statement
    public static void main(String[] args) {
        /* Voters Classification
            Not yet a voter : <= 9
            School Election: 10 - 14
            SK Election: 15 - 17 
            National Election: >= 18
            
        */
        
        int age = 18;
        
        if (age <= 14) {
            System.out.println("Not yet a voter");
        } else if (age >= 15 && age <= 17) {
            System.out.println("SK Election");
        } else {
            System.out.println("National Election");
        }
    }
}
