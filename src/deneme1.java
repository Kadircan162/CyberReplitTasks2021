public class deneme1 {
    public static void main(String[] args) {
        String s = "10/10/2021 10:10:05";
        System.out.println(s.indexOf('C'));
        System.out.println(s.contains(""+'C'));
        String s1="";
        int i1=0;
        boolean b1 =false;

          String str1 = "Hello planet earth, you are a great planet.";
          String str2 = "";
        System.out.println(str1.charAt(0));
        System.out.println(str1.codePointAt(1));
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println(str1.contentEquals("ddedce"));
        System.out.println(str1.equals("ddedced"));
        System.out.println(str1.contains("ddedced"));
        System.out.println("????????????????????????");
        CharSequence cs1 = "ddecrth";
        StringBuilder sb = new StringBuilder("frghty4edfg");
        StringBuffer sbuffer = new StringBuffer("defgthyjuj");
        System.out.println(cs1.equals("ddecrth"));
        System.out.println(sb.equals("frghty4edfg"));


        System.out.println(str1.lastIndexOf("e",2));
        System.out.println(str2.indexOf(" "));


        System.out.println(str1.contains("f"));
        System.out.println(str2.contains(" "));
        System.out.println("---------------------");
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.substring(2,3));
          System.out.println(str1.substring(str1.indexOf('e'),(str1.indexOf('e')+1)));
          System.out.println(str1.hashCode());
          System.out.println("***************************");
          System.out.println(str1.codePointCount(0,1));
          int i = 55;
            System.out.println(String.valueOf(i) + 10);
             System.out.println(i + 10);
            System.out.println(Integer.toString(i) + 10);

        System.out.println("+++++++++++++++++++++++++++44");

        String str = "Use this string for testing this";
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 's' at last occurance: "+str.lastIndexOf('s'));
        System.out.println("String \"this\" at last occurance: "+str.lastIndexOf("this"));
        /**
         * Returns the last occurance from specified start index,
         * searching backward starting at the specified index.
         */
        System.out.println("first occurance of char 's' from 24th index backwards: "
                +str.lastIndexOf("s",24));
        System.out.println("First occurance of String \"this\" from 26th index backwards: "
                +str.lastIndexOf("this",26));

        System.out.println("////////////////////");

        CharSequence cseq = "Use this that string for that testing this";
        CharSequence newCharSeq = cseq.subSequence(0,3);
        System.out.println(newCharSeq);

        String str3 = "Use this that string for that testing this";
        System.out.println(str3.replaceFirst("this","those"));
        System.out.println(str3.indexOf("this",5));
        System.out.println(str3.lastIndexOf("that",25));
        System.out.println(cseq.codePoints());
        System.out.println(str3.toLowerCase().contains("u"));
        System.out.println(str3);

        String str4 = "Hello";
        System.out.println(str4.getBytes());
        byte b[] = str4.getBytes();
        System.out.println(b);
        for(byte b2 : b){
            System.out.println(b2);
        }
        char c [] = {10,11,12,12,14,15,16,15,34};
        str4.getChars(0,3,c,2);
        System.out.println(c);

    }

    public static void method1() {
        String s2="";
        int i2=0;
        boolean b2 =false;
    }
    public static void method2() {

        String s3="";
        int i2=0;
        boolean b2 =false;
    }

}
