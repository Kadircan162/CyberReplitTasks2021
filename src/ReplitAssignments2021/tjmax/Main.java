package ReplitAssignments2021.tjmax;

public class Main {
    public static void main(String[] args) {

        Item regularItem1 = new Item("Cup", 5, 11, 50);
        Item regularItem2 = new Item("Slippers", 3, 12, 15);
        Item regularItem3 = new Item("Hat", 2, 13, 45);
        Item regularItem4 = new Item("Glasses", 5, 14, 105);

        OnSaleItem onSaleItem1 = new OnSaleItem("T-shirt Tiger", 2, 21, 35, 5);
        OnSaleItem onSaleItem2 = new OnSaleItem("Nail Set ", 9, 22, 25, 10);
        OnSaleItem onSaleItem3 = new OnSaleItem("Soccer ball Barcelona", 7, 23, 55, 0);


        TJMaxx tjMaxx = new TJMaxx();

        tjMaxx.addRegularItem(regularItem1);
        tjMaxx.addRegularItem(regularItem2);
        tjMaxx.addRegularItem(regularItem3);
        tjMaxx.addRegularItem(regularItem4);

        tjMaxx.addOnSaleItem(onSaleItem1);
        tjMaxx.addOnSaleItem(onSaleItem2);
        tjMaxx.addOnSaleItem(onSaleItem3);

        System.out.println("tjMaxx.getAllItemNames() = " + tjMaxx.getAllItemNames());
        System.out.println("tjMaxx.getAllItemNames() = " + tjMaxx.getAllItemNames());
        System.out.println("tjMaxx.getItemPrice(21) = " + tjMaxx.getItemPrice(21));
        tjMaxx.getOnSaleItem("Soccer ball Barcelona").setDiscount(10);
        System.out.println("tjMaxx.getItemPrice(23) = " + tjMaxx.getItemPrice(23));

        System.out.println("tjMaxx.getOnSaleItems() = " + tjMaxx.getOnSaleItems());
        tjMaxx.buyItem(21);
        tjMaxx.buyItem(21);
        System.out.println("tjMaxx.getOnSaleItems() = " + tjMaxx.getOnSaleItems());


    }
}
