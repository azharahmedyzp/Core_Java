# Java OOP Login System

This Java program demonstrates **Object-Oriented Programming (OOP)** principles, focusing on **encapsulation**.  
It simulates a simple user **registration and login system**, where credentials are securely stored and validated through getter and setter methods.

---

## Program Overview

The program defines a `User` class with the following **private properties**:

- **`userName` (String):** The unique identifier for a user. Automatically normalized to lowercase and stripped of spaces to ensure consistency.  
- **`userPass` (String):** The user’s password, stored privately and accessed through getter/setter methods.  

The **public methods** provide controlled access to these properties:

- `setUserName(String userName)` — Assigns a username with validation and normalization.  
- `setUserPass(String userPass)` — Assigns a password ensuring it is not empty.  
- `getUserName()` / `getUserPass()` — Retrieve user credentials for authentication during login.

---

## Concepts Demonstrated

- **Encapsulation:**  
  Both `userName` and `userPass` are declared as private, accessible only via public methods. This prevents direct modification and protects user data.

- **Input Validation:**  
  The system ensures usernames and passwords are not empty and normalizes input (lowercase, trimmed, and without spaces).

- **Data Handling:**  
  String methods like `.toLowerCase()`, `.trim()`, and `.replaceAll()` ensure consistent input for accurate login verification.

- **OOP Structure:**  
  The program separates data (in the `User` class) from logic (in the `LoginSystem` main class), modeling real-world object interactions.

---

## Example Output

------LOGIN SYSTEM------

Register - Enter your Username: admin
Register - Enter your Password: admin@123

Registration completed successfully!
-----------------------------

Login - Enter your username: admin
Login - Enter your Password: admin@123

Login successful! Welcome admin


---

## Key Features

- Register and log in securely using stored credentials  
- Case-insensitive usernames with spaces automatically removed  
- Clear input validation and feedback messages  
- Simple, beginner-friendly code demonstrating OOP encapsulation  

---

## Author

**Azhar Ahmed Pathan** 