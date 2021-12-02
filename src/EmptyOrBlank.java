public class EmptyOrBlank {
    public static void main(String[] args) {
        String string1 = null;
        String string2 = "s";
        String s = "slmfrfr";

        char c ='1';
        int charDecimal = s.codePointBefore(1);
        int charPointCheck = 'r';
        System.out.println(s.equals("hell"));
        StringBuffer sb = new StringBuffer("s");
        System.out.println(s.contentEquals(sb));
        System.out.println(s.contentEquals(""+'c'));
        System.out.println(s.endsWith(""+'l'));
        System.out.println();

        String name="a";
        char c1 = 'a';
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
        String sf4=String.format("value is %c",c1);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
        System.out.println(name.hashCode());

        String Str = new String("Welcome to Tutorialsfrwedee Tutorialspoint.com ");

        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));

        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("Tut", "AMROOD"));

        System.out.println(s.replace("lm", "tr"));
        System.out.println(s.replaceAll("lm", "tr"));

        String myString = "__123_2____3__6_345____0";

        String regex = "\\d";
        String replacement = "x";

        String newString = myString.replaceAll(regex, replacement);
        System.out.println(newString);

        String Str1 = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(0, 10) );

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(10, 15) );

        String Str2 = Str1.substring(0,10);
        System.out.println(Str2);
        CharSequence cs = Str1.subSequence(0,10);
        System.out.println(cs);

        CharSequence cs1= "abcd";
        System.out.println(cs1.subSequence(0,2).charAt(0));

        String str5 = new String("fedecevegtrgtg");
        String str6 = str5;
        System.out.println(str5);
        System.out.println(str6);





//        System.out.println(charDecimal);
//        System.out.println(charPointCheck);
//
//        System.out.println();
//        System.out.println(c);
//        System.out.println(s.charAt(3));

////        if (s.isBlank()) {
////            if (s.isBlank()) {
////                if (s.isBlank()) {
////                    if (s.isBlank()) {
////                        if (s.isBlank()) {
//                            System.out.println("String2 is: Empty");
//                            return;
//                        } else if (string1.isBlank()) {
//                            System.out.println("String2 is: Blank");
//
//                        }
//                    }
//
//                    }
    }
}