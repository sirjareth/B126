/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion;

// parent class -> abstract class
public abstract class PaymentGateway {
    
    // Abstract Method (no body, must be impelementd by subclasses)
    public abstract void processPayment(double amount);
    /*
        Sample real-world process (hidden from users)
        1. Connect to bank API
        2. Validate card number, expiry date, CVV
        3. Check available balance
        4. Deduct amount from account
        5. Generate transaction ID
        6. Return success/failure message
    */
    
    // Concrete / Non-abstract method (common functionality)
    public void printReceipt(double amount){
        System.out.println("Payment of " + amount + " processed successfully.");
    }
}
