package ReplitAssignments2021;

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
        return amount < 0.1;
    }
    public boolean isFull(){
        return amount > capacity - 0.1;
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
