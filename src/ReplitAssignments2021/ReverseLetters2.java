package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseLetters2 {

	public static void main(String[] args) {
		String s="Ab,c,de!$";

		ArrayList <String> list=new ArrayList<>();
		ArrayList <String> listLetter=new ArrayList<>();
		ArrayList <Integer> index=new ArrayList<>();
		
		for(int i=0; i<s.length();i++) {
			list.add(""+s.charAt(i));
			if(Character.isLetter(s.charAt(i))) {
				listLetter.add(""+s.charAt(i));
				index.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listLetter);
		
		Collections.reverse(listLetter);
		
		System.out.println(listLetter);
		System.out.println(index);

		for(int i=0; i<index.size(); i++ ) {
			list.set(index.get(i), listLetter.get(i));
		}
		String finall="";
		for(int i=0; i<list.size();i++) {
			finall+=list.get(i);
		}
		System.out.println(finall);
	}


}
