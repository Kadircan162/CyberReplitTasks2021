package day_46_collection_part1;

public class CompareElementsProduct implements Comparable<CompareElementsProduct> {
    private String name;
    private double price;

    public CompareElementsProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(CompareElementsProduct another) {


        if(this.price > another.price){
            return 1;
        }else if(this.price == another.price){
            return 0;
        }else {
            return -1;
        }


        //Same code above with lazy way
       // return Double.compare(this.price, another.price);

    }
}
