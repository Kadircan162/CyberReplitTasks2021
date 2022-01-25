package day_46_collection_part1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample{

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();//Both ArrayList and LinkedList classes are implementing abstract methods from List
                                                    //interface but their implementations are very different inside their own code
        List<Integer> numList2 = new LinkedList<>();//So, their add methods are differently implemented inside their class.
        numList2.add(100);
        numList2.add(55);
        numList2.add(75);
        numList2.add(125);
        numList2.add(50000);

        ((LinkedList<Integer>)numList2).getFirst();//getFirst() method belongs specifically to LinkedList method so casted here to LinkedList reference
        System.out.println("numList2.get(3) = " + numList2.get(3));
        LinkedList<Integer> linkedList = (LinkedList) numList2;

        numList2.get(0);//Both ArrayList and LinkedList have get() method but codings are different
        linkedList.get(0);


        System.out.println(linkedList);
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());//getFirst specifically belongs to LinkedList implemented from Deque interface

        linkedList.addFirst(2500);
        linkedList.addFirst(400);
        linkedList.addLast(1);
        ((LinkedList<Integer>) numList2).addLast(222);


        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("((LinkedList)numList2).getFirst() = " + ((LinkedList<?>) numList2).getFirst());

        System.out.println("numList2 = " + numList2);
        System.out.println("linkedList = " + linkedList);//Both numList2 and linkedList references address the same LinkedList object

    }
}
