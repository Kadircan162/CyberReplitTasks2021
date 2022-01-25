package ReplitAssignments2021.tjmax;
/**
 * SubClass of Item
 */
public class OnSaleItem extends Item{

    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
            super(name, quantity, catalogNumber, price);
            this.discount = discount/100;
            setDiscount(this.discount);

    }

    /**
     * getter for discount
     * @return
     */
    public double getDiscount() {
        //TODO
        return discount;
    }

    /**
     * setter for discount
     * @param discount
     */
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

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discount=" + discount + "name=" + super.getName() + "price=" + super.getPrice() +
                '}';
    }

}
