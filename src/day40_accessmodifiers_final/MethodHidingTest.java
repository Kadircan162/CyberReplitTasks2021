package day40_accessmodifiers_final;

public class MethodHidingTest {

	static int x = 10;
	static final int y = 20;

	public static void main(String[] args) {}

}

class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
	
}

class Panda extends Bear{
	
	public static void eat() {//hiding static method -- it's similar to overriding but not exactly
		System.out.println("Panda is eating");
	}

//	public void sneeze() {//error: overridden method should be static, too as the same in the parent Bear class
//		System.out.println("Panda is sneezing");
//	}
	
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
	
	
	
	
	
}