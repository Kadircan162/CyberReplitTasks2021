package day30WrapperClass;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String s = "apple.com";
        String[] str = s.split("\\.");
        System.out.println(Arrays.toString(str));




        Integer i = new Integer(345);
        int j = new Integer(567);
        System.out.println(i);
        System.out.println(j);
        int k= 567;

        Integer kl = new Integer(546);


        Integer kkl = 987;


        System.out.println(kkl);

        Boolean b1 = new Boolean(true);

        boolean b2 = b1;

        System.out.println(b2);
        b2 = new Boolean(false);

        System.out.println(b2);


        int count1 = Integer.valueOf(345);
        System.out.println(count1);


        Integer count2wr = new Integer(678);
        System.out.println(count2wr);

        count2wr = count1;
        System.out.println(count2wr);

        count1 = count2wr;
        System.out.println(count1);
        Integer count3wr = Integer.valueOf(245);
        System.out.println(count3wr);

        Integer count4wr = new Integer(245);
        System.out.println(count3wr);





    }
}
