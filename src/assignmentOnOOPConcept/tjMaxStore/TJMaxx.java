package assignmentOnOOPConcept.tjMaxStore;

import java.util.*;

public class TJMaxx {

    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    public TJMaxx() {
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    public void addRegularItem(Item item) {
        regularItems.add(item);
    }

    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    public List<Item> getRegularItems() {
        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    public int regularItemsCount() {
        return regularItems.size();
    }

    public int onSaleItemsCount() {
        return onSaleItems.size();
    }

    public List<String> getAllItemNames() {
        List<String> itemsName = new ArrayList<>();

        for (Item item : regularItems) {
            itemsName.add(item.getName());
        }
        for (OnSaleItem item : onSaleItems) {
            itemsName.add(item.getName());
        }
        return itemsName;
    }

    public double getItemPrice(int catalogNumber) {

        for(Item item : regularItems){
            if(item.getCatalogNumber() == catalogNumber){
                return item.getPrice();
            }
        }
        for (OnSaleItem item : onSaleItems){
            if(item.getCatalogNumber() == catalogNumber){
                return item.getPrice();
            }
        }
        return 0.0;
    }

    public OnSaleItem getOnSaleItem(String name) {//filtering on sale items

        for(OnSaleItem item : onSaleItems){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public void removeItem(int catalogNumber) {

        onSaleItems.removeIf(onSaleItem -> onSaleItem.getCatalogNumber() == catalogNumber);
        regularItems.removeIf(regularItem -> regularItem.getCatalogNumber() == catalogNumber);

    }

    public void buyItem(int catalogNumber) {

        for (Item regularItem : regularItems){
            if(regularItem.getCatalogNumber() == catalogNumber){
                int itemQuantity = regularItem.getQuantity();
                regularItem.setQuantity(itemQuantity-1);

                if(regularItem.getQuantity()==0){
                    removeItem(catalogNumber);
                }
                break;
            }
        }

        for (OnSaleItem onSaleItem : onSaleItems){
            if(onSaleItem.getCatalogNumber() == catalogNumber){
                int itemQuantity = onSaleItem.getQuantity();
                onSaleItem.setQuantity(itemQuantity-1);

                if(onSaleItem.getQuantity()==0){
                    removeItem(catalogNumber);
                }
                break;
            }
        }


    }
}