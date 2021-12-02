package day30WrapperClass;

import java.util.Arrays;

public class Task98Decoding {
    public static void main(String[] args) {
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(Decoder(str1));
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        System.out.println(Decoder(str2));
        Boolean[] b = new Boolean[10];

        boolean[] prib = new boolean[5];
        prib[0] = true;
        b[0]=prib[0];

        System.out.println(b[0]);


        Boolean b2 = new Boolean(false);
        b[0] = b2;
        System.out.println(b[0]);
        b2=true;
        System.out.println("****************");
        System.out.println(b[0]);
        b[0] = false;
        System.out.println(b2);
        System.out.println(b[0]);
    }
    public static String Decoder(String s){
        String[] numbers = {"zero","one","two","three","four","five","six","seven","eighth","nine"};
        String letters = "";
        String decode= "";
        String result = "";

        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                letters += s.charAt(i);
            }
        }
        for(int i=0; i<letters.length(); i++){
            decode += letters.substring(i,i+1);
            for(int j=0; j<numbers.length; j++){
                if(decode.equalsIgnoreCase(numbers[j])){
                    result += " " + Integer.toString(j);
                    decode = "";
                    break;
                }
            }

        }
        return result;
    }
}
