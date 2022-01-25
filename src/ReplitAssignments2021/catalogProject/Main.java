package ReplitAssignments2021.catalogProject;

public class Main {

    public static void main(String[] args) {
        Catalog ctl = new Catalog();
        ctl.loadItems();
        ctl.loadPrices();
        ctl.loadMonthlyPayments();

        System.out.println(ctl.items.toString());
        System.out.println(ctl.prices.toString());
        System.out.println(ctl.monthlyPayments.toString());

        Catalog ctl2 = new Catalog();

        System.out.println("========loadWholeCatalog==========");
        ctl2.loadWholeCatalog();

        System.out.println("========getWholeCatalog==========");
        System.out.println(ctl2.getWholeCatalog().toString().trim());

        System.out.println("========getItemDetails==========");
        System.out.println(ctl2.getItemDetails("iPhone X"));

        System.out.println("========getItemsLessThanAMonthlyPrice==========");
        System.out.println(ctl2.getItemsLessThanAMonthlyPrice(430));

        System.out.println("===============updatePrice================");
        System.out.println(ctl2.getItemDetails("MacbookPro"));
        ctl2.updatePrice("MacbookPro", 60);
        System.out.println(ctl2.getItemDetails("MacbookPro"));

        System.out.println("===============deleteItemFromCatalog================");
        System.out.println(ctl2.getWholeCatalog());
        ctl2.deleteItemFromCatalog("Dyson Vacuum");
        System.out.println(ctl2.getWholeCatalog());

    }
}
