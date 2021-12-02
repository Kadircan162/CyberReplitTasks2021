package ReplitAssignments2021;

public class MergeString2 {
    public static void main(String[] args) {
        String s1 = "eeder";
        String s2 = "23";
        String result = "";

        outer: for(int i=0; i<s1.length(); i++){
                    result += s1.charAt(i);

                    for( ; i<s2.length(); ){
                        result += s2.charAt(i);

                        if(i+1 != s1.length() && i+1 != s2.length()){
                            continue outer;
                        }else{

                            if(i+1 == s1.length()){
                            result += s2.substring(i+1);
                            break outer;
                            }else if(i+1 == s2.length()){
                            result += s1.substring(i+1);
                            break outer;

                        }
                    }

                }
        }
        System.out.println(result);
    }
}
