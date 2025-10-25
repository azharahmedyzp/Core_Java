# Java OOP Banking System

This Java program demonstrates **Object-Oriented Programming (OOP)** principles, focusing on **encapsulation**.  
It simulates a simple **bank account system**, allowing users to create an account and view their account details.

---

## Program Overview

The program defines a `BankAcc` class with the following **private properties**:

- **`accNumber` (long):** The unique account number for the bank account.  
- **`accHolderName` (String):** The name of the account holder.  
- **`initialBalance` (double):** The starting balance of the account.  

The **public methods** provide controlled access to these properties:

- `setAccNumber(long accNumber)` — Assigns an account number after validating it is positive.  
- `setAccHolderName(String accHolderName)` — Assigns the account holder’s name, ensuring it is not empty.  
- `setInitialBalance(double initialBalance)` — Assigns the initial balance, validating it is positive.  
- `getAccNumber()`, `getAccHolderName()`, `getInitialBalance()` — Retrieve account information.  
- `displayInfo()` — Displays the full account details in a formatted manner.

---

## Concepts Demonstrated

- **Encapsulation:**  
  All account properties are declared as private and accessed only through public getters and setters. This ensures data security and integrity.

- **Input Validation:**  
  The system ensures account numbers are positive, account holder names are not empty, and balances are greater than zero.

- **OOP Structure:**  
  Separates data (the `BankAcc` class) from the main logic (the `BankingSystem` class), modeling real-world bank account objects.

- **User Interaction:**  
  Uses `Scanner` for input, allowing users to enter account details during runtime.

---

## Example Output

----BANK ACCOUNT---

Enter Account No: 987654321

Enter Account Holder Name: Azhar Ahmed

Enter Initial Balance: 50000

----------------------------
Account Number: 987654321
Account Holder: Azhar Ahmed
Balance: $50000.0
----------------------------

---

## Key Features

- Create a bank account with validated account number, name, and initial balance  
- Encapsulated class design with getters and setters  
- Display account information in a clean format  
- Beginner-friendly demonstration of OOP principles  

---

## Author

**Azhar Ahmed Pathan**
