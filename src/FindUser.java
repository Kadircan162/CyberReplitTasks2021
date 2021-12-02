import java.util.Scanner;

public class FindUser {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        if(fullName.equals("Max Payne")){
            System.out.println("User found!");
        }else if (fullName.equals("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
