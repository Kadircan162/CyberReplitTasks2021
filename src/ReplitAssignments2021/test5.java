package ReplitAssignments2021;

public class test5 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("a1b2c3"));
    }

    public static int sumOfDigits (String str) { // str = "a1b2c3";
        int sumOfDigits = 0;

           char[] c = str.toCharArray();

           for(char each : c){
               if(Character.isDigit(each)){
                   sumOfDigits += Integer.parseInt(Character.toString(each));
               }
           }

        return sumOfDigits;
    }
}
