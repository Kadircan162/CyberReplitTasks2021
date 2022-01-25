package assignmentOnOOPConcept;

import java.util.Scanner;

//Question-8
public class Value {
    int val;
    boolean modified;

    public Value(){

    }
    public Value(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public boolean wasModified() {
        return modified;
    }

    public void setVal(int val) {
        if(this.val != val){
            this.val = val;
            modified = true;
        }
    }
}

class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }
}