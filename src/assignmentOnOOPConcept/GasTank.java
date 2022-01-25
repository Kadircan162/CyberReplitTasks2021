package assignmentOnOOPConcept;

import java.util.Scanner;

//Question-7
public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double increase){
        if(amount + increase < capacity){
            amount += increase;
        }else {
            amount = capacity;
        }
    }

    public void useGas(double decrease){
        if(amount-decrease > 0){
            amount -= decrease;
        }else {
            amount = 0;
        }
    }

    public boolean isEmpty(){
        if(amount < 0.1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(amount > capacity-0.1){
            return true;
        }
        return false;
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double difference = capacity - amount;
        amount = capacity;
        return difference;
    }

}

class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GasTank gt = new GasTank(in.nextDouble());
        gt.addGas(in.nextDouble());
        System.out.println(gt.isFull());
        gt.useGas(in.nextDouble());
        System.out.println(gt.isEmpty());
        gt.fillUp();
        System.out.println((int)gt.getGasLevel());

    }
}
