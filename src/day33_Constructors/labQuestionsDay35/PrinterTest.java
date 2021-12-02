package day33_Constructors.labQuestionsDay35;

import java.util.Scanner;

public class PrinterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer(); // Default features of printer --> isDuplex: false, toneLevel: 30, numOfPagesInPrinter: 30
        //Printer printer = new Printer(true); // Dublex state is given
        //Printer printer = new Printer(true, 120); // Dublex state and toner level is given
        //Printer printer = new Printer(true, 30, 20);

        boolean flag = true;
        while (flag){
            printerMenu();
            printer.currentState();
            System.out.print("Please choose an option: ");
            int choiceFromMenu = scan.nextInt();

            switch (choiceFromMenu){
                case 1:
                    System.out.print("\nPlease enter number of copies to print: ");
                    printer.print(scan.nextInt());
                    break;
                case 2:
                    System.out.print("\nPlease enter number of pages to load: ");
                    printer.loadPagesInPrinter(scan.nextInt());
                    break;
                case 3:
                    System.out.print("\nPlease enter toner level to load: ");
                    printer.setToner(scan.nextInt());
                    break;
                case 4:
                    printer.currentState();
                    break;
                case 5:
                    System.out.println("\nPrinter stopped.");
                    flag = false;
                    break;
            }
        }

    }
    public static void printerMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPrinter Menu");
        System.out.println("---------------");
        System.out.println("1.Print\n2.Load pages\n3.Load toner\n4.Current pages and toner in printer \n5.Exit");
        System.out.println();

    }

}
