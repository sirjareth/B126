/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion;


public class PayPalGateway extends PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing paypal payment of " + amount);
        /*
        Sample real-world process (hidden from users)
        1. Connect to bank API
        2. Validate card number, expiry date, CVV
        3. Check available balance
        4. Deduct amount from account
        5. Generate transaction ID
        6. Return success/failure message
    */
    }
}
