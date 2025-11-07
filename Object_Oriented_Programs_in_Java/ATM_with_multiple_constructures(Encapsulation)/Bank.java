class BankAccount {
    private String name;
    private double balance;


    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }


     public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Added: $" + amount);
        } else {
            System.out.println("Can't add negative money");
        }
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Can't take negative money");
        } else if(amount <= balance) {
            balance -= amount;
            System.out.println("Took: $" + amount);
        } else {
            System.out.println("Can't take $" + amount + " - only have $" + balance);
        }
    }

    public void show() {
        System.out.println(name + " has $" + balance);
    }
}

public class Bank {
    public static void main(String[] args) 

        BankAccount person1 = new BankAccount("Alex");
        BankAccount person2 = new BankAccount("Sam", 500);

        
        person1.show();
        person2.show();

      
        person1.deposit(200);
        person1.show();

        person1.deposit(-50); 
        person1.show();

        person2.withdraw(100);
        person2.show();

        person2.withdraw(-20); 
        person2.show();

        person2.withdraw(600); 
        person2.show();
    }
}