package day40_accessmodifiers_final;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();

		mouse.getRodentDetails(); //here the child's tailLength variable is hidden
		
		mouse.getMouseDetails();

	}

}