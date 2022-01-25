package day40_accessmodifiers_final;

public class Child extends Parent {
	
	public int x = 200; //here the x variable is hidden: We cannot override an instance variable, but we can hide it.
						//x variable is not necessarily to have the same access modifies or signature. Having the same name
						//is enough to make it hidden.

	public static void main(String[] args) {
		System.out.println(z);
	}
	public void m1(){
		System.out.println(y);
	}

}