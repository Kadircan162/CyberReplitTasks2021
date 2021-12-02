package ReplitAssignments2021;

public class CountJavaVsPython {
    public static void main(String[] args) {
        String str = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.";
        String search1 = "java", search2 = "python";
        int count1 =0, count2 =0;

        for(int i=0; i<=str.length()-search1.length(); i++) {
            if (str.substring(i, i + search1.length()).equals(search1)) {
                count1++;
            }
        }
        for(int i=0; i<=str.length()-search2.length(); i++){
            if(str.substring(i, i+search2.length()).equals(search2)){
                count2++;
            }
        }

        if(count1 == count2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
