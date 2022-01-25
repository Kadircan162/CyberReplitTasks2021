package assignmentOnOOPConcept;

//Question-1
public class Atts {
    String name;
    String color;
    int amount;


    public String asString() {
        return "Atts{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}

class Test1{
    public static void main(String[] args) {
        Atts a = new Atts();
        a.name = "table";
        a.color = "brown";
        a.amount = 1;
        System.out.println(a.asString());
    }
}
