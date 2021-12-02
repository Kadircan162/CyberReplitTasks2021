public class StrinContains {

    public static void main(String[] args) {

        String list = "Appl,pp egg, milk5, breadpm5";
        System.out.println(list.lastIndexOf("Ap"));
        System.out.println(list.lastIndexOf("p", 6)); // search from index 6 and backward
        char c='c';

        if (list.contains("br")) {
            System.out.println("Bread is in the list");
        }

        String word2="java, c++, python, tomcat, eclipse";
        if(word2.contains("c++")){
            System.out.println("Word2 contains c++");
        }else {
            System.out.println("Word2 does not contains c++");
        }
        if(word2.indexOf("c++") != -1){
            System.out.println("Word2 contains c++");
        }else {
            System.out.println("Word2 does not contains c++");
        }


    }
}
