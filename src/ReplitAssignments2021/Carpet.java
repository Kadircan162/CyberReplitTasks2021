package ReplitAssignments2021;

public class Carpet {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet(){
        this.width = 300;
        this.length = 300;
        this.totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }
    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.totalPrice = (width + length) * unitPrice;
        if(isPersian){
            this.totalPrice += 200;
        }
    }


}
