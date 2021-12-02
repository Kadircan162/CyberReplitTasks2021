import java.util.Scanner;

public class StartWithStringManipulation {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name with the status: ");
        String input =scan.nextLine();

        if(input.startsWith("Mr.")) {
            System.out.println("Married man");
        }else if (input.startsWith("Mrs.")){
            System.out.println("Married woman");
        }

    }
}
