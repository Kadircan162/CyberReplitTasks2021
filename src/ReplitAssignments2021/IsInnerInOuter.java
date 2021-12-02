package ReplitAssignments2021;

public class IsInnerInOuter {
    public static void main(String[] args) {
        int[] inner = {2,4, 7};
        int[] outer = {4,5 , 7,2};

        boolean innerInOuter = false;
        int i=0;
   outer: for(int in : inner){
            i++;
            int j=0;
            for(int out : outer){
                j++;
                if(in == out){
                    innerInOuter = true;
                    break;
                }else if(i == outer.length || j == outer.length){
                   innerInOuter = false;
                   break outer;
                }
            }
        }
        System.out.println(innerInOuter);
    }
}
