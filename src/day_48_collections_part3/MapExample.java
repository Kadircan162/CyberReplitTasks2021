package day_48_collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    private static List<Integer> itemsArrList;
    private static Map<String, Double>  itemsHasMapList;

    public static void main(String[] args) {

        itemsArrList = new ArrayList<>();
        itemsArrList.add(10);
        System.out.println("items1.get(0) = " + itemsArrList.get(0));

        itemsHasMapList = new HashMap<>();
        itemsHasMapList.put("iPhone", 500.45);
        itemsHasMapList.put("Samsung", 450.75);
        itemsHasMapList.put("Xiaomi", 900.75);
        itemsHasMapList.put("Oppo", 250.75);
        itemsHasMapList.put("Nokia", 450.75);
        itemsHasMapList.put("Samsung", 550.95); //here the Samsung item is updated with a new price, so duplicates are not allowed in HashMap

        System.out.println("items2.size() = " + itemsHasMapList.size());
        System.out.println("items2.toString() = " + itemsHasMapList);
        System.out.println("items2.isEmpty() = " + itemsHasMapList.isEmpty());
        System.out.println("items2.get(\"Oppto\") = " + itemsHasMapList.get("Oppo"));
        System.out.println("items2.get(\"Samsung\") = " + itemsHasMapList.get("Samsung"));

        itemsHasMapList.remove("Samsung");
        System.out.println("items2 = " + itemsHasMapList);
        System.out.println("Samsung is there in the list2?: " + itemsHasMapList.containsKey("Samsung"));
        itemsHasMapList.replace("Nokia", 525.45);//replace() method does partially the same thing what put() method does
        System.out.println("items2 = " + itemsHasMapList);
        itemsHasMapList.replace("Telestar", 125.95);//if there is no matching value inside the list, nothing happens with replace() method
        System.out.println("items2 = " + itemsHasMapList);
        itemsHasMapList.put("Telestar", 545.0);
        System.out.println("items2 = " + itemsHasMapList);

        //increase old price of an item with a new price
        System.out.println("Before increasing price of Oppo" + itemsHasMapList.get("Oppo"));
        itemsHasMapList.replace("Oppo", itemsHasMapList.get("Oppo") + 55.0);
        System.out.println("After increasing price of Oppo" + itemsHasMapList.get("Oppo"));

        itemsHasMapList.replace("Xiaomi", 900.75, 660.65);//old value of an item (key) should be matching with current value
        System.out.println("itemsHasMapList = " + itemsHasMapList);

    }

    public static List<Integer> getItemsArrList() {
        return itemsArrList;
    }

    public static void setItemsArrList(List<Integer> itemsArrList) {
        MapExample.itemsArrList = itemsArrList;
    }

    public static Map<String, Double> getItemsHasMapList() {
        return itemsHasMapList;
    }

    public static void setItemsHasMapList(Map<String, Double> itemsHasMapList) {
        MapExample.itemsHasMapList = itemsHasMapList;
    }
}
