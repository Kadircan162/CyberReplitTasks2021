package day_47_collection_part2;

import java.util.*;

public class QueueExample {


    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mike");
        queue.add("Camal");
        queue.add("Micheal");
        queue.add("Mert");
        queue.add("Ozzy");
        queue.add("Ozzy");
        queue.add("Ozzy");
        System.out.println("queue = " + queue);
        String name = queue.peek();//peek() method implemented from Queue interface, and it returns FIFO (First In First Out)
        System.out.println("name = " + name);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        try {
            queue.remove();
        }catch (NoSuchElementException n){
            System.out.println("No elements left");
        }
        queue.add("Ziya");
        System.out.println("After removing the first added element: " + queue);
        System.out.println("((List<String>) queue).get(0) = " + ((List<String>) queue).get(0));
        queue.poll();//poll() method is similar to remove() method except it returns empty list if the queue is empty while remove() method
                    //throws NoSuchElement exception
        queue.poll();
        queue.poll();
        System.out.println("queue = " + queue);

        queue.add("Mike");
        queue.add("Camal");
        queue.add("Micheal");
        queue.add("Mert");
        queue.add("Ozzy");


        System.out.println("((List<String>) queue).get(1) = " + ((List<String>) queue).get(1));

        List<String> list = new Stack<>();
        list.addAll(queue);
        System.out.println("list = " + list);
        System.out.println("((Stack<String>)list).peek() = " + ((Stack<String>) list).peek());//here the peek() method belongs Stack class
                                                                //and it returns LIFO (Last In First Out)


    }
}
