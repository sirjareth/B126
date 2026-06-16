
package day22.dicsussion;


public class DefaultPackage {
    
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a();
    }
    
    
    public void get(){
        AccessModifier obj = new AccessModifier();
        obj.a();
    }
    
}



/*
    import java.util.Scanner; // Import a specific class
//import java.util.*; // Import all classes from a package
*/