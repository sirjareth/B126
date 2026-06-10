package day19;

/* Input Mismatch Exception
    balance
    looping
    exceptions handling
 */
import java.util.Scanner;

public class LoadRegistrationApp {

    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 100.0; // initial balance

    public static void main(String[] args) {
        clearScreen();
        validateUssdCode();

        while (true) {
            try {
                clearScreen();
                mainMenu();
                
            } catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    public static void validateUssdCode() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine().trim();

        if (ussdCode.isEmpty() || !ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0);
        }

    }

    public static void mainMenu() {
        //System.out.println("\n\n\n* Load Registration *");
        System.out.println("* Load Registration *");
        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Unli Call N Text");
        System.out.println("    [4] Check Balance");
        System.out.println("    [5] Exit");
        System.out.print("Enter choice: ");
        int mainMenuChoice = scanner.nextInt();

        switch (mainMenuChoice) {
            case 1:
                unliTextPromo();
                break;
            case 2:
                unliCallPromo();
                break;
            case 3:
                unliCallNTextPromo();
                break;
            case 4:
                checkBalance();
                break;
            case 5:
                exitConfirmation();
            default:
                System.out.println("Invalid Choice!");

        }
    }

    public static void unliTextPromo() {
        //System.out.println("\n\n\n *** Enjoy Unli Text ***");
        clearScreen();
        System.out.println("*** Enjoy Unli Text ***");
        System.out.println("    [1] 1 Day for P10");
        System.out.println("    [2] 3 Days for P30");
        System.out.println("    [3] 5 Days for P50");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int subMenuChoice = scanner.nextInt();

        switch (subMenuChoice) {
            case 1:
                subscriptionConfirmation("Unli Text Promo", 1, 10);
                break;
            case 2:
                subscriptionConfirmation("Unli Text Promo", 3, 30);
                break;
            case 3:
                subscriptionConfirmation("Unli Text Promo", 3, 30);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid Choice!");

        }
    }

    public static void unliCallPromo() {
        clearScreen();
        //System.out.println("\n\n\n *** Enjoy Unli Call ***");
        System.out.println("*** Enjoy Unli Call ***");
        System.out.println("    [1] 1 Day for P20");
        System.out.println("    [2] 3 Days for P50");
        System.out.println("    [3] 5 Days for P70");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int subMenuChoice = scanner.nextInt();

        switch (subMenuChoice) {
            case 1:
                subscriptionConfirmation("Unli Call", 1, 20);
                break;
            case 2:
                subscriptionConfirmation("Unli Call", 3, 50);
                break;
            case 3:
                subscriptionConfirmation("Unli Call", 5, 70);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void unliCallNTextPromo() {
        //System.out.println("\n\n\n *** Enjoy Unli Call N Text ***");
        System.out.println("*** Enjoy Unli Call N Text ***");
        System.out.println("    [1] 3 Days for P50");
        System.out.println("    [2] 5 Days for P70");
        System.out.println("    [3] 7 Days for P100");
        System.out.println("    [4] Back");
        System.out.print("Enter choice: ");
        int subMenuChoice = scanner.nextInt();

        switch (subMenuChoice) {
            case 1:
                subscriptionConfirmation("Unli Call N Text", 3, 50);
                break;
            case 2:
                subscriptionConfirmation("Unli Call N Text", 5, 70);
                break;
            case 3:
                subscriptionConfirmation("Unli Call N Text", 7, 100);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void subscriptionConfirmation(String promo, int days, int price) {
        clearScreen();
        System.out.println("-> Get " + promo + " good for " + days + " Day/s for only P" + price);
        //System.out.println("\n\n\n-> Get " + promo + " good for " + days + " Day/s for only P" + price);
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter choice: ");
        int confirmationChoice = scanner.nextInt();

        if (confirmationChoice == 1) {
            if (loadBalance >= price) {
                loadBalance -= price;
                System.out.println("\n\n\nCongratulations you are subscribe to " + promo + " for " + days + " Day/days.");
            } else {
                System.out.println("Insufficient Balance! Please reload.");
            }

        } else if (confirmationChoice == 2) {
            return;
        } else {
            exitConfirmation();
        }
    }

    public static void checkBalance() {
        
        System.out.println("\n\n\nYour current load balance is: P" + loadBalance);
    }

    public static void exitConfirmation() {
        scanner.nextLine();
        System.out.println("\n\n\nAre you sure you really want to exit? ");
        System.out.print("Type Y to proceed: ");
        char choice = scanner.nextLine().trim().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            System.out.println("Exiting.....");
            System.exit(0);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

/*
    return  -> exit method
    break   ->  exit loop/switch
    System.exit() -> exit system
 */


/*
    How to run Java Program in terminal
Steps:
    1. Check Java Installation
    2. Navigate to project folder 
*/