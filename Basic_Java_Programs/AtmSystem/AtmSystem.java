import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pin, option;
        double amount, balance = 100000;
        String run = "N";
        boolean isRunning = true;

        System.out.println("* * * * * * * * * * * * * * *\n B A N K I N G   S Y S T E M\n* * * * * * * * * * * * * * *\n");

        System.out.print("Enter your PIN: ");
        pin = in.nextInt();
        in.nextLine();
        if (pin != 7890){
            System.out.println("Incorrect PIN, Please try again.");
            return;
        }

        while(isRunning) {
            System.out.println("\n=====================================\n");
            System.out.println("Select your option: ");
            System.out.println("1. Withdraw Cash.");
            System.out.println("2. Deposit Cash.");
            System.out.println("3. Inquire Balance.");
            System.out.print("\nEnter your option number: ");
            if (in.hasNextInt()) {
            option = in.nextInt();
            in.nextLine();
            } else {
                System.out.println("Invalid option, Please choose (1-3).");
                in.next();
                continue;
            }

                if (option == 1) {
                      System.out.println("\n------------------\nWITHDRAW  CASH\n------------------");
                    System.out.print("Enter the amount you want to Withdraw: ");
                    if (in.hasNextDouble()) {
                        amount = in.nextDouble();
                        in.nextLine();
                        if (amount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive number.");
                        } else if (balance >= amount) {
                            balance -= amount;
                            System.out.printf("%.2f Rs Withdrawn\t|\tRemaining balance: %.2f Rs.%n", amount, balance);
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
                    } else {
                        System.out.println("Please enter a valid input. ");
                        in.next();
                        continue;
                    }
                } else if (option == 2) {
                      System.out.println("\n------------------\nDEPOSIT CASH\n------------------");
                    System.out.print("Enter the amount you want to Deposit: ");
                    if (in.hasNextDouble()) {
                        amount = in.nextDouble();
                        in.nextLine();
                        if (amount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive number.");
                        } else {
                            balance += amount;
                            System.out.printf("%.2f Rs Deposited\t|\tCurrent balance: %.2f Rs%n", amount, balance);
                        }
                    } else {
                        System.out.println("Please enter a valid input.");
                        in.next();
                        continue;
                    }
                } else if (option == 3) {
                       System.out.println("\n------------------\nINQUIRE  BALANCE\n------------------");
                    System.out.printf("Your current balance is: %.2f Rs%n", balance);
                } else
                    System.out.println("You have selected wrong option, Please try again!");

            System.out.print("\n\nDo you want to Exit? (Y/N): ");
            run = in.nextLine().toUpperCase();
            if(run.equals("Y")) {
                isRunning = false;
            }
        }
        System.out.println("\nThank you for using our Banking System. Have a great day!");
        System.out.println("Program Closed.");
        in.close();
    }
}
