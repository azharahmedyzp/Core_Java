import java.util.Scanner;

class BankAcc {
    private long accNumber;
    private String accHolderName;
    private double initialBalance;

    //Setters
    void setAccNumber(long accNumber) {
        if (accNumber > 0)
            this.accNumber = accNumber;
        else
            System.out.println("Account number cannot be zero or negative.");
    }

    void setAccHolderName(String accHolderName) {
        if (!accHolderName.trim().isEmpty())
            this.accHolderName = accHolderName;
        else
            System.out.println("Account name cannot be empty.");
    }

    void setInitialBalance(double initialBalance) {
        if (initialBalance > 0)
            this.initialBalance = initialBalance;
        else
            System.out.println("Your initial balance cannot be zero or lesser.");
    }

    //Getters
    long getAccNumber() {
        return accNumber;
    }

    String getAccHolderName() {
        return accHolderName;
    }

    double getInitialBalance() {
        return initialBalance;
    }

    //Methods
    void displayInfo() {
        System.out.println("\n----------------------------");
        System.out.println("Account Number: " + getAccNumber());
        System.out.println("Account Holder: " + getAccHolderName());
        System.out.println("Balance: $" + getInitialBalance());
        System.out.println("----------------------------");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BankAcc userObj = new BankAcc();

        System.out.println("----BANK ACCOUNT---");

        System.out.print("\nEnter Account No: ");
        userObj.setAccNumber(userInput.nextLong());
        userInput.nextLine();

        System.out.print("\nEnter Account Holder Name: ");
        userObj.setAccHolderName(userInput.nextLine().trim());

        System.out.print("\nEnter Initial Balance: ");
        userObj.setInitialBalance(userInput.nextDouble());

        userObj.displayInfo();
    }

}
