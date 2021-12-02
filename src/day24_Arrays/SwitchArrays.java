package day24_Arrays;

public class SwitchArrays {
    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8};
        int[] odd = {1, 3, 5, 7};
        changeElements(even);
        changeElements(odd);
        int i[]=new int[3];
        for (int evens : even){
            System.out.print(evens + " ");
        }
        System.out.println();
        for (int odds : odd){
            System.out.print(odds + " ");
        }
    }
    public static void changeElements(int[] in){
        in[0] = 100;
    }
}
