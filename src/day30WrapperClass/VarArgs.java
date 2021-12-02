package day30WrapperClass;

public class VarArgs {
    public static void main(String[] args) {
        sum(1,3,5);
        char c = 'ö';

    }
    public static void sum(int... nums){
        int total=0;
        for(int i : nums){
            total += i;
        }
        System.out.println(total);
    }
}
