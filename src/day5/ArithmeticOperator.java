
package day5;


public class ArithmeticOperator {
    
    public static void main(String[] args) {
        String name = "Jareth";
        int age = 26;
       // System.out.println(10 + age);

        
        int num = 10;
        int num2 = 25;
        int sum = num + num2;
        
        
        System.out.println("The sum of the two numbers is " + sum);   
        
        
        // Identify if the number is odd or even
        
        int number = 13;
        boolean isEven = number % 2 == 0;
        //System.out.println(isEven);
        
        
        // Leap Year -> divisible by 4
        int year = 2028;
        boolean isLeapYear = year % 4 == 0;
        //System.out.println(isLeapYear);
    }
}
