/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;


public class Jump {
    
    void jump(){}
    
    void jump(int noOfJump){}
    
    void jump(String animation){}
    
    void jump(double height){}
    
    void jump(double height, String animation){}
    
    void jump(String animation, double height){}
    
    void jump(int noOfJump, String animation, double height){}
    
    void jump(String animation, int noOfJump, double height){}
    
    
    
    // ambiguity
    public static void main(String[] args) {
        Jump jump = new Jump();
        jump.jump("With star star", 3, 5.0);
        
        
        
    }
}
