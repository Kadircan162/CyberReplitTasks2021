package day33_Constructors;

public class Mouse {
    int numTeeth;
    int numWhiskers;
    int weight;

    public Mouse(int weight) {
        this(35, weight); //constructor chaining
        this.weight = weight; //useless code
    }

    public Mouse(int numTeeth, int weight) {
        this(numTeeth, 20, weight); //constructor chaining
        this.numTeeth = numTeeth;
        this.weight = weight; //useless code
    }

    public Mouse(int numTeeth, int numWhiskers, int weight) {
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
        this.weight = weight;
    }
    public void print(){
        System.out.println(weight + " " + numTeeth + " " +numWhiskers);
    }

}
