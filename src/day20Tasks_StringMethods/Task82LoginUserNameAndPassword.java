package day20Tasks_StringMethods;

import java.util.Scanner;

public class Task82LoginUserNameAndPassword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String userName = scan.nextLine();

        System.out.println("Please enter your username: ");
        String password = scan.nextLine();

        String userNameInDatabase = "Termo";
        String passWordInDatabase = "Sart162!";

        loginFunctionality(userName, password);

    }

    public static void loginFunctionality(String userName, String passWord) {

        if (userName.equals("") && passWord.equals("") || userName.equals(" ") && passWord.equals(" ")) {
            System.out.println("Username and password fields cannot be blank");

        } else if (userName.equals(" ") && !passWord.equals(" ")) {
            System.out.println("Username cannot be blank");

        } else if (!userName.equals(" ") && passWord.equals(" ")) {
            System.out.println("Password cannot be blank");

        } else if (!userName.equals("Termo") || !passWord.contains("Sart162!")) {
            System.out.println("Username or password is not valid. Please verify");

        } else if (userName.contains("Termo") && passWord.contains("Sart162!")) {
            System.out.println("User logged in successfully");
        }
    }
}

