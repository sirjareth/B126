/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day28.discussion;


public class Account {
    
    enum UserLevel {
        STANDARD_USER,
        ADMIN,
        SUPER_ADMIN
    }
    
    public static void main(String[] args) {
        
        for (UserLevel userLevels : UserLevel.values()) {
            System.out.println(userLevels);
        }
        
        
//        UserLevel userLevel = UserLevel.STANDARD_USER;
//        
//        switch (userLevel) {
//            case STANDARD_USER: 
//            case ADMIN:             
//            case SUPER_ADMIN:
//                System.out.println("Welcome!");
//                
//        }
        
//        switch (userLevel) {
//            case STANDARD_USER:
//                System.out.println("This user is standard user only!");
//                // invoke method for standard user
//            case ADMIN:
//                System.out.println("This is admin.");
//                // invoke method for admin
//            case SUPER_ADMIN:
//                System.out.println("This is super admin");
//                // invoke method for super admin
//        }
        
//        if (userLevel == UserLevel.STANDARD_USER) {
//            System.out.println("This user is standard user only!");
//            // method for standard
//        } else if (userLevel == UserLevel.ADMIN){
//            System.out.println("This is admin.");
//            // method for admin
//        } else {
//            System.out.println("This is super admin");
//            // method for super admin
//        }
  
    }
    
//    public UserLevel login(){
//        // STANDARD_USER,
//        // ADMIN,
//        // SUPER_ADMIN
//    }
}
