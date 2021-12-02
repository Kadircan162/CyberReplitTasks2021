public class StringReplaceManupulation {

    public static void main(String[] args){

        String str = "Ebay is a very good market website";
        String replaced = str.replace("Ebay", "Amazon");

        System.out.println(replaced);

        System.out.println(str);

        System.out.println("****************");

        str = str.replace("very", "so").replace("website", "environment");
        System.out.println(str);

        String result = "About 337";

       // String searchResult = result.replace("", "");
        //searchResult = searchResult.replace(" results (0.82 seconds", "");
        System.out.println(result);
        String result2 = result.replace("About ", "").replace(",", "").replace(" results (0.82 seconds)", "");
        long number = Integer.parseInt(result2);
        System.out.println(number);
        System.out.println("-------------------------------");

        System.out.println(result);
        System.out.println("Extract numbers: " + replaced.replaceAll("[0-9]", ""));
        System.out.println("Extract literals: " + replaced.replaceAll("[^0-9]", ""));

        String output1 = "The page is not found 404";
        System.out.println("Number part: " + output1.replaceAll("[^0-9]", ""));

    }
}
