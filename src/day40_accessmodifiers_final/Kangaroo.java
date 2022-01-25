package day40_accessmodifiers_final;

public class Kangaroo extends Marsupial {
	

//	@Override
//	public boolean isBiped() {
//		return true;
//	}

	
	
	public static boolean isBiped() {//hidden method by defining it static
		return true;
	}
	
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:" + isBiped());

	}

}