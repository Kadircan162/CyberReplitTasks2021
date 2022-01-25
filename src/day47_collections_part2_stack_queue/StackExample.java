package day47_collections_part2_stack_queue;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.add(10);
        intStack.add(20);
        intStack.add(5);
        intStack.add(250);
        intStack.add(10);
        intStack.add(92);
        System.out.println("intStack = " + intStack);

        System.out.println("intStack.peek() = " + intStack.peek());//peek() method specifically belongs to Stack class
        intStack.pop();//remove the last element added at the top
        System.out.println("intStack.peek() = " + intStack.peek());
        int index = 5;
        try {
            System.out.println("intStack.get(4) = " + intStack.get(index));
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("No element at the index " + index);
            a.printStackTrace();
        }

        Integer[] nums = new Integer[]{4,6,2,8,11};
        intStack.copyInto(nums);
        for (Integer i : nums){
            System.out.println("i = " + i);
        }
        System.out.println("nums[0] = " + nums[0]);

        Vector<Integer> vector = intStack;

        Vector<Integer> vector2 = new Stack<>();
        vector2.add(12);
        vector2.add(34);
        vector2.add(65);
        vector2.add(8);
        vector2.add(332);

        //peek() method specifically belongs to Stack class so we need to down-cast Vector vector2 reference
        System.out.println("((Stack)vector2).peek() = " + ((Stack<Integer>) vector2).peek());
        Stack<Integer> stack2 = (Stack<Integer>) vector2;
        System.out.println("stack2.peek() = " + stack2.peek());
    }
}
