package day40_accessmodifiers_final;

public class FinalMethods {

	int x = 10;
	
	public void method1() {
		System.out.println("Method-1");
		
		String x = "Apple";
	}
	
	public static void staticMethod1(String word) {
		System.out.println("Static Method");
	}

	public static void Method2(String word) {
		System.out.println("Static Method");
	}

	public final void method3() {
		System.out.println("Method-1");

		String x = "Apple";
	}

}


class Sub extends FinalMethods{


		@Override
		public void method1() { //As the method1 above is NOT STATIC, you can override it
			System.out.println("Method-1 in subclass");
		}

		public static void staticMethod1(String word) { //As the staticMethod1 is STATIC above, you cannot override it so that here you hide
														//the static staticMethod1 on yourself.
			System.out.println("Static Method in Sub Class");

		}
	

		public static void Method2(String word) { //error: static method can only be hidden to use (so no overridden allowed)
			System.out.println("Static Method in Sub Class");
		}

//		@Override
//		public void method3() { //error: final method3() above cannot be overridden here
//		System.out.println("I cannot override a final method");
//		}
	
}