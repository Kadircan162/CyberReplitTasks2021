package ReplitAssignments2021;

public class PrintShortestWord {
    public static void main(String[] args) {
        String[] str = {"java", "cas", "red", "vivid", "remedy", "grace"};

        String smallest = str[0];
        for(String s : str){
            if(smallest.length() > s.length()){
                smallest = s;
            }
        }
        System.out.println(smallest);
    }
}
