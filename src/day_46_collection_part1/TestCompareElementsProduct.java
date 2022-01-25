package day_46_collection_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestCompareElementsProduct {

    public static void main(String[] args) {

        CompareElementsProduct[] data = {
                new CompareElementsProduct("Apple", 700),
                new CompareElementsProduct("Samsung", 680),
                new CompareElementsProduct("Xiaomi", 550),
                new CompareElementsProduct("LG", 465),
                new CompareElementsProduct("Huawei", 450),
                };

        List<CompareElementsProduct> productList = new ArrayList<>(Arrays.asList(data));

        CompareElementsProduct c = new CompareElementsProduct("Motorola", 400);
        for (CompareElementsProduct compare : productList) {
            if(compare.compareTo(c) == 1){
                productList.add(c);
                break;//if the break keyword was not put here, it gave exception because of the index shifting
            }
        }
        System.out.println("productList = " + productList);

        CompareElementsProduct c2 = new CompareElementsProduct("Nokia", 350);

        Iterator<CompareElementsProduct> it = productList.listIterator();
        boolean flag = false;
        while (it.hasNext()){
            System.out.println(productList);
            if(it.next().compareTo(c2) == 1){
                it.remove();
                flag = true;
            }
        }
        if(flag){
            productList.add(c2);
        }
        System.out.println("productList = " + productList);
    }
}
