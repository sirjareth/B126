/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion;

/**
 *
 * @author Yuno
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PaypalPayment();
        Payment p3 = new GCashPayment();
        
        p1.pay(5000);
        p2.pay(10000);
        p3.pay(2000);
        
//        Employee emp = new Employee(1, "Winter Sum", 20000);
//        Employee emp2 = new Employee(2, "Fall Sp", 25000, "111-222-333");
//        Employee emp3 = new Employee();
    }
   
}
