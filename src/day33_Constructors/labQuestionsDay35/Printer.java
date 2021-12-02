package day33_Constructors.labQuestionsDay35;

import java.sql.SQLOutput;
import java.util.*;

public class Printer {
    private int tonerLevel;
    private int numOfPagesInPrinter;
    private boolean isDuplex;
    final int maxTonerCapacity = 100;
    final int maxPageCapacityInTray = 100;

    private Scanner scan = new Scanner(System.in);

    public Printer(){
        this(false);
    }

    public Printer(boolean isDuplex){
        this(isDuplex, 30); //default toner level is given when printer first created
    }

    public Printer(boolean isDuplex, int tonerLevel){
        this(isDuplex, tonerLevel, 30); //default number of pages in printer when first created
    }

    public Printer(boolean isDuplex, int tonerLevel, int numOfPagesInPrinter){
        this.isDuplex = isDuplex;
        setToner(tonerLevel);
        loadPagesInPrinter(numOfPagesInPrinter);
    }

    public void setToner(int tonerLevel) {

        while (tonerLevel == 0 && this.tonerLevel <= 0){
            System.out.print("Not enough toner. Please add toner: "); //Displayed on the printer screen
            tonerLevel = scan.nextInt();
        }

        if(tonerLevel < 0){
            System.out.println("Invalid value!");
            return;
        }

        if(tonerLevel + this.tonerLevel > maxTonerCapacity){
            System.out.print("Toner overloaded. Please decrease toner level to %" + maxTonerCapacity + " and push enter"); //Displayed on the printer screen
            scan.nextLine();
            this.tonerLevel = maxTonerCapacity;
            System.out.println("Toner level is: %" + this.tonerLevel);
        }else{
            this.tonerLevel += tonerLevel;
            System.out.println("Toner level is: %" + this.tonerLevel);
        }

    }

    public void loadPagesInPrinter(int pagesToBeLoaded) {

        while (pagesToBeLoaded == 0 && this.numOfPagesInPrinter <= 0){
            System.out.print("Not enough pages in tray. Please enter number of pages to be loaded: "); //Displayed on the printer screen
            pagesToBeLoaded = scan.nextInt();
        }
        if(pagesToBeLoaded < 0){
            System.out.println("Invalid value!");
            return;
        }
        if(pagesToBeLoaded + numOfPagesInPrinter > maxPageCapacityInTray){
            System.out.print("Tray overloaded and pages jammed! Please take out at least "  + (pagesToBeLoaded + numOfPagesInPrinter - maxPageCapacityInTray) + " page(s) and push enter");
            scan.nextLine();
            numOfPagesInPrinter = maxPageCapacityInTray;
            System.out.println("Number of pages in printer: " + numOfPagesInPrinter);
        }else {
            numOfPagesInPrinter += pagesToBeLoaded;
            System.out.println("Number of pages in printer: " + numOfPagesInPrinter);
        }
    }

    public void print(int numOfCopy){
        int numberOfPagesPrinted = 0;

        do{
            if(numOfPagesInPrinter <= 0){
                loadPagesInPrinter(0);
            }
            if(tonerLevel <= 0){
                setToner(0);
            }
            if(numOfCopy <= 0) break;

            System.out.print("Printing " + (++numberOfPagesPrinted));
            numOfPagesInPrinter--;

            if(isDuplex){
                tonerLevel--;
                tonerLevel--;
            }else{
                tonerLevel--;
            }

            System.out.println(" (Pages left in tray: " + numOfPagesInPrinter + ", Toner level: %" + tonerLevel + ")");

        }while(numberOfPagesPrinted != numOfCopy);

        //if(tonerLevel == -1) tonerLevel = 0; // For duplex, possibility of toner value of -1 is discarded here.

        printReport(numberOfPagesPrinted);

    }

    public void printReport(int numberOfPagesPrinted){
        System.out.println("\n|| Printing Ended ||");
        System.out.println("Total printed page(s): " + numberOfPagesPrinted);
        System.out.println("\nPages left in tray: " + numOfPagesInPrinter);
        System.out.println("Current toner level: %" + tonerLevel);
    }

    public void currentState(){
        System.out.println("Current number of pages in printer: " + numOfPagesInPrinter);
        System.out.println("Current toner level: %" + tonerLevel);
    }

    public int getNumOfPagesInPrinter() {
        return numOfPagesInPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
