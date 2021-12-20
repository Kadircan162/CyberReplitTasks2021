package interviewQuestions;

public class StringEliminateDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("uuaaaabbcccdda")); //return a4b2c3d2a
    }


    public static String removeDuplicates(String str){
        String dummy="";
        char[] ch = str.toCharArray();

        for(int i=0; i< ch.length;) {
            int count=0;
            for(int j=i; j<ch.length; j++){
                if (ch[i] == ch[j]) {
                    count++;
                }else break;
            }
            if(count == 1) dummy += "" + ch[i];
            else dummy += "" + ch[i] + String.valueOf(count);
            i += count;
        }
        return dummy;
    }
}
