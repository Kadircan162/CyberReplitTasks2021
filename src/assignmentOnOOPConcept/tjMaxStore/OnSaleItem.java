package assignmentOnOOPConcept.tjMaxStore;

public class OnSaleItem extends Item{

    private double discount;

    public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
        super(name, quantity, catalogNumber, price);
        this.discount = discount/100;
        setDiscount(this.discount);

    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount/100;
        if(this.discount > 0){
            double priceBeforeDiscount = getPrice();
            double priceAfterDiscount = priceBeforeDiscount - priceBeforeDiscount*this.discount;
            if(priceAfterDiscount>0){
                setPrice(priceAfterDiscount);
            }else {
                setPrice(1);
            }

        }
    }

    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discount=" + discount + "name=" + super.getName() + "price=" + super.getPrice() +
                '}';
    }

}
