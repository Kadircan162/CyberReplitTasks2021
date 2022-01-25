package day40_accessmodifiers_final;

public class Marsupial extends MethodHidingTest{
	
	/*
	public boolean isBiped() {
		return false;
	}
	*/
	static final int y = 30;
	static int x =45;
	public static boolean isBiped() {

		return false;
	}
	
	
	public void getMarsupialDescription() {
		System.out.println(y);
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}

}