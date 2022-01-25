package AllTestsHere;


public class NestedStaticClassExample {

        private static String str = "Javatpoint";
        //nested class which is a Static class

        public static class StaticDemo {
            //non-static method of Static class
            public void show()
            {
                System.out.println(str);
            }
        }

        public static void main(String args[])
        {
            NestedStaticClassExample.StaticDemo obj = new StaticDemo();
            obj.show();
        }

}


