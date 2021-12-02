package Day32ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {
    static GroceryList groceryList = new GroceryList();
    static ArrayList<String> groceryListMain = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {


        printChoices();
        System.out.print("Enter your choice: ");
        int input = scan.nextInt();

        while(input!=6){
            switch (input){
                case 0:
                    printChoices();
                    break;
                case 1:
                    printList(groceryListMain);
                    break;
                case 2:
                    addItem(groceryListMain);
                    break;
                case 3:
                    modifyItem(groceryListMain);
                    break;
                case 4:
                    removeItem(groceryListMain);
                    break;
                case 5:
                    searchItem(groceryListMain);
                    break;
                default:
                    System.out.println("Not a valid choice!");
                    break;
            }
            System.out.print("Enter your choice: ");
            input = scan.nextInt();
            scan.nextLine();
        }

    }
    public static void printChoices(){
        System.out.println("Press");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To search an item from the list.");
        System.out.println("\t6 - To quit the application.");
    }
    public static void printList(ArrayList<String> list){
            System.out.println("You have " + list.size() + " items in your grocery list");
            for(int i=0; i< list.size(); i++){
                System.out.println((i+1) + ". " + list.get(i));
            }
    }
    public static void addItem(ArrayList<String> list){
        System.out.print("Please enter the grocery item: ");
        String item = scan.next();
        scan.nextLine();
        list.add(item);
    }
    public static void modifyItem(ArrayList<String> list){
        System.out.print("Enter item number: ");
        int itemNum = scan.nextInt();
        scan.nextLine();
        if(itemNum > list.size()){
            System.out.println("There is no item with this number");;
        }else{
            System.out.print("Enter replacement item: ");
            String repItem = scan.nextLine();
            list.set(itemNum-1, repItem);
            System.out.println("Grocery item " + itemNum + " has been modified");
        }
    }
    public static void removeItem(ArrayList<String> list){
        System.out.print("Enter item number: ");
        int itemNum = scan.nextInt();
        scan.nextLine();
        if(itemNum > list.size()){
            System.out.println("There is no item with this number");
        }else{
            list.remove(itemNum-1);
        }

    }
    public static void searchItem(ArrayList<String> list){
        System.out.print("Item to search for: ");
        String item = scan.nextLine();
        if(list.contains(item)){
            System.out.println("Found " + item + " in your grocery list");
        }else{
            System.out.println(item + " could not be found in our grocery list");
        }

    }
}
