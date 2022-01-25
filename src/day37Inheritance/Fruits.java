package day37Inheritance;

public abstract class Fruits {
    String name;

    public Fruits(String name){
        this.name = name;
    }

    public abstract void taste(String s);
}
