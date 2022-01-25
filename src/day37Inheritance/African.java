package day37Inheritance;

public class African extends Human{

    String color;
    String language;
    int age = 90;

    @Override
    public String toString() {
        return "African{" +
                "color='" + color + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                '}';
    }
}
