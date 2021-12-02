package Day32ArrayList;

import java.util.ArrayList;

public class GroceryList {
    public static void printList(ArrayList<String> list){
        if(list.isEmpty()){
            System.out.println("You have 0 items in your grocery list");
        }else{
            for(int i=0; i< list.size(); i++){
                System.out.println(i+1 + ". " + list.get(i));
            }
        }
    }
}
