package Day27Lab4;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] linear = {6, 8, 10};
        System.out.println("Index of 6 in a Linear array : " + Arrays.binarySearch(linear, 6)); // 0
        System.out.println("*********************************");

        int[] nonLinear = {6, 5, 8};
        System.out.println("Index of 6 in a Non-Linear array : " + Arrays.binarySearch(nonLinear, 6)); // -3
    }
}
