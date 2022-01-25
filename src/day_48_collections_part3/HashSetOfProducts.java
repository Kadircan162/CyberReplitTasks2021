package day_48_collections_part3;

import day_46_collection_part1.CompareElementsProduct;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {


    public static void main(String[] args) {
        Set<CompareElementsProduct> products = new HashSet<>();
        products.add(new CompareElementsProduct("Sony", 435));
        products.add(new CompareElementsProduct("Samsung Note4", 320));
        products.add(new CompareElementsProduct("iPhone11", 500));
        products.add(new CompareElementsProduct("Oppo", 250));

        System.out.println("products = " + products);

        products.forEach(p -> System.out.print(p.getPrice() + " | "));
        System.out.println();
        products.forEach(p -> System.out.print(p.getName() + " | "));

    }


}
