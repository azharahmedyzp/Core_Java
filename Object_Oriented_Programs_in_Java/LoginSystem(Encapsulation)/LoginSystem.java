import java.util.Scanner;

class User{
    private String userName;
    private String userPass;

    //Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    //Getters
    public String getUserName() {
        return userName;
    }
    public String getUserPass() {
        return userPass;
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User userObj = new User();

        System.out.println("------LOGIN SYSTEM------");


        //Registration
        System.out.print("\nRegister - Enter your Username: ");
        String regUserName = in.nextLine().toLowerCase().trim().replaceAll("\\s+", "");
        if (regUserName.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }

        System.out.print("Register - Enter your Password: ");
        String regUserPass = in.nextLine();
        if (regUserPass.isEmpty()) {
            System.out.println("Password cannot be empty.");
            return;
        }


        //storing user info
        userObj.setUserName(regUserName);
        userObj.setUserPass(regUserPass);
        System.out.println("\nRegistration completed successfully!");
        System.out.println("-----------------------------");


        //Login
        System.out.print("\nLogin - Enter your username: ");
        String loginUserName = in.nextLine().toLowerCase().trim().replaceAll("\\s+", "");
        if (loginUserName.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }

        System.out.print("Login - Enter your Password: ");
        String loginUserPass = in.nextLine();
        if (loginUserPass.isEmpty()) {
            System.out.println("Password cannot be empty.");
            return;
        }


        if (userObj.getUserName().equals(loginUserName) && userObj.getUserPass().equals(loginUserPass)) {
            System.out.println("\nLogin successful! Welcome " + userObj.getUserName());
        } else {
            System.out.println("Incorrect username or password.");
        }
        in.close();
    }
}
