/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27.discussion;


public class User implements Authenticatable, Reportable, Loggable{
    
    private String username;
    
    public User(String username) {
        this.username = username;
    }
    @Override
    public void login(String username, String password){
        // Sample process (hidden from the user)
        System.out.println(username + " logged in successfully!");
    }
    @Override
    public void logout(){
        System.out.println(username + " logged out.");
    }
    @Override
    public void logActivity(String activity) {
        System.out.println("Acvitiy logged: " + activity);
    }
    @Override
    public void generateReport() {
        System.out.println("Report generated for user " + username);
    }

    
}

