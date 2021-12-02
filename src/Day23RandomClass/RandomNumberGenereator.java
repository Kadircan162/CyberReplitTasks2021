package Day23RandomClass;

import java.util.Random;

public class RandomNumberGenereator {
    public static void main(String[] args){
        Random rn = new Random();
        System.out.println(rn.nextLong());
        Random rn1 = new Random(System.currentTimeMillis());
        System.out.println(rn1.nextInt());
        System.out.println(System.currentTimeMillis());
        System.out.println(rn.nextInt(2));
        System.out.println(rn1.nextBoolean());
        System.out.println(rn.nextInt(10)+5);

    }
}
